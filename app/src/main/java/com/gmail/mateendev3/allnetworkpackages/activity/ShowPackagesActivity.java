package com.gmail.mateendev3.allnetworkpackages.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.gmail.mateendev3.allnetworkpackages.R;
import com.gmail.mateendev3.allnetworkpackages.adapter.InternetPackageAdapter;
import com.gmail.mateendev3.allnetworkpackages.contract.SimDataProvider;
import com.gmail.mateendev3.allnetworkpackages.data.JazzWaridDataProvider;
import com.gmail.mateendev3.allnetworkpackages.data.PTCLDataProvider;
import com.gmail.mateendev3.allnetworkpackages.data.TelenorDataProvider;
import com.gmail.mateendev3.allnetworkpackages.data.UfoneDataProvider;
import com.gmail.mateendev3.allnetworkpackages.data.ZongDataProvider;
import com.gmail.mateendev3.allnetworkpackages.model.Package;

import java.util.List;

public class ShowPackagesActivity extends AppCompatActivity {

    //declaring and initializing members
    private InternetPackageAdapter mAdapter;
    private List<Package> packageList;

    private RecyclerView rvShowPackages;
    private ConstraintLayout clRootShowPackages;
    public static final String GOTO_ID = "com.gmail.mateendev3.allnetworkpackages.activity.goto.id";
    public static final String ACTIVITY_LL_NO = "com.gmail.mateendev3.allnetworkpackages.activity.no";

