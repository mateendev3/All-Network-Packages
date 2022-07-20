package com.gmail.mateendev3.allnetworkpackages.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.gmail.mateendev3.allnetworkpackages.R;
import com.gmail.mateendev3.allnetworkpackages.databinding.ActivityUfoneBinding;
import com.gmail.mateendev3.allnetworkpackages.databinding.ActivityZongBinding;

public class ZongActivity extends AppCompatActivity {

    //declaring and initializing members
    private ActivityZongBinding binding;
    public static final String GOTO = "ZongActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityZongBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /**
         * method invoked to set click listeners to Linear Layout (here we can say that Buttons)
         * to go to specific activities
         */
        setClickListenersToLL();
    }

    /**
     * method to set click listeners to linear layout
     */
    private void setClickListenersToLL() {
        binding.llOpenCallPackages.setOnClickListener(v -> {
            startPackagesActivity(1);
        });
        binding.llOpenSmsPackages.setOnClickListener(v -> {
            startPackagesActivity(2);
        });
        binding.llOpenInternetPackages.setOnClickListener(v -> {
            startPackagesActivity(3);
        });
        binding.llOpenLocationBasedPackages.setOnClickListener(v -> {
            startPackagesActivity(4);
        });
        binding.llOpenOtherOffersPackages.setOnClickListener(v -> {
            startPackagesActivity(5);
        });
    }

    /**
     * method to start packages activity according to ll (value)
     *
     * @param value set every ll different value to differentiate
     */
    private void startPackagesActivity(int value) {
        Intent intent = new Intent(this, ShowPackagesActivity.class);
        intent.putExtra(ShowPackagesActivity.GOTO_ID, GOTO);
        intent.putExtra(ShowPackagesActivity.ACTIVITY_LL_NO, value);
        startActivity(intent);
    }

    /**
     * method to inflate options menu to activity
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.favorite_package_menu, menu);
        return true;
    }

    /**
     * method to handle click on options menu
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.nav_item_fav) {
            Intent intent = new Intent(this, FavoritePackagesActivity.class);
            intent.putExtra(FavoritePackagesActivity.GOTO_ID, GOTO);
            startActivity(intent);
            return true;
        }
        else
            return super.onOptionsItemSelected(item);
    }
}