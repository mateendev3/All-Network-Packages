package com.gmail.mateendev3.allnetworkpackages.database;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.gmail.mateendev3.allnetworkpackages.model.Package;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {

    // declaring constants
    private static final String DATABASE_NAME = "packages.db";
    private static final int DATABASE_VERSION = 1;

    //public constructor
    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // creating tables.
        db.execSQL(Package.SQL_CREATE_TABLE_JAZZ_WARID);
        db.execSQL(Package.SQL_CREATE_TABLE_TELENOR);
        db.execSQL(Package.SQL_CREATE_TABLE_UFONE);
        db.execSQL(Package.SQL_CREATE_TABLE_ZONG);
        db.execSQL(Package.SQL_CREATE_TABLE_PTCL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != newVersion) {
            // deleting tables and creating new ones
            db.execSQL(Package.SQL_DELETE_TABLE_JAZZ_WARID);
            db.execSQL(Package.SQL_DELETE_TABLE_TELENOR);
            db.execSQL(Package.SQL_DELETE_TABLE_UFONE);
            db.execSQL(Package.SQL_CREATE_TABLE_ZONG);
            db.execSQL(Package.SQL_DELETE_TABLE_PTCL);
        }
        onCreate(db);
    }

    /* CRUD OPERATIONS METHODS */

    /**
     * method to insert data to database
     *
     * @param aPackage package to insert in the database
     * @return true if data inserted successfully else false
     */
    public boolean insertPackage(Package aPackage) {
        //getting instance of db
        SQLiteDatabase database = getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Package.COLUMN_IMAGE_RES_ID, aPackage.getImageResId());
        values.put(Package.COLUMN_TITLE, aPackage.getTitle());
        values.put(Package.COLUMN_ON_NET, aPackage.getOnNet());
        values.put(Package.COLUMN_OFF_NET, aPackage.getOffNet());
        values.put(Package.COLUMN_SMS, aPackage.getSms());
        values.put(Package.COLUMN_INTERNET, aPackage.getInternet());
        values.put(Package.COLUMN_VALIDITY, aPackage.getValidity());
        values.put(Package.COLUMN_PRICE, aPackage.getPrice());
        values.put(Package.COLUMN_CODE, aPackage.getCode());
        values.put(Package.COLUMN_DESCRIPTION, aPackage.getDescription());
        values.put(Package.COLUMN_NUMBER, aPackage.getNumber());

        long isInserted = -1;

        switch (aPackage.getSim()) {
            case "JAZZ_WARID":
                isInserted = database.insert(Package.TABLE_NAME_JAZZ_WARID, null, values);
                break;
            case "TELENOR":
                isInserted = database.insert(Package.TABLE_NAME_TELENOR, null, values);
                break;
            case "UFONE":
                isInserted = database.insert(Package.TABLE_NAME_UFONE, null, values);
                break;
            case "ZONG":
                isInserted = database.insert(Package.TABLE_NAME_ZONG, null, values);
                break;
            case "PTCL":
                isInserted = database.insert(Package.TABLE_NAME_PTCL, null, values);
                break;
        }
        return isInserted != -1;
    }

    /**
     * method to get data from database to set on the rv
     * @param query query to get data (from which table you wanna get data).
     * @return list of packages according to query
     */
    @SuppressLint("Range")
    public List<Package> getPackages(String query) {
        //getting instance of db
        SQLiteDatabase db = getReadableDatabase();

        Cursor cursor =
                db.rawQuery(query, null);

        if (cursor.getCount() > 0) {
            List<Package> packageList = new ArrayList<>();

            while (cursor.moveToNext()) {
                packageList.add(new Package.Builder()
                        .setImageResId(cursor.getInt(cursor.getColumnIndex(Package.COLUMN_IMAGE_RES_ID)))
                        .setTitle(cursor.getString(cursor.getColumnIndex(Package.COLUMN_TITLE)))
                        .setOnNet(cursor.getString(cursor.getColumnIndex(Package.COLUMN_ON_NET)))
                        .setOffNet(cursor.getString(cursor.getColumnIndex(Package.COLUMN_OFF_NET)))
                        .setSms(cursor.getString(cursor.getColumnIndex(Package.COLUMN_SMS)))
                        .setInternet(cursor.getString(cursor.getColumnIndex(Package.COLUMN_INTERNET)))
                        .setValidity(cursor.getString(cursor.getColumnIndex(Package.COLUMN_VALIDITY)))
                        .setPrice(cursor.getString(cursor.getColumnIndex(Package.COLUMN_PRICE)))
                        .setCode(cursor.getString(cursor.getColumnIndex(Package.COLUMN_CODE)))
                        .setDescription(cursor.getString(cursor.getColumnIndex(Package.COLUMN_DESCRIPTION)))
                        .setNumber(cursor.getString(cursor.getColumnIndex(Package.COLUMN_NUMBER)))
                        .build()
                );
            }
            cursor.close();
            return packageList;
        } else return null;
    }

    /**
     * method to delete data from tables according to table name
     * @param table name of the table in which you want to delete data
     * @return true if data deleted successfully else false
     */
    public boolean deletePackages(String table) {
        //getting instance of db
        SQLiteDatabase db = getWritableDatabase();
        int isDeleted = db.delete(table, "1", null);
        return isDeleted != 0;
    }
}
