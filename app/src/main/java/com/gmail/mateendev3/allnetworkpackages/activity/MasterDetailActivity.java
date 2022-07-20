package com.gmail.mateendev3.allnetworkpackages.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.gmail.mateendev3.allnetworkpackages.database.DBHelper;
import com.gmail.mateendev3.allnetworkpackages.databinding.ActivityMasterDetailBinding;
import com.gmail.mateendev3.allnetworkpackages.model.Package;

public class MasterDetailActivity extends AppCompatActivity {

    //declaring and initializing members
    public static final String PACKAGE_ID = "com.gmail.mateendev3.allnetworkpackages.activity.package.id";
    private ActivityMasterDetailBinding binding;
    private Package mPackage;
    private DBHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMasterDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mHelper = new DBHelper(this);

        // method invoked to set data to appropriate views given by an
        // intent from the activity who opened this.
        setDataToViews();

        //setting click listeners to views
        setListeners();
    }

    /**
     * method to set click listeners to icons
     */
    private void setListeners() {
        binding.ivShare.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, mPackage.toString());
            startActivity(Intent.createChooser(intent, "Share via"));
        });

        binding.ivFavorite.setOnClickListener(v -> {
            boolean isInserted = mHelper.insertPackage(mPackage);
            if (isInserted)
                Toast.makeText(this, "Offer is added to favorite", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Package already in favorites", Toast.LENGTH_SHORT).show();
        });
    }


    /**
     * method to set data to views from intent which we received from the
     * activity who opened this one.
     */
    private void setDataToViews() {

        //getting Package instance from intent
        mPackage = getIntent().getParcelableExtra(PACKAGE_ID);

        //setting data to to corresponding views
        binding.tvPackageMasterTitle.setText(mPackage.getTitle());
        binding.tvOnNet.setText("On-Net  |  " + mPackage.getOnNet());
        binding.tvOffNet.setText("Off-Net  |  " + mPackage.getOffNet());
        binding.tvSms.setText("SMS  |  " + mPackage.getSms());
        binding.tvInternet.setText("Internet  |  " + mPackage.getInternet());
        binding.tvValidity.setText("Validity  |  " + mPackage.getValidity());
        binding.tvPrice.setText("Price  |  " + mPackage.getPrice());
        binding.tvCode.setText("Code  | " + mPackage.getCode());
        binding.tvDescription.setText(mPackage.getDescription());
        binding.btnActivatePackage.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            String no = mPackage.getCode();
            if (no.contains("#")) {
                no = no.replace("#", "%23");
            }
            intent.setData(Uri.parse("tel:" + no));
            startActivity(intent);
        });
    }
}