package com.gmail.mateendev3.allnetworkpackages.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Package implements Parcelable {

    //private constructor
    private Package(Builder builder) {
        imageResId = builder.imageResId;
        title = builder.title;
        onNet = builder.onNet;
        offNet = builder.offNet;
        sms = builder.sms;
        internet = builder.internet;
        validity = builder.validity;
        price = builder.price;
        code = builder.code;
        description = builder.description;
        number = builder.number;
        sim = builder.sim;
    }

    //private members
    private int imageResId;
    private String title;
    private String onNet;
    private String offNet;
    private String sms;
    private String internet;
    private String validity;
    private String price;
    private String code;
    private String description;
    private String number;
    private String sim;

    //builder class for complex object
    public static class Builder {

        int imageResId;
        String title;
        String onNet;
        String offNet;
        String sms;
        String internet;
        String validity;
        String price;
        String code;
        String description;
        String number;
        String sim;

        //public constructor
        public Builder() {
            title = "--";
            onNet = "--";
            offNet = "--";
            sms = "--";
            internet = "--";
            validity = "--";
            price = "--";
            code = "--";
            description = "";
        }

        //setters
        public Builder setImageResId(int imageResId) {
            this.imageResId = imageResId;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setOnNet(String onNet) {
            this.onNet = onNet;
            return this;
        }

        public Builder setOffNet(String offNet) {
            this.offNet = offNet;
            return this;
        }

        public Builder setSms(String sms) {
            this.sms = sms;
            return this;
        }

        public Builder setInternet(String internet) {
            this.internet = internet;
            return this;
        }

        public Builder setValidity(String validity) {
            this.validity = validity;
            return this;
        }

        public Builder setPrice(String price) {
            this.price = price;
            return this;
        }

        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setNumber(String number) {
            this.number = number;
            return this;
        }

        public Builder setSim(String sim) {
            this.sim = sim;
            return this;
        }

        //method to make package object
        public Package build() {
            return new Package(this);
        }
    }

    //getters
    public int getImageResId() {
        return imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getOnNet() {
        return onNet;
    }

    public String getOffNet() {
        return offNet;
    }

    public String getSms() {
        return sms;
    }

    public String getInternet() {
        return internet;
    }

    public String getValidity() {
        return validity;
    }

    public String getPrice() {
        return price;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getNumber() {
        return number;
    }

    public String getSim() {
        return sim;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.imageResId);
        dest.writeString(this.title);
        dest.writeString(this.onNet);
        dest.writeString(this.offNet);
        dest.writeString(this.sms);
        dest.writeString(this.internet);
        dest.writeString(this.validity);
        dest.writeString(this.price);
        dest.writeString(this.code);
        dest.writeString(this.description);
        dest.writeString(this.number);
        dest.writeString(this.sim);
    }

    public void readFromParcel(Parcel source) {
        this.imageResId = source.readInt();
        this.title = source.readString();
        this.onNet = source.readString();
        this.offNet = source.readString();
        this.sms = source.readString();
        this.internet = source.readString();
        this.validity = source.readString();
        this.price = source.readString();
        this.code = source.readString();
        this.description = source.readString();
        this.number = source.readString();
        this.sim = source.readString();
    }

    protected Package(Parcel in) {
        this.imageResId = in.readInt();
        this.title = in.readString();
        this.onNet = in.readString();
        this.offNet = in.readString();
        this.sms = in.readString();
        this.internet = in.readString();
        this.validity = in.readString();
        this.price = in.readString();
        this.code = in.readString();
        this.description = in.readString();
        this.number = in.readString();
        this.sim = in.readString();
    }

    public static final Parcelable.Creator<Package> CREATOR = new Parcelable.Creator<Package>() {
        @Override
        public Package createFromParcel(Parcel source) {
            return new Package(source);
        }

        @Override
        public Package[] newArray(int size) {
            return new Package[size];
        }
    };

    @Override
    public String toString() {
        return "Offer:\n" + title +
                "\n\nOn-Net Mins:\n" + onNet +
                "\n\nOff-Net Mins:\n" + offNet +
                "\n\nSMS:\n" + sms +
                "\n\nInternet:\n" + internet +
                "\n\nValidity:\n" + validity +
                "\n\nCode:\n" + code +
                "\n\ndescription:\n" + description +
                "\n\nDownload App from PlayStore:\nhttps://www.facebook.com/786beast";
    }

    /* Declaring DB constants */
    public static final String TABLE_NAME_JAZZ_WARID = "jazz_warid_packages";
    public static final String TABLE_NAME_TELENOR = "telenor_packages";
    public static final String TABLE_NAME_UFONE = "ufone_packages";
    public static final String TABLE_NAME_ZONG = "zong_packages";
    public static final String TABLE_NAME_PTCL = "ptcl_packages";
    public static final String COLUMN_IMAGE_RES_ID = "image_res_id";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_ON_NET = "on_net";
    public static final String COLUMN_OFF_NET = "off_net";
    public static final String COLUMN_SMS = "sms";
    public static final String COLUMN_INTERNET = "internet";
    public static final String COLUMN_VALIDITY = "validity";
    public static final String COLUMN_PRICE = "price";
    public static final String COLUMN_CODE = "code";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_NUMBER = "number";

    public static final String SQL_CREATE_TABLE_JAZZ_WARID =
            getTableCreateCommand(TABLE_NAME_JAZZ_WARID);
    public static final String SQL_CREATE_TABLE_TELENOR =
            getTableCreateCommand(TABLE_NAME_TELENOR);
    public static final String SQL_CREATE_TABLE_UFONE =
            getTableCreateCommand(TABLE_NAME_UFONE);
    public static final String SQL_CREATE_TABLE_ZONG =
            getTableCreateCommand(TABLE_NAME_ZONG);
    public static final String SQL_CREATE_TABLE_PTCL =
            getTableCreateCommand(TABLE_NAME_PTCL);

    @NonNull
    private static String getTableCreateCommand(String tableName) {
        return "CREATE TABLE " + tableName +
                " (" + COLUMN_TITLE + " TEXT PRIMARY KEY, " +
                COLUMN_IMAGE_RES_ID + " INTEGER, " +
                COLUMN_ON_NET + " TEXT, " + COLUMN_OFF_NET + " TEXT, " +
                COLUMN_SMS + " TEXT, " + COLUMN_INTERNET + " TEXT, " +
                COLUMN_VALIDITY + " TEXT, " + COLUMN_PRICE + " TEXT, " +
                COLUMN_CODE + " TEXT, " + COLUMN_DESCRIPTION + " TEXT, " +
                COLUMN_NUMBER + " TEXT)";
    }

    public static final String SQL_DELETE_TABLE_JAZZ_WARID =
            getDeleteTableCommand(TABLE_NAME_JAZZ_WARID);

    public static final String SQL_DELETE_TABLE_TELENOR =
            getDeleteTableCommand(TABLE_NAME_TELENOR);

    public static final String SQL_DELETE_TABLE_UFONE =
            getDeleteTableCommand(TABLE_NAME_UFONE);

    public static final String SQL_DELETE_TABLE_ZONG =
            getDeleteTableCommand(TABLE_NAME_ZONG);

    public static final String SQL_DELETE_TABLE_PTCL =
            getDeleteTableCommand(TABLE_NAME_ZONG);

    @NonNull
    private static String getDeleteTableCommand(String tableName) {
        return "DROP TABLE IF EXISTS " + tableName;
    }

}