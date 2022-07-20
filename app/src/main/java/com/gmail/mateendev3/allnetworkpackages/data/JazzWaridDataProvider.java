package com.gmail.mateendev3.allnetworkpackages.data;

import android.view.Menu;

import com.gmail.mateendev3.allnetworkpackages.R;
import com.gmail.mateendev3.allnetworkpackages.contract.SimDataProvider;
import com.gmail.mateendev3.allnetworkpackages.model.Package;

import java.util.ArrayList;
import java.util.List;

public class JazzWaridDataProvider implements SimDataProvider {

    /**
     * method to get all jazz/warid call packages
     *
     * @return jazz/warid call packages list
     */
    public List<Package> getCallPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Make Your Own Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setOnNet("Any Mins")
                .setOffNet("Any Mins")
                .setSms("Any Msgs")
                .setInternet("Any MB")
                .setValidity("1, 7, 30 Days")
                .setCode("*303#")
                .setDescription("Status: *303*1# for daily validity\nStatus: *303*7# for weekly validity\nStatus: *303*20# for monthly validity")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Daily Day Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("300 Mins")
                .setSms("300 Msgs")
                .setInternet("20 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 14/-")
                .setCode("*340#")
                .setDescription("Take charge of your day with the day bundle. Enjoy 300 On-Net mins, 300 SMS and 20 MBs for the next 24 hours")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Daily Super Offer")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("1440 Mins")
                .setSms("50 Msgs")
                .setInternet("150 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 17/-")
                .setCode("*212#")
                .setDescription("Status: *212*2#\nInfo: *212*3#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Daily Super Plus Offer")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("500 Mins")
                .setOffNet("5 Mins")
                .setSms("500 Msgs")
                .setInternet("500 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 28/-")
                .setCode("*558#")
                .setDescription("Status: *558*2#\nIf you are not subscribed to any bundle base rate will be charged i.e. Rs. 5/MB. Charging pulse will be 512KB")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("3 Day Max Offer")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("100 Mins")
                .setInternet("1 GB")
                .setValidity("3 Days")
                .setPrice("Rs. 35/-")
                .setCode("*631#")
                .setDescription("Status: *631*2#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Weekly Voice Offer")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("600 Mins")
                .setValidity("7 Days")
                .setPrice("Rs. 75/-")
                .setCode("*211#")
                .setDescription("Status: *211*2#\nSharing Code: *308#\nStatus of shared incentive: *308*2#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("ALL IN ONE Social")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("1000 Mins")
                .setInternet("3GB GB")
                .setValidity("7 Days")
                .setPrice("Rs. 89/-")
                .setCode("*668#")
                .setDescription("3 GB Data (WhatsApp, Facebook And IMO)\nStatus Code: *668*2#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Work From Home Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("Unlimited Mins")
                .setInternet("10 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 95/-")
                .setCode("*117*14#")
                .setDescription("This Offer is usable between 8am - 6pm")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Weekly Hybrid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("100 Mins")
                .setOffNet("20 Mins")
                .setSms("1000 Msgs")
                .setInternet("1 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 120/-")
                .setCode("*407#")
                .setDescription("Status Code: *407*2#\nInfo Code: *407*3#\nDe-Activation Code: *407*4#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Weekly All Network Offer")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("1000 Mins")
                .setOffNet("60 Mins")
                .setSms("1000 Msgs")
                .setInternet("2 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 170/-")
                .setCode("*700#")
                .setDescription("Status Code: *700*2#\nInfo Code: *700*3#\nDe-Activation Code: *700*4#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Weekly Super Duper")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("1500 Mins")
                .setOffNet("60 Mins")
                .setSms("1500 Msgs")
                .setInternet("3 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 210/-")
                .setCode("*770#")
                .setDescription("Status Code: *770*2#\nInfo Code: *770*3#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Weekly Super Plus")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("5000 Mins")
                .setOffNet("70 Mins")
                .setSms("5000 Msgs")
                .setInternet("12 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 250/-")
                .setCode("*505#")
                .setDescription("Status Code: *505*2#\n12 GB Data (2am - 2pm)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Mahana Bachat Offer")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("200 Mins")
                .setOffNet("20 Mins")
                .setSms("2000 Msgs")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 75/-")
                .setCode("*614#")
                .setDescription("Status Code: *614*2#\nData MBs are usable on WhatsApp Only")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Monthly Super Max")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("6000 Mins")
                .setOffNet("60 Mins")
                .setSms("6000 Msgs")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 299/-")
                .setCode("*506#")
                .setDescription("Status Code: *506*2#\n30GB Data [10 GBs + 10 GBs (2am - 2pm) + 10 GBs Youtube]")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Monthly Hybrid Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("10,000 Mins")
                .setOffNet("50 Mins")
                .setSms("1000 Msgs")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 444/-")
                .setCode("*430#")
                .setDescription("Status Code: *430*2#\nInfo Code: *430*3#\nDaily Limit: 330 Mins")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Monthly Super Duper")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("3000 Mins")
                .setOffNet("150 Mins")
                .setSms("3000 Msgs")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 600/-")
                .setCode("*706#")
                .setDescription("Status Code: *706*2#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Jazz Super Duper Card")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("2000 Mins")
                .setOffNet("150 Mins")
                .setSms("2000 Msgs")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 600/-")
                .setCode("*601#")
                .setDescription("Status Code: *601*2#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Monthly Super Duper Plus")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("5000 Mins")
                .setOffNet("300 Mins")
                .setSms("5000 Msgs")
                .setInternet("15 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 977/-")
                .setCode("*707#")
                .setDescription("Status Code: *707*2#\nInfo Code: *707*3#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Voice Infinity Offer")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("100 Mins")
                .setValidity("6 Months")
                .setPrice("Rs. 40/-")
                .setCode("*710#")
                .setDescription("Status Code: *710*2#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("J 300 PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("1000 Mins")
                .setOffNet("150 Mins")
                .setSms("1000 Msgs")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 499/-")
                .setCode("*777#")
                .setDescription("Offer for Jazz PostPaid consumer only\nInternet Bundle Details: *443#\nGet Bill/Incentive details: *1111#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("J 600 PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("2000 Mins")
                .setOffNet("300 Mins")
                .setSms("2000 Msgs")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 799/-")
                .setCode("*777#")
                .setDescription("Offer for Jazz PostPaid consumer only\nInternet Bundle Details: *443#, Helpline: 777\nGet Bill/Incentive details: *1111#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("J 999 PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("Unlimited Mins")
                .setOffNet("500 Mins")
                .setSms("1000 Msgs")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 999/-")
                .setCode("*777#")
                .setDescription("Offer for Jazz PostPaid consumer only\nInternet Bundle Details: *443#, Helpline: 777\nGet Bill/Incentive details: *1111#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("J 1500 PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("Unlimited Mins")
                .setOffNet("500 Mins")
                .setSms("7000 Msgs")
                .setInternet("8 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1500/-")
                .setCode("*777#")
                .setDescription("Offer for Jazz PostPaid consumer only\nInternet Bundle Details: *443#, Helpline: 777\nGet Bill/Incentive details: *1111#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("J All-Net Lite PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOffNet("100 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 100/-")
                .setDescription("Free minutes are for all on-net and off-net local numbers")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("J All-Net Mini PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOffNet("200 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 200/-")
                .setDescription("Free minutes are for all on-net and off-net local numbers")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("J All-Net Smart PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOffNet("300 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 300/-")
                .setDescription("Free minutes are for all on-net and off-net local numbers")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("J All-Net Super PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOffNet("400 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 400/-")
                .setDescription("Free minutes are for all on-net and off-net local numbers")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("J All-Net Budget PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOffNet("500 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 500/-")
                .setDescription("Free minutes are for all on-net and off-net local numbers")
                .build()
        );

        return packageList;
    }

    /**
     * method to get all jazz/warid sms packages
     *
     * @return jazz/warid sms packages list
     */
    public List<Package> getSMSPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Daily SMS + WhatsApp Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("2")
                .setSms("1800 Msgs")
                .setInternet("10 MB")
                .setValidity("1 Day")
                .setCode("*334#")
                .setDescription("Mb's are usable for WhatsApp Only\nStatus Code: *334*2#\nInfo Code: *334*3#\nDe-Activation Code: *334*4#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly SMS + WhatsApp Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("2")
                .setSms("1500 Msgs")
                .setInternet("25 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 20/-")
                .setCode("*101*1*07#")
                .setDescription("Status Code: *101*2*07#\nInfo Code: *101*3*07#\nDe-Activation Code: *101*4*07#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly SMS + WhatsApp Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("2")
                .setSms("12000 Msgs")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 99/-")
                .setCode("*101*1*02#")
                .setDescription("Status Code: *101*2*02#\nInfo Code: *101*3*02#\nDe-Activation Code: *101*4*02#\nMBs are usable for WhatsApp, Facebook and Imo only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("JSMS-1 PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("2")
                .setSms("250 Msgs")
                .setInternet("250 MB")
                .setValidity("1 Month")
                .setPrice("Rs. 50/-")
                .setCode("*441*17#")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nSubscription: Jazz: *441*17#, Warid: *777# Menu")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("JSMS-2 PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("2")
                .setSms("750 Msgs")
                .setInternet("750 MB")
                .setValidity("1 Month")
                .setPrice("Rs. 90/-")
                .setCode("*441*18#")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nSubscription: Jazz: *441*18#, Warid: *777# Menu")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("JSMS-3 PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("2")
                .setSms("Unlimited Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 150/-")
                .setCode("*441*19#")
                .setDescription("Unlimited (6000 FUP)\nOffer available for Jazz postpaid consumer packages only.\nSubscription: Jazz: *441*19#, Warid: *777#Menu ")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz 2000 Add-on PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("2")
                .setSms("2000 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 50/-")
                .setCode("*441*25#")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nSubscription: Jazz: *441*25#, Warid: *777# Menu")
                .build()
        );

        return packageList;
    }

    /**
     * method to get all jazz/warid internet packages
     *
     * @return jazz/warid internet packages list
     */
    public List<Package> getInternetPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("SUPER GHANTA OFFER")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("1 Hour")
                .setPrice("Rs. 9/-")
                .setCode("*638#")
                .setDescription("Status Code: *638*2#\nEnjoy 1 GB Jazz Super 4G data for an hour at the lowest rate!")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Daily YouTube Social")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 15/-")
                .setCode("*968#")
                .setDescription("Enjoy Facebook, WhatsApp & Youtube for the whole day")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Daily Extreme")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("2 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 15/-")
                .setCode("*757#")
                .setDescription("2GB Data (12am - 12pm")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Daily Mega")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 27/-")
                .setCode("*117*4#")
                .setDescription("Status Code: *117*4*2#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Extreme")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("25 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 75/-")
                .setCode("*117*1#")
                .setDescription("Status Code: *117*1*2#\n25GB Data (12am - 12pm)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Youtube + Social")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 89/-")
                .setCode("*660#")
                .setDescription("Status Code: *660*2#\n5GB data for IMO, WhatsApp, YouTube & Facebook")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Work From Home Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setOnNet("Unlimited Mins")
                .setInternet("10 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 95/-")
                .setCode("*117*14#")
                .setDescription("With work from home bundle get 10GB data and unlimited jazz mins from 8am to 6pm for the entire week\nThe offer's incentive is usable between 8am - 6pm")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Premium")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setOffNet("50 Mins")
                .setInternet("4 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 169/-")
                .setCode("*117*47#")
                .setDescription("Status Code: *117*47*2#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Mega")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("7 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 210/-")
                .setCode("*159#")
                .setDescription("Status Code: *159*2#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Mega Plus")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("25 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 275/-")
                .setCode("*453#")
                .setDescription("Status Code: *453*2#\nThis Offer is currently not available in Bajour, Mohmand, Khyber, Orakzai, Wazirstan, Kurram, Kalat and Kech (Turbat).")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Browser")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 89/-")
                .setCode("*709#")
                .setDescription("Status Code: *709*2#\nInfo Code: *709*3#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Social")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setSms("12000 Msgs")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 99/-")
                .setCode("*101*1*02#")
                .setDescription("Status Code: *101*2*02#\nInfo Code: *101*3*02#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Mega Plus")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("12 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 349/-")
                .setCode("*117*30#")
                .setDescription("Status Code: *117*30*2#\nVolume: 12 GB (6GB 2am - 2pm)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Supreme")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 499/-")
                .setCode("*117*32#")
                .setDescription("Status Code: *117*32*2#\nVolume: 20GB (1GB 2am - 2pm)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Premium")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setOffNet("250 Mins")
                .setInternet("25 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 620/-")
                .setCode("*2000#")
                .setDescription("Status Code: *2000*2#\n25GB Data (10GB Youtube")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly WhatsApp")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 75/-")
                .setCode("*443#")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nTo subscribe to 2G, 3G and 4G bundles dial *443#.\nAlternatively, customers can dial 777 or visit their nearest Jazz Experience Center/Jazz Point.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Streamer")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 250/-")
                .setCode("*443#")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nTo subscribe to 2G, 3G and 4G bundles dial *443#.\nAlternatively, customers can dial 777 or visit their nearest Jazz Experience Center/Jazz Point.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Premium")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500/-")
                .setCode("*443#")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nTo subscribe to 2G, 3G and 4G bundles dial *443#.\nAlternatively, customers can dial 777 or visit their nearest Jazz Experience Center/Jazz Point.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Supreme")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("14 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 800/-")
                .setCode("*443#")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nTo subscribe to 2G, 3G and 4G bundles dial *443#.\nAlternatively, customers can dial 777 or visit their nearest Jazz Experience Center/Jazz Point.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Super")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("24 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1020/-")
                .setCode("*443#")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nTo subscribe to 2G, 3G and 4G bundles dial *443#.\nAlternatively, customers can dial 777 or visit their nearest Jazz Experience Center/Jazz Point.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Ultimate")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("50 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1870/-")
                .setCode("*443#")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nTo subscribe to 2G, 3G and 4G bundles dial *443#.\nAlternatively, customers can dial 777 or visit their nearest Jazz Experience Center/Jazz Point.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Social")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 67/-")
                .setCode("*660#")
                .setDescription("(Facebook, IMO + WhatsApp)\nStatus Code: *660*2#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Youtube")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 90/-")
                .setCode("*570#")
                .setDescription("Status Code: *570*2#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Social")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("6 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 150/-")
                .setCode("*117*45#")
                .setDescription("Status Code: *117*45*2#\nFacebook & WhatsApp Only")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Extreme")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 95/-")
                .setCode("*117*14#")
                .setDescription("Status Code: *117*14*2#\nDe-Activation Code: *117*14*4#\n2am - 2pm")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Extreme")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 168/-")
                .setCode("*117*34#")
                .setDescription("Status Code: *117*34*2#\nDe-Activation Code: *117*34*4#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Streamer")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 107/-")
                .setCode("*117*7#")
                .setDescription("Status Code: *117*7*2#\nDe-Activation Code: *117*7*4")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Premium")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("3 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 165/-")
                .setCode("*117*47#")
                .setDescription("Status Code: *117*47*2#\nDe-Activation Code: *117*47*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Mega")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("7 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 225/-")
                .setCode("*159#")
                .setDescription("Status Code: *159*2#\nDe-Activation Code: *159*4")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Mega 20GB")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 300/-")
                .setCode("*117*48#")
                .setDescription("10GB (24hr) + 10GB (usable 1am - 8am)\nStatus Code: *117*48*2#\nDe-Activation Code: *117*48*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Starter")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("4 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 242/-")
                .setCode("*117*77#")
                .setDescription("2GB 2am - 2pm\nStatus Code: *117*77*2#\nDe-Activation Code: *117*77*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Starter")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("8 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 422/-")
                .setCode("*117*31#")
                .setDescription("4GB 2am - 2pm\nStatus Code: *117*31*2#\nDe-Activation Code: *117*31*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Smart Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("15 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 600/-")
                .setCode("*117*35#")
                .setDescription("7.5GB (24hr) + 7.5GB (usable 1am - 9am)\nStatus Code: *117*35*2#\nDe-Activation Code: *117*35*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Basic Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("25 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 999/-")
                .setCode("*117*71#")
                .setDescription("12.5GB (24hr) + 12.5GB (usable 1am - 9am)\nStatus Code: *117*71*2#\nDe-Activation Code: *117*71*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Regular Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("60 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1500/-")
                .setCode("*117*73#")
                .setDescription("30.5GB (24hr) + 30.5GB (usable 1am - 9am)\nStatus Code: *117*73*2#\nDe-Activation Code: *117*73*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Mega 100GB")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("100 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2000/-")
                .setCode("*117*36#")
                .setDescription("50GB (24hr) + 50GB (usable 1am - 9am)\nStatus Code: *117*36*2#\nDe-Activation Code: *117*36*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Heavy Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2500/-")
                .setCode("*117*74#")
                .setDescription("75GB (24hr) + 75GB (usable 1am - 9am)\nStatus Code: *117*74*2#\nDe-Activation Code: *117*74*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Three Months Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("3 Months")
                .setPrice("Rs. 5500/-")
                .setCode("*117*15#")
                .setDescription("50GB/month\nStatus Code: *117*15*2#\nDe-Activation Code: *117*15*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("6 Months Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("600 GB")
                .setValidity("6 Months")
                .setPrice("Rs. 12000/-")
                .setCode("*117*16#")
                .setDescription("100GB/month\nStatus Code: *117*16*2#\nDe-Activation Code: *117*16*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Internet Regular")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("60 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1750/-")
                .setCode("*117*73#")
                .setDescription("30GB (24hr) + 30GB (usable 1am - 9am)\nStatus Code: *117*73*2#\nDe-Activation Code: *117*73*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Internet Mega")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("100 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2000/-")
                .setCode("*117*36#")
                .setDescription("50GB (24hr) + 50GB (usable 1am - 9am)\nStatus Code: *117*36*2#\nDe-Activation Code: *117*36*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Internet Heavy")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2500/-")
                .setCode("*117*74#")
                .setDescription("75GB (24hr) + 75GB (usable 1am - 9am)\nStatus Code: *117*74*2#\nDe-Activation Code: *117*74*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("3 Months Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("3 Months")
                .setPrice("Rs. 5500/-")
                .setCode("*117*15#")
                .setDescription("50GB/month\nStatus Code: *117*15*2#\nDe-Activation Code: *117*15*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("6 Months Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("600 GB")
                .setValidity("6 Months")
                .setPrice("Rs. 12000/-")
                .setCode("*117*16#")
                .setDescription("100GB/month\nStatus Code: *117*16*2#\nDe-Activation Code: *117*16*4")
                .build()
        );

        return packageList;
    }

    /**
     * method to get all the jazz/warid location based packages
     *
     * @return jazz/warid location based packages list
     */
    public List<Package> getLocationBasedPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("WhatsApp Daily Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("200 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 2/-")
                .setCode("*311#")
                .setDescription("Valuing customers convenience, Jazz brings its customers a daily WhatsApp offer for the residents of Alipur, Kabirwala, Khan Bela, Liaqatpur, Muzzaffergarh and Uch Sharif. Once subscribed, the offer will automatically be re-subscribed without having to dial the subs code.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Gujranwala Super Night Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("5 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 6/-")
                .setCode("*775#")
                .setDescription("Validity: 12am - 9am\nSuper night offer is for Gujranwala only.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Sahiwal Super Night Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("5 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 6/-")
                .setCode("*577#")
                .setDescription("Validity: 12am - 9am\nSuper night offer is for Sahiwal only.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Janoobi Punjab Super Night Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("5 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 8/-")
                .setCode("*742#")
                .setDescription("Validity 11pm - 9am (for one day)\nOffer is valid in the following cities: Karor Pakka, Lal Suhanra, Kabirwala, Bahawalpur, Shujabad, Jalalpur, Pirwala, Ahmadpur, East Khanewal, Ahmadpur East, Dera Ghazi Khan, Uch Sharif, Muzaffargarh, Alipur, Layyah, Jatoi Dajal, Tibba Sultanpur, Liaqatpur, Kat Addu, Multan, Taunsa, Dunyapur, Jahanian, Rojhan Rajanpur, Jampur, Yazman, Shorkot")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Sindh Super Data Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("5 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 8/-")
                .setCode("*773#")
                .setDescription("Validity: 11pm - 9am\nJazz brings an exciting offer for Hyderabad, Kotri & Jamshoro! Enjoy the Premium 4G experience by subscribing to Hyderabad Super Night Offer!")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Karachi Daily Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("1500 Msgs")
                .setInternet("250 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 12/-")
                .setCode("*400#")
                .setDescription("Offer is valid for entire Karachi and hub areas")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Sindh Daily Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("1500 Msgs")
                .setInternet("250 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 12/-")
                .setCode("*522#")
                .setDescription("Status Code: *522*2#\nOffer for Hyderabad, Dadu, Jamshoro, Kotri, Mirpur Khas, Tando Adam, Tando Alayaar and other areas.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("KPK Daily Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("1500 Msgs")
                .setInternet("250 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 12/-")
                .setCode("*291#")
                .setDescription("Status Code: *291*2#\nInfo Code: *291*3#\nOffer for Peshawar, Bajaur Agency, Kurram Agency, Khyber Agency, Charsada, Chakwal, Talagang, Mardan, Jhelum, Mehmand Agency, Taxila, Attock, Bannu, Harripur, Hangu, Tank, Nowshera, Kotli, DI Khan, Mansehra and other areas.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Punjab Daily Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("1000 Msgs")
                .setInternet("250 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 12/-")
                .setCode("*6000#")
                .setDescription("Status Code: *6000*2#\nOffer for Mandi, Bahauddin, Gujrat, Gujranwala, Jhang, Bakkhar, Sialkot, Mianwali, Hafizabad, Sargodha, Sheikhupura and other areas.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Lajawab Haftawaar Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("1500 Mins")
                .setOffNet("25 Mins")
                .setSms("2500 Msgs")
                .setInternet("2.5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 54/-")
                .setCode("*565#")
                .setDescription("Offer is for Mandi Bahaudin, Malakwal, Phalia, Dera Ghazi Khan, Jampur, Rajanpur, Dajal Rojahan, Taunsa")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Sindh Rabta Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("1000 Mins")
                .setValidity("7 Days")
                .setPrice("Rs. 54/-")
                .setCode("*766#")
                .setDescription("Status Code: *766*2#\nOffer for Sukkur, Jacobabad, Dharki, Ghotki, Thul, Naushero Feroz")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Super Chenab Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("600 Mins")
                .setOffNet("30 Mins")
                .setSms("600 Msgs")
                .setInternet("6 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 60/-")
                .setCode("*664#")
                .setDescription("Offer for Chiniot, Rabwa, Laliyan, Bhuwana, Jamiabad, Jhok Kalra, Mathruma, Darul Sadr, Ahmednagar, Chenab Nagar and Kot Syed jalal")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Haftawaar Data Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("500 Mins")
                .setInternet("13 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 70/-")
                .setCode("*545#")
                .setDescription("3GB Data + 10GB WhatsApp\nOffer for Hyderabad, Jamshoro, Jati, Jhampir, Karachi and more cities")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Sargodha Weekly Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("2000 Mins")
                .setSms("2000 Msgs")
                .setInternet("2 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 89/-")
                .setCode("*627#")
                .setDescription("Offer for Sargodha and Bhalwal and surrounding cities")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Attock, Harripur and Nowshera Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("300 Mins")
                .setInternet("7 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 100/-")
                .setCode("*589#")
                .setDescription("7GB Data (2GB 2am - 2pm)\nOffer is for Attock, Haripur and Nowshera Only")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Punjab Haftawaar Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOffNet("50 Mins")
                .setSms("5000 Msgs")
                .setInternet("10 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 100/-")
                .setCode("*307#")
                .setDescription("Status Code: *307*2#\n10GB Data (5GB 2am - 2pm)\nThis offer is for subscribers in Gujrat, Lalamusa and Jalalpur Jattan")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Haftawaar All Rounder Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("1000 Mins")
                .setOffNet("50 Mins")
                .setSms("1000 Msgs")
                .setInternet("1 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 120/-")
                .setCode("*747#")
                .setDescription("Offer is valid for Rawalpindi, Islamabad and Balochistan Cities include Quetta, Khuzdar, Gawadar, Pishin, Jaffarabad, Zhob, Ziarat etc")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Taxila Haftawaar Data Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 120/-")
                .setCode("*596#")
                .setDescription("Offer is valid for Taxila only")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Peshawar Chakwal Haftawaar Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOffNet("50 Mins")
                .setInternet("10 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 130/-")
                .setCode("*109#")
                .setDescription("Limited Time Offer")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Sindh Haftawaar Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("5000 Mins")
                .setOffNet("50 Mins")
                .setSms("5000 Msgs")
                .setInternet("10 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 222/-")
                .setCode("*406#")
                .setDescription("Status Code: *406*2*\nDe-Activation Code: *406*4#\nOffer is valid for Rahim Yar Khan, Daharki, Sadiqabad, Khan Bela, Kandhkot, Kashmore, Salehpat, Bhiria City, Larkana, Sukkur, Liaqatpur, Jacobabad, Feroze, Shahdkot, Khairpur, Thul, Shikarpur, Pano Aqil, Lakhi")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Karachi Mahana Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("5000 Mins")
                .setOffNet("150 Mins")
                .setSms("5000 Msgs")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 444/-")
                .setCode("*529#")
                .setDescription("Status Code: *529*2#\n10GB Data (5GB 2am - 2pm)\nThis offer is for Karachi only")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("DG Khan Monthly Hybrid")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("2000 Mins")
                .setOffNet("200 Mins")
                .setSms("4000 Msgs")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 300/-")
                .setCode("*705#")
                .setDescription("Status Code: *705*2#\nFree Minutes / SMS / Data will be usable 24 hours a day")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Karachi Monthly Facebook Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 45/-")
                .setCode("*532#")
                .setDescription("Status Code: *532*2#\nOffer for Karachi")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Shahdadkot Monthly Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("2000 Mins")
                .setOffNet("200 Mins")
                .setSms("4000 Msgs")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 300/-")
                .setCode("*873#")
                .setDescription("Limited Time offer")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Multan Social Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("3 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 30/-")
                .setCode("*499#")
                .setDescription("Status Code: *499*2#")
                .build()
        );

        return packageList;
    }

    /**
     * method to get all the important code list
     *
     * @return jazz/warid important code list
     */
    public List<Package> getOtherPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Balance Check")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setPrice("Rs. 0.12/-")
                .setCode("*111#")
                .setDescription("You can also check your balance by dialing 123")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Advance")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setPrice("Rs. 4.60/-")
                .setCode("*112#")
                .setDescription("Rs. 15 Advance\nDe-Activation Code: *112*4#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Balance Share")
                .setSim("JAZZ_WARID")
                .setPrice("Rs. 4.77+ Tax/-")
                .setNumber("5")
                .setDescription("Dial *100*<9230XXXXXXXX>*<amount>#\nAfter this, confirmation will have to sent by replying with '1' Jazz Share is a convenient, flexible and an easy service that lets users share balance of any amount ranging from Rs 15 to Rs. 500.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Check Your prepaid Package")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setCode("*444#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Menu")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setDescription("Subscription Send 'List' to 6611 Un-Subscription send 'UnSub' to 6611 with Jazz Menu.\nTo unsubscribe from a service the customer has to type 'unsub <Service Name>' and send it to 6611")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Internet Menu")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setCode("*443#")
                .setDescription("Read more about your favorite package from the Menu bar")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz FnF Advance")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setPrice("Rs. 1/-")
                .setCode("*1112#")
                .setDescription("Jazz FnF Advance is an additional service to Jazz advance, which allows any Jazz prepaid subscriber who has already utilized Jazz Advance or Super Advance and not yet repaid Jazz/Advance.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Conference Call")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setCode("*188#")
                .setDescription("With the Conference call feature, you can add up to 5 numbers on a conference call including on-net, off-net and international numbers\nDe-Activation Code: *188*1#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Beep Call")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setPrice("Rs. 0.05/-")
                .setCode("5188")
                .setDescription("Subscription: Send 'SUB' to 5188\nUn-Subscription: Send 'UNSUB' to 5188 with beep call")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Intro Me")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 0.51/-")
                .setCode("*6060")
                .setDescription("Jazz Intro Me gives the facility to send a quick introduction to the receiver by making a flash message appear on receivers mobile while the phone rings. You have the facility to the customize messages or greeting for every caller.\n Call charges with prefix: Rs. 0.70/30 sec.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("End of Call Notification")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.08/-")
                .setCode("*122#")
                .setDescription("De-Activation Code: *122*4\n Once subscribed to the End of call notifications, you receive a notification regarding your call cost and the remaining account balance everytime you end a call.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Call & SMS Block Service")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.18/-")
                .setCode("*420#")
                .setDescription("Now with Jazz's call & SMS Block service customers can block unwanted calls and SMS from on-net and off-net numbers")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Missed Call Alert")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.25/-")
                .setCode("*180#")
                .setDescription("De-Activation Code: *180*1#\nThis service notifies a subscriber about the calls missed due to reasons like: out of coverage or handset powered off.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Job Alerts")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.42/-")
                .setCode("5622")
                .setDescription("To subscribe on the service send 'sub' to 5622. To unsubscribed from the service send 'unsub' to 5622. Are you looking for a job? Then jazz job alerts is at your service. Stay up to date with local and international jobs.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Double Up Number")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.44/-")
                .setCode("4030")
                .setDescription("De-Activation Code: 4030\nSubscription Dial 4030 and press '1'.\nUn-subscription Dial 4030 and press '0'.\nCharges Subscription: PKR 1.43/Day. Double Up Number service allows a subscriber to have a virtual number in addition to the primary number on the same SIM.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Tunes")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 2.01 + Tax/-")
                .setCode("230")
                .setDescription("Subscription Dial: 230 or 'sub' to 230\nUn-Subscription Dial 230 or send 'unsub' to 230 SMS: Rs, 9.55 + Tax per SMS")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz My Status")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 1.2/-")
                .setCode("6085")
                .setDescription("Rs. 1.20/day\nSubscription SMS 'SUB' to 6085\nUn-subscription SMS 'UNSUB' to 6525 With Jazz My Status you can post a status to the calling party upon receiving a call from them.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Smart SMS")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 2.99/-")
                .setCode("*66#")
                .setDescription("Rs. 0.60 + tax per opt-in\nRs. 2.99 + tax Weekly(prepaid)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Call Tag")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 5.98/-")
                .setCode("*642#")
                .setDescription("Subscription: *642#\nUn-subscription: Send Unsub to 6425\nCall Charges: Rs. 0.597/min")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Auto Reply")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 7.14/-")
                .setCode("7071")
                .setDescription("De-Activation Code: *7071#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Zero Balance Call")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 7.15/-")
                .setCode("*600#")
                .setDescription("The Zero Balance Call service allows prepaid customers to generate calls and send SMS to B-party, when they have zero balance.\nAllowed calls: 2 calls of 60 secs each.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Notify Me")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 1/-")
                .setCode("*6528#")
                .setDescription("De-Activation Code: *6528*1#\nCharges subscription: Rs. 1 + tax")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("SMS Delivery Receipt")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 17.92/-")
                .setCode("7344")
                .setDescription("Subscription: Send 'SUB' to 7344\nUn-subscription: Send 'UNSUB' to 7344")
                .build()
        );

        return packageList;
    }
}
