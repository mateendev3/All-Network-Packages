package com.gmail.mateendev3.allnetworkpackages.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.gmail.mateendev3.allnetworkpackages.R;
import com.gmail.mateendev3.allnetworkpackages.activity.MasterDetailActivity;
import com.gmail.mateendev3.allnetworkpackages.model.Package;

import java.util.List;

public class InternetPackageAdapter extends RecyclerView.Adapter<InternetPackageAdapter.InternetPackageViewHolder> {

    //declaring and initializing members
    private List<Package> packageList;
    private final Context mContext;

    //public constructor
    public InternetPackageAdapter(List<Package> packageList, Context context) {
        this.packageList = packageList;
        mContext = context;
    }

    //setter to set data (list)
    public void setPackageList(List<Package> packageList) {
        this.packageList = packageList;
    }

    @NonNull
    @Override
    public InternetPackageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InternetPackageViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull InternetPackageViewHolder holder, int position) {

        //getting package instance from packageList at position
        Package aPackage = packageList.get(position);

        //setting data to views
        holder.ivPackageImage.setImageResource(aPackage.getImageResId());
        holder.tvPackageTitle.setText(aPackage.getTitle());
        holder.tvPackagePrice.setText(aPackage.getPrice());

        switch (aPackage.getNumber()) {
            case "1":
                holder.tvPackageData.setText(aPackage.getOnNet());
                break;
            case "2":
                holder.tvPackageData.setText(aPackage.getSms());
                break;
            case "3":
            case "4":
                holder.tvPackageData.setText(aPackage.getInternet());
                break;
            case "5":
                holder.tvPackageData.setText(aPackage.getCode());
                break;
        }

        //setting click listener to root and button
        holder.clRootChild.setOnClickListener(v -> {
            startMasterActivity(aPackage);
        });
        holder.btnMoreDetails.setOnClickListener(v -> {
            startMasterActivity(aPackage);
        });


        //setting colors to holder (root) and TextViews according to sim
        //here we differentiate the packages with their image res id.
        //so we assign root and tv colors w.r.t to them.
        switch (aPackage.getImageResId()) {
            case R.drawable.ufone_logo:
                setColorsToViews(holder, R.color.ufone_backgroud, R.color.ufone_orange);
                break;
            case R.drawable.telenor_logo:
                setColorsToViews(holder, R.color.telenor_light_background, R.color.telenor_dark_sky);
                break;
            case R.drawable.zong_logo:
                setColorsToViews(holder, R.color.zong_green_background, R.color.zong_pink);
                break;
            case R.drawable.jazz_warid_logo:
                setColorsToViews(holder, R.color.jazz_light_background, R.color.jazz_light_red);
                break;
            case R.drawable.ptcl_logo:
                setColorsToViews(holder, R.color.ptcl_green_dark_background, R.color.ptcl_green_dark);
                break;
        }
    }

    /**
     * method to set master activity for specific package.
     * method to open master activity for given packages in the params
     *
     * @param aPackage package which is going to open in the master details activity
     *                 through click on package items.
     */
    private void startMasterActivity(Package aPackage) {
        Intent intent = new Intent(mContext, MasterDetailActivity.class);
        intent.putExtra(MasterDetailActivity.PACKAGE_ID, aPackage);
        mContext.startActivity(intent);
    }


    /**
     * method to set colors to viewHolder (rootView) and TextViews according to image res id
     *
     * @param holder    view holder to get views and to set bg and text colors.
     * @param bgColor   res id of color to set in the background.
     * @param textColor res id of color to set in the text.
     */
    private void setColorsToViews(InternetPackageViewHolder holder, int bgColor, int textColor) {
        holder.clRootChild.setBackgroundColor(ContextCompat.getColor(mContext, bgColor));
        holder.tvPackagePrice.setTextColor(ContextCompat.getColor(mContext, textColor));
        holder.tvPackageData.setTextColor(ContextCompat.getColor(mContext, textColor));
    }

    @Override
    public int getItemCount() {
        if (packageList != null && packageList.size() > 0)
            return packageList.size();
        return 0;
    }

    //inner static view holder class
    public static final class InternetPackageViewHolder extends RecyclerView.ViewHolder {

        //declaring members
        ConstraintLayout clRootChild;
        ImageView ivPackageImage;
        TextView tvPackageTitle, tvPackagePrice, tvPackageData;
        Button btnMoreDetails;

        //public parameterized constructor
        public InternetPackageViewHolder(@NonNull View itemView) {
            super(itemView);

            //initializing members
            clRootChild = itemView.findViewById(R.id.cl_root_child);
            ivPackageImage = itemView.findViewById(R.id.iv_package_image);
            tvPackageTitle = itemView.findViewById(R.id.tv_package_title);
            tvPackagePrice = itemView.findViewById(R.id.tv_package_price);
            tvPackageData = itemView.findViewById(R.id.tv_package_data);
            btnMoreDetails = itemView.findViewById(R.id.btn_more_detatils);
        }
    }
}
