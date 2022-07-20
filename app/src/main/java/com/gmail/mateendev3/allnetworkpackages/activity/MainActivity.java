package com.gmail.mateendev3.allnetworkpackages.activity;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import com.gmail.mateendev3.allnetworkpackages.R;
import com.gmail.mateendev3.allnetworkpackages.databinding.ActivityMainBinding;
import com.gmail.mateendev3.allnetworkpackages.databinding.MainLayoutBinding;

public class MainActivity extends AppCompatActivity {
    private MainLayoutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MainLayoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // method invoked to set toolBar as an actionBar
        setActionBar();


        // method invoked to set navigation drawer
        setNavigationDrawer();

        // method invoked to set click listeners to Linear Layout (here we can say that Buttons)
        // to go to specific activities
        setListeners();
    }

    /**
     * method to set click listeners to LL
     */
    private void setListeners() {
        binding.mainActivityRoot.llOpenTelenorPackages.setOnClickListener(v -> {
            Intent intent = new Intent(this, TelenorActivity.class);
            startActivity(intent);
        });
        binding.mainActivityRoot.llOpenJazzWaridPackages.setOnClickListener(v -> {
            Intent intent = new Intent(this, JazzWaridActivity.class);
            startActivity(intent);
        });
        binding.mainActivityRoot.llOpenUfonePackages.setOnClickListener(v -> {
            Intent intent = new Intent(this, UfoneActivity.class);
            startActivity(intent);
        });
        binding.mainActivityRoot.llOpenZongPackages.setOnClickListener(v -> {
            Intent intent = new Intent(this, ZongActivity.class);
            startActivity(intent);
        });
        binding.mainActivityRoot.llOpenPtclPackages.setOnClickListener(v -> {
            Intent intent = new Intent(this, PTCLActivity.class);
            startActivity(intent);
        });
    }

    /**
     * method to set toolBar as an actionBar
     */
    void setActionBar() {
        Toolbar toolbar = binding.mainActivityRoot.mainToolBar;
        setSupportActionBar(toolbar);
    }

    /**
     * method to set listener Navigation drawer
     */
    void setNavigationDrawer() {

        DrawerLayout drawerLayout = binding.mainDrawerLayout;

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                binding.mainActivityRoot.mainToolBar,
                R.string.open_nav_drawer,
                R.string.close_nav_drawer
        );

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //setting click listener of nav drawer list items
        binding.navigationView.setNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_item_share:
                    shareApp();
                    break;
                case R.id.nav_item_support_us:
                    openSupportUsDialog();
                    break;
                case R.id.nav_item_about:
                    openAboutDialog();
                    break;
                case R.id.nav_item_exit:
                    finish();
                    break;
            }

            //closing drawer after click.
            binding.mainDrawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });
    }

    /**
     * method to open / show about dialog to the user.
     */
    private void openAboutDialog() {
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("About Us")
                .setMessage("All Network Packages app provides you all the network (Jazz, Warid, Zong, Telenor, Ufone and even PTCL as well) packages. This app contain all SMS, Internet (3G, 4G), Call (On-net, Off-net), Location Based packages and Other important codes of every SIM. \nAll the packages are upto date.\n\nHelp us by 5 stars and also give valuable feedback, love and support.\n\nMateen Mehmood")
                .setPositiveButton("Ok", (dialog1, which) -> dialog1.dismiss())
                .setCancelable(false)
                .create();
        dialog.show();
    }

    /**
     * method to show / open support dialog to the user.
     */
    private void openSupportUsDialog() {
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Rate This App")
                .setMessage("Help us by 5 stars and also give valuable feedback, love and support.")
                .setPositiveButton("Rate", (dialog1, which) -> {

                })
                .setNegativeButton("No", (dialog1, which) -> {
                    dialog1.dismiss();
                })
                .create();

        dialog.show();
    }

    /**
     * method invoked to share app.
     */
    private void shareApp() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "All Network Packages\n\nGet Call, SMS and Internet packages of all networks (Jazz, Warid, Ufone, Telenor, Zong).\n\nDownload From PlayStore:\n\nhttps://www.facebook.com/786beast");
        startActivity(Intent.createChooser(intent, "Share via"));
    }
}