package com.gmail.mateendev3.allnetworkpackages.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.gmail.mateendev3.allnetworkpackages.R;
import com.gmail.mateendev3.allnetworkpackages.adapter.InternetPackageAdapter;
import com.gmail.mateendev3.allnetworkpackages.contract.SimDataProvider;
import com.gmail.mateendev3.allnetworkpackages.data.JazzWaridDataProvider;
import com.gmail.mateendev3.allnetworkpackages.data.PTCLDataProvider;
import com.gmail.mateendev3.allnetworkpackages.data.TelenorDataProvider;
import com.gmail.mateendev3.allnetworkpackages.data.UfoneDataProvider;
import com.gmail.mateendev3.allnetworkpackages.data.ZongDataProvider;
import com.gmail.mateendev3.allnetworkpackages.database.DBHelper;
import com.gmail.mateendev3.allnetworkpackages.model.Package;

import java.util.List;

public class FavoritePackagesActivity extends AppCompatActivity {

    //declaring and initializing members
    private InternetPackageAdapter mAdapter;
    private List<Package> packageList;
    private DBHelper mHelper;

    private RecyclerView rvFavoritePackages;
    private ConstraintLayout clRootFavoritePackages;
    public static final String GOTO_ID = "com.gmail.mateendev3.allnetworkpackages.activity.goto.id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //method invoked to check which activity opened this activity.
        checkPioneerActivity();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_packages);

        //method invoked to initializing views and members.
        initViewsAndMembers();
    }

    /**
     * method to check which Activity launched this activity and set Theme and
     * title according to that.
     * Also create respective data provider object according to pioneer activity.
     */
    private void checkPioneerActivity() {
        //checking if the launching/pioneer activity is Ufone or Telenor or Jazz/Warid or Zong or PTCL
        //and designing the activity according to it
        if (isActivityName(UfoneActivity.GOTO)) {
            setTheme(R.style.UfoneTheme);
            setTitle("Ufone Fav Packages");
        } else if (isActivityName(TelenorActivity.GOTO)) {
            setTheme(R.style.TelenorTheme);
            setTitle("Telenor Fav Packages");
        } else if (isActivityName(ZongActivity.GOTO)) {
            setTheme(R.style.ZongTheme);
            setTitle("Zong Fav Packages");
        } else if (isActivityName(JazzWaridActivity.GOTO)) {
            setTheme(R.style.JazzWaridTheme);
            setTitle("Jazz | Warid Fav Packages");
        } else if (isActivityName(PTCLActivity.GOTO)) {
            setTheme(R.style.PTCLTheme);
            setTitle("PTCL Fav Packages");
        }
    }

    /**
     * method to initialize views and members
     */
    private void initViewsAndMembers() {

        mHelper = new DBHelper(this);
        clRootFavoritePackages = findViewById(R.id.cl_root_favorite_packages);
        rvFavoritePackages = findViewById(R.id.rv_fav_packages);


        //method invoked to set data to the dataList according to the activity
        //who launched this one as this activity
        //Also setting bg color according to pioneer activity
        setDataToListAndBGToCL();

        //setting recycler view
        setRV();
    }


    /**
     * method to set data to list according to pioneer/launcher activity.
     * Also setting BG color according to the pioneer activity.
     * e.g. Red for jazz, sky for telenor etc
     */
    private void setDataToListAndBGToCL() {
        if (isActivityName(UfoneActivity.GOTO)) {
            clRootFavoritePackages.setBackgroundColor(ContextCompat.getColor(this, R.color.ufone_orange));
            try {
                packageList = mHelper.getPackages("SELECT * FROM " + Package.TABLE_NAME_UFONE);
            } catch (Exception e) {
                Toast.makeText(this, "No data found, Sorry", Toast.LENGTH_SHORT).show();
            }
        } else if (isActivityName(TelenorActivity.GOTO)) {
            clRootFavoritePackages.setBackgroundColor(ContextCompat.getColor(this, R.color.telenor_light_sky));
            try {
                packageList = mHelper.getPackages("SELECT * FROM " + Package.TABLE_NAME_TELENOR);
            } catch (Exception e) {
                Toast.makeText(this, "No data found, Sorry", Toast.LENGTH_SHORT).show();
            }
        } else if (isActivityName(ZongActivity.GOTO)) {
            clRootFavoritePackages.setBackgroundColor(ContextCompat.getColor(this, R.color.zong_green));
            try {
                packageList = mHelper.getPackages("SELECT * FROM " + Package.TABLE_NAME_ZONG);
            } catch (Exception e) {
                Toast.makeText(this, "No data found, Sorry", Toast.LENGTH_SHORT).show();
            }
        } else if (isActivityName(JazzWaridActivity.GOTO)) {
            clRootFavoritePackages.setBackgroundColor(ContextCompat.getColor(this, R.color.jazz_light_red));
            try {
                packageList = mHelper.getPackages("SELECT * FROM " + Package.TABLE_NAME_JAZZ_WARID);
            } catch (Exception e) {
                Toast.makeText(this, "No data found, Sorry", Toast.LENGTH_SHORT).show();
            }
        } else if (isActivityName(PTCLActivity.GOTO)) {
            clRootFavoritePackages.setBackgroundColor(ContextCompat.getColor(this, R.color.ptcl_green_dark));
            try {
                packageList = mHelper.getPackages("SELECT * FROM " + Package.TABLE_NAME_PTCL);
            } catch (Exception e) {
                Toast.makeText(this, "No data found, Sorry", Toast.LENGTH_SHORT).show();
            }
        }
    }

    /**
     * method to set data, adapter, layoutManager etc to RecyclerView
     */
    private void setRV() {
        mAdapter = new InternetPackageAdapter(packageList, this);
        rvFavoritePackages.setLayoutManager(new LinearLayoutManager(this));
        rvFavoritePackages.setAdapter(mAdapter);
    }


    /**
     * method to check that which activity launched this activity
     * As we know that every sim activity have a different GOTO value. so we are
     * using that here to compare that.
     * We are checking this by comparing GOTO value of every SIM activity to
     * our GOTO value.
     *
     * @param activityGOTO final String in that activity who started this activity
     * @return true if the coming intent has same goto value as that in parameter goto value
     * else return false
     */
    private boolean isActivityName(String activityGOTO) {
        return getIntent().getStringExtra(GOTO_ID).equals(activityGOTO);
    }


    //below method are used to find parent activity (the activity who launched) this
    //activity and create an intent for that so when user presses back navigation button
    //So that appropriate activity should open who launched this one.

    /**
     * method to dynamically set parent activity for support library.
     *
     * @return intent to take us to the parent activity who opened this activity.
     */
    @Override
    public Intent getSupportParentActivityIntent() {
        return getParentActivityIntentImpl();
    }

    /**
     * method to dynamically set parent activity
     *
     * @return intent to take us to the parent activity who opened this activity.
     */
    @Override
    public Intent getParentActivityIntent() {
        return getParentActivityIntentImpl();
    }

    /**
     * method to get intent of that activity which launched this activity. So if user presses back
     * navigation button, so the intent will open (close this activity and open) previous (parent)
     * activity who started this activity.
     *
     * @return intent of the parent activity.
     */
    private Intent getParentActivityIntentImpl() {
        Intent intent = null;
        if (isActivityName(UfoneActivity.GOTO))
            intent = getIntent(UfoneActivity.class);
        else if (isActivityName(TelenorActivity.GOTO))
            intent = getIntent(TelenorActivity.class);
        else if (isActivityName(ZongActivity.GOTO))
            intent = getIntent(ZongActivity.class);
        else if (isActivityName(JazzWaridActivity.GOTO))
            intent = getIntent(JazzWaridActivity.class);
        else if (isActivityName(PTCLActivity.GOTO))
            intent = getIntent(PTCLActivity.class);
        return intent;
    }

    /**
     * Intent of the parent activity.
     *
     * @param cls class of parent (maybe previous) activity.
     * @return intent of the parent activity.
     */
    private Intent getIntent(Class<?> cls) {
        Intent intent;
        intent = new Intent(this, cls);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        return intent;
    }


    /*********** Handling menu ************/

    /**
     * method to inflate options menu to activity
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.delete_package_menu, menu);
        return true;
    }

    /**
     * method to handle click on options menu
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.nav_item_delete) {
            boolean isDeleted = false;
            if (isActivityName(UfoneActivity.GOTO)) {
                isDeleted = mHelper.deletePackages(Package.TABLE_NAME_UFONE);
            } else if (isActivityName(TelenorActivity.GOTO)) {
                isDeleted = mHelper.deletePackages(Package.TABLE_NAME_TELENOR);
            } else if (isActivityName(ZongActivity.GOTO)) {
                isDeleted = mHelper.deletePackages(Package.TABLE_NAME_ZONG);
            } else if (isActivityName(JazzWaridActivity.GOTO)) {
                isDeleted = mHelper.deletePackages(Package.TABLE_NAME_JAZZ_WARID);
            } else if (isActivityName(PTCLActivity.GOTO)) {
                isDeleted = mHelper.deletePackages(Package.TABLE_NAME_PTCL);
            }

            if (isDeleted) {
                Toast.makeText(this, "Deleted Successfully", Toast.LENGTH_SHORT).show();
                packageList.removeAll(packageList);
                mAdapter.setPackageList(packageList);
                mAdapter.notifyDataSetChanged();
            }
            else
                Toast.makeText(this, "No packages available to delete.", Toast.LENGTH_SHORT).show();

            return true;
        } else
            return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        mHelper.close();
        super.onDestroy();
    }
}