    //__declaring data provider members
    private TelenorDataProvider mTelenorDataProvider;
    private UfoneDataProvider mUfoneDataProvider;
    private JazzWaridDataProvider mJazzWaridDataProvider;
    private ZongDataProvider mZongDataProvider;
    private PTCLDataProvider mPTCLDataProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //method invoked to check which activity opened this activity.
        checkPioneerActivity();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_packages);

        //method invoked to initializing views and members.
        initViewsAndMembers();
    }

    /**
     * method to initialize views and members
     */
    private void initViewsAndMembers() {

        clRootShowPackages = findViewById(R.id.cl_root_show_packages);
        rvShowPackages = findViewById(R.id.rv_show_packages);

        //method invoked to set data to the dataList according to the activity
        //who launched this one as this activity
        //Also setting bg color according to pioneer activity
        setDataToListAndBGToCL();

        //setting recycler view
        setRV();
    }


    /***************** Helper Method ******************/

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

            mUfoneDataProvider = new UfoneDataProvider();

            switch (getCallingActivityLLNo()) {
                case 1:
                    setTitle("Ufone Call Packages");
                    break;
                case 2:
                    setTitle("Ufone SMS Packages");
                    break;
                case 3:
                    setTitle("Ufone Internet Packages");
                    break;
                case 4:
                    setTitle("Ufone Other Offers");
                    break;
            }
        } else if (isActivityName(TelenorActivity.GOTO)) {
            setTheme(R.style.TelenorTheme);

            mTelenorDataProvider = new TelenorDataProvider();

            switch (getCallingActivityLLNo()) {
                case 1:
                    setTitle("Telenor Call Packages");
                    break;
                case 2:
                    setTitle("Telenor SMS Packages");
                    break;
                case 3:
                    setTitle("Telenor Internet Packages");
                    break;
                case 4:
                    setTitle("Telenor Other Offers");
                    break;
            }
        } else if (isActivityName(ZongActivity.GOTO)) {
            setTheme(R.style.ZongTheme);

            mZongDataProvider = new ZongDataProvider();

            switch (getCallingActivityLLNo()) {
                case 1:
                    setTitle("Zong Call Packages");
                    break;
                case 2:
                    setTitle("Zong SMS Packages");
                    break;
                case 3:
                    setTitle("Zong Internet Packages");
                    break;
                case 4:
                    setTitle("Zong Location Based Packages");
                    break;
                case 5:
                    setTitle("Zong Other Offers");
                    break;
            }
        } else if (isActivityName(JazzWaridActivity.GOTO)) {
            setTheme(R.style.JazzWaridTheme);

            mJazzWaridDataProvider = new JazzWaridDataProvider();

            switch (getCallingActivityLLNo()) {
                case 1:
                    setTitle("Jazz | Warid Call Packages");
                    break;
                case 2:
                    setTitle("Jazz | Warid SMS Packages");
                    break;
                case 3:
                    setTitle("Jazz | Warid Internet Packages");
                    break;
                case 4:
                    setTitle("Jazz | Warid Location Based Packages");
                    break;
                case 5:
                    setTitle("Jazz | Warid Other Offers");
                    break;
            }
        } else if (isActivityName(PTCLActivity.GOTO)) {
            setTheme(R.style.PTCLTheme);

            mPTCLDataProvider = new PTCLDataProvider();

            switch (getCallingActivityLLNo()) {
                case 1:
                    setTitle("Telephone Packages");
                    break;
                case 3:
                    setTitle("Internet Packages");
                    break;
                case 5:
                    setTitle("Smart TV Packages");
                    break;
            }
        }
    }

    /**
     * method to set data, adapter, layoutManager etc to RecyclerView
     */
    private void setRV() {
        mAdapter = new InternetPackageAdapter(packageList, this);
        rvShowPackages.setLayoutManager(new LinearLayoutManager(this));
        rvShowPackages.setAdapter(mAdapter);
    }


    /**
     * method to set data to list according to pioneer/launcher activity and launcher
     * activity ll number. Also setting BG color according to the pioneer activity.
     * e.g. Red for jazz, sky for telenor etc
     */
    private void setDataToListAndBGToCL() {
        if (isActivityName(UfoneActivity.GOTO)) {
            clRootShowPackages.setBackgroundColor(ContextCompat.getColor(this, R.color.ufone_orange));
            setListWithData(mUfoneDataProvider);
        } else if (isActivityName(TelenorActivity.GOTO)) {
            clRootShowPackages.setBackgroundColor(ContextCompat.getColor(this, R.color.telenor_light_sky));
            setListWithData(mTelenorDataProvider);
        } else if (isActivityName(ZongActivity.GOTO)) {
            clRootShowPackages.setBackgroundColor(ContextCompat.getColor(this, R.color.zong_green));
            setListWithData(mZongDataProvider);
        } else if (isActivityName(JazzWaridActivity.GOTO)) {
            clRootShowPackages.setBackgroundColor(ContextCompat.getColor(this, R.color.jazz_light_red));
            setListWithData(mJazzWaridDataProvider);
        } else if (isActivityName(PTCLActivity.GOTO)) {
            clRootShowPackages.setBackgroundColor(ContextCompat.getColor(this, R.color.ptcl_green_dark));
            setListWithData(mPTCLDataProvider);
        }
    }

    /**
     * method to set data to list according to calling activity linear layout (button here) number.
     *
     * @param provider data provider
     */
    private void setListWithData(SimDataProvider provider) {
        switch (getCallingActivityLLNo()) {
            case 1:
                packageList = provider.getCallPackages();
                break;
            case 2:
                packageList = provider.getSMSPackages();
                break;
            case 3:
                packageList = provider.getInternetPackages();
                break;
            case 4:
                packageList = provider.getLocationBasedPackages();
                break;
            case 5:
                packageList = provider.getOtherPackages();
                break;
        }
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

    /**
     * method to get activity Linear Layout (LL) number, we can also say (Button)
     * So we can set title according to it as this is dynamic activity.
     * (like user clicked on Internet packages or Call Packages or SMS packages).
     *
     * @return number of the ll so that we can set title according to that.
     */
    private int getCallingActivityLLNo() {
        return getIntent().getIntExtra(ACTIVITY_LL_NO, 0);
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
     * @param cls class of parent (maybe previous) activity.
     * @return intent of the parent activity.
     */
    private Intent getIntent(Class<?> cls) {
        Intent intent;
        intent = new Intent(this, cls);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        return intent;
    }
}