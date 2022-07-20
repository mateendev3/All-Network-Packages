package com.gmail.mateendev3.allnetworkpackages.data;

import com.gmail.mateendev3.allnetworkpackages.R;
import com.gmail.mateendev3.allnetworkpackages.contract.SimDataProvider;
import com.gmail.mateendev3.allnetworkpackages.model.Package;

import java.util.ArrayList;
import java.util.List;

public class TelenorDataProvider implements SimDataProvider {
    @Override
    public List<Package> getCallPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Make your own offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("Any Mins")
                .setOffNet("Any Mins")
                .setSms("Any Msgs")
                .setInternet("Any MB")
                .setValidity("1, 7, 30 Days")
                .setCode("*347#")
                .setDescription("Get the freedom to choose and personalize an offer that is just perfect for you.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Telenor Good Time Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setInternet("250 MB")
                .setValidity("2 Hour")
                .setPrice("Rs. 6/-")
                .setCode("*345*20#")
                .setDescription("Enjoy 2 hours of talktime to any Telenor number (except 6pm to 9pm) and 200 MB internet + 50 MB for facebook for 2 hours.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Telenor Superload offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("20 Mins")
                .setValidity("1 Day")
                .setPrice("Rs. 0.8/-")
                .setCode("*5*100#")
                .setDescription("Get 20 free minutes for all network upon recharge of Rs. 100 or more.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Ticky Pack Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("50 Mins")
                .setValidity("1 Day")
                .setPrice("Rs. 11/-")
                .setCode("*345*050#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Full Day Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setInternet("150 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 13/-")
                .setCode("*5*250#")
                .setDescription("50MBs + 100MBs WhatsApp")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("3 Day Onnet Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("250 Mins")
                .setSms("500 Msgs")
                .setInternet("15 MB")
                .setValidity("3 Days")
                .setPrice("Rs. 36/-")
                .setCode("*730#")
                .setDescription("All djuice customers are eligible for this offer.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Telenor 3/3 Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("600 Mins")
                .setSms("300 Msgs")
                .setInternet("50 MB")
                .setValidity("3 Days")
                .setPrice("Rs. 50/-")
                .setCode("*345*243#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("3 Day Sahulat Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("250 Mins")
                .setOffNet("25 Mins")
                .setSms("250 Msgs")
                .setInternet("150 MB")
                .setValidity("3 Days")
                .setPrice("Rs. 52/-")
                .setCode("*5*3#")
                .setDescription("50 MB internet along with 100 MB Social Pack")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("First Free Call Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setValidity("7 Days")
                .setPrice("Rs. 5/-")
                .setCode("*888#")
                .setDescription("Get First Telenor Call of the day for free between 12am - 12pm everyday for 7 days, including the day subscriptions.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Haftawaar Offpeak Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setValidity("7 Days")
                .setPrice("Rs. 55/-")
                .setCode("*978#")
                .setDescription("Unlimited on-net minutes form 12 am - 7 pm")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Sahulat Mini Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("200 Mins")
                .setOffNet("20 Mins")
                .setSms("200 Msgs")
                .setInternet("300 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 75/-")
                .setCode("*170#")
                .setDescription("100MB internet along with 200MB Social Pack.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Haftawaar Chappar Phaar Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setInternet("420 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 90/-")
                .setCode("*5*700#")
                .setDescription("70 MB + 350 Social MBs")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Haftawaar Sahulat Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("1000 Mins")
                .setOffNet("70 Mins")
                .setSms("700 Msgs")
                .setInternet("450 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 115/-")
                .setCode("*5*7#")
                .setDescription("100MB internet along with 350MB Social Pack.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Weekly Easy Card")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("1000 Mins")
                .setOffNet("50 Mins")
                .setSms("1000 Msgs")
                .setInternet("1.5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 135/-")
                .setCode("*963#")
                .setDescription("Telenor weekly easy card can be subscribed by going to any nearby retailer or by getting an easy card scratch card or by dialing *963#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Weekly Easy Card Plus")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("1500 Mins")
                .setOffNet("60 Mins")
                .setSms("1500 Msgs")
                .setInternet("3 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 175/-")
                .setCode("*175#")
                .setDescription("Telenor weekly easy card can be subscribe by going to any nearby retailer or by dialing code.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Mega Weekly Easy Card")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("2000 Mins")
                .setOffNet("70 Mins")
                .setSms("2000 Msgs")
                .setInternet("10 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 222/-")
                .setCode("*001#")
                .setDescription("Internet: 10 GB (include 5GB 1am - 11am)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Easy Card 450")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("500 Mins")
                .setOffNet("50 Mins")
                .setSms("500 Msgs")
                .setInternet("3 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 450/-")
                .setCode("*350#")
                .setDescription("1 GB internet + 2 GB WhatsApp")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Easy Card 600")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("3000 Mins")
                .setOffNet("150 Mins")
                .setSms("3000 Msgs")
                .setInternet("12 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 600/-")
                .setCode("*530#")
                .setDescription("Internet 6GB + 6GB (1am - 11am)\nInternational Dialing 25 minutes Canada / US / UK\nThis offer can by subscribed by going ti any nearby retailer, by getting an easy card 600 Scratch card of by dialing code.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Easy Card 800")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("5000 Mins")
                .setOffNet("300 Mins")
                .setSms("5000 Msgs")
                .setInternet("18 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 800/-")
                .setCode("*80#")
                .setDescription("Internet 9GB + 9GB (1am - 11am)\nThis offer can be subscribed by going to any nearby retailer, by getting any easy card 800 scratch card or by dialing code.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("On Net Bundle 100")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("500 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 100/-")
                .setCode("*345*831#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("On-net Bundle 250")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("1000 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 250/-")
                .setCode("*345*832#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("On Net Bundle 550")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("2500 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 550/-")
                .setCode("*345*833#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Any Network Voice Bundle 50")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("100 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 100/-")
                .setCode("*345*821#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Any Network Voice Bundle 250")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("250 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 250/-")
                .setCode("*345*822#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Any Network Packages 550")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("550 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 550/-")
                .setCode("*345*823#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom 300")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("1000 Mins")
                .setOffNet("150 Mins")
                .setSms("1000 Msgs")
                .setInternet("4 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 400/-")
                .setCode("*345*93#")
                .setDescription("This offer is valid for postpaid numbers only.\n4GB (2GB  12pm - 5pm)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom 600")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("2000 Mins")
                .setOffNet("300 Mins")
                .setSms("2000 Msgs")
                .setInternet("9 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 800/-")
                .setCode("*345*93#")
                .setDescription("This offer is valid for postpaid numbers only.\n9GB (2GB  12pm - 5pm)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom 1000")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("500 Mins")
                .setSms("8000 Msgs")
                .setInternet("12 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1350/-")
                .setCode("*345*93#")
                .setDescription("This offer is valid for postpaid numbers only.\nFree Afternoons: 4GB (12pm - 5pm)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom 1500")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("800 Mins")
                .setSms("15000 Msgs")
                .setInternet("32 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2000/-")
                .setCode("*345*93#")
                .setDescription("This offer is valid for postpaid numbers only.\nFree Afternoons: 7GB (12pm - 5pm)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Smart 300")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("300 Mins")
                .setSms("50 Msgs")
                .setInternet("300 MB")
                .setValidity("1 Month")
                .setPrice("Rs. 403/-")
                .setDescription("This offer is valid for postpaid numbers only.\nVisit your nearest retailer for activation.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Smart 600")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("700 Mins")
                .setSms("100 Msgs")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 850/-")
                .setDescription("This offer is valid for postpaid numbers only.\nVisit your nearest retailer for activation.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Smart 1000")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("1200 Mins")
                .setSms("1000 Msgs")
                .setInternet("1.5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1450/-")
                .setDescription("This offer is valid for postpaid numbers only.\nVisit your nearest retailer for activation.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Smart 1500")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("1800 Mins")
                .setSms("1500 Msgs")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2150/-")
                .setDescription("This offer is valid for postpaid numbers only.\nVisit your nearest retailer for activation.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Smart 3000")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("3600 Mins")
                .setSms("3000 Msgs")
                .setInternet("4 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 4200/-")
                .setDescription("This offer is valid for postpaid numbers only.\nVisit your nearest retailer for activation.")
                .build()
        );

        return packageList;
    }

    @Override
    public List<Package> getSMSPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Daily SMS Bundle")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("240 Msgs")
                .setValidity("1 Day")
                .setPrice("Rs. 4.78/-")
                .setCode("*345*116#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("5 Days SMS Bundle")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("300 Msgs")
                .setValidity("5 Days")
                .setPrice("Rs. 8.5/-")
                .setCode("*345*015#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Weekly SMS Bundle")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("1200 Msgs")
                .setValidity("7 Days")
                .setPrice("Rs. 15.5/-")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("15 Days Economy SMS Bundle")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("800 Msgs")
                .setValidity("15 Days")
                .setPrice("Rs. 17/-")
                .setCode("*345*112#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Month SMS Bundle")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("10000 Msgs")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 60/-")
                .setCode("*345*363#")
                .setDescription("SMS 10,000 + 1 GB WhatsApp")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("SMS Bundle 30")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("250 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 30/-")
                .setCode("*345*761#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("SMS Bundle 60")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("600 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 60/-")
                .setCode("*345*762#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("SMS Bundle 200")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("6000 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 200/-")
                .setCode("*345*763#")
                .build()
        );

        return packageList;
    }

    @Override
    public List<Package> getInternetPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Daily Offpeak Offer")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("1.5 GB")
                .setValidity("12 Hours")
                .setPrice("Rs. 15/-")
                .setCode("*10#")
                .setDescription("Internet 1500MB 6am - 6pm\nValidity: 12 Hours 6am - 6pm")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Raat Din Offer")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("1.5 GB")
                .setValidity("12 Hours")
                .setPrice("Rs. 18/-")
                .setCode("*150#")
                .setDescription("12 Hours (12am - 12pm)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Daily Social Pack")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("50 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 1.5/-")
                .setCode("*311#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Daily YouTube Packages")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("500 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 8/-")
                .setCode("*60#")
                .setDescription("The subscription is valid for 1 day (till midnight)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Daily Bundle")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("250 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 15/-")
                .setCode("*13#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G 3 Day Bundle")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("3 Days")
                .setPrice("Rs. 44/-")
                .setCode("*32#")
                .setDescription("Internet: 1000MB (incl. 500MB 12am - 8am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Late Night Offer")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 50/-")
                .setCode("*19#")
                .setDescription("Validity: 7 days (12am - 12pm")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Weekly 6 to 6 Offer")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("4 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 55/-")
                .setCode("*71#")
                .setDescription("Validity: 7 Days (6am - 6pm)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Weekly YouTube Packages")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 80/-")
                .setCode("*220#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Weekly Super")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("4 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 110/-")
                .setCode("*288#")
                .setDescription("Internet 4GB (incl 2GB from 1am - 11am)")
                .build()
        );



        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Weekly Ultra")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("8 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 185/-")
                .setCode("*336#")
                .setDescription("8GB internet + 1 GB Goonj/Gamebox")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Weekly Ultra Plus")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 240/-")
                .setCode("*225#")
                .setDescription("Volume: Internet: 10GB + 10GB (1am - 11am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Montly WhatsApp Offer")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("1.5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 5/-")
                .setCode("*247#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Social Pack")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("3.1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 45/-")
                .setCode("*911#")
                .setDescription("Internet 100MB\nFacebook and WhatsApp 3000MB")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Social Pack Plus")
                .setSim("TELENOR")
                .setNumber("3")
                .setSms("10000 Msgs")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 75/-")
                .setCode("*660#")
                .setDescription("5GB for facebook, WhatsApp and Twitter and 10,000 SMS for the entire month.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Lite")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("3 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 150/-")
                .setCode("*301#")
                .setDescription("Volume: 2000 MB Internet + 1000 MB WhatsApp/Goonj/Gamebox")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Starter Bundle")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("8 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 300/-")
                .setCode("*302#")
                .setDescription("Volume: 4,000MB + 4,000MB(1am - 7am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Ultra")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 450/-")
                .setCode("*335#")
                .setDescription("Internet 10GB + 10GB (12am - 8am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Ultra Plus")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("50 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 700/-")
                .setCode("*303#")
                .setDescription("Internet 50GB (incl. 25GB 1am - 11am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("5GB YouTube Add-On Bundle")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 186/-")
                .setCode("*345*78#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("10 GB YouTube Add-On Bundle")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 372/-")
                .setCode("*345*72#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom Internet 250")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 250/-")
                .setCode("*345#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom Internet 500")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500/-")
                .setCode("*345#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom Internet 800")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("8 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 800/-")
                .setCode("*345#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom Internet 1200")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("12 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1200/-")
                .setCode("*345#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom Internet 2000")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("25 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2000/-")
                .setCode("*345#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Budget")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("9 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500/-")
                .setCode("*345*2001#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Starter")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("15 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 750/-")
                .setCode("*345*2002#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Lite")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1500/-")
                .setCode("*345*1001#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Smart")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("75 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2500/-")
                .setCode("*345*1002#")
                .setDescription("Internet: 75GB + 75GB (Free Nights form 1am to 7am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Value")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 3800/-")
                .setCode("*345*1003#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Lite")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1500/-")
                .setCode("*345*1001#")
                .setDescription("Internet: 30Gb + 30GB (Free nights from 1am to 7am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Smart")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("75 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2500/-")
                .setCode("*345*1002#")
                .setDescription("Internet: 75GB + 75GB (Free Nights from 1am - 7am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Value")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 3800/-")
                .setCode("*345*1003#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Unlimited")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("275 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 6000/-")
                .setCode("*345*1004#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G 3 Month Bundle")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("108 GB")
                .setValidity("3 Month")
                .setPrice("Rs. 4000/-")
                .setCode("*345*1005#")
                .setDescription("Volume: 108GB (36GB/30day)")
                .build()
        );

        return packageList;
    }

    @Override
    public List<Package> getLocationBasedPackages() {
        return null;
    }

    @Override
    public List<Package> getOtherPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Sim Lagao Offer")
                .setSim("TELENOR")
                .setNumber("5")
                .setOnNet("3000 Mins")
                .setInternet("10 GB")
                .setValidity("2 Month")
                .setPrice("Rs. Free/-")
                .setCode("2222")
                .setDescription("10GB (from 12am to 7pm)\nDial IVR 2222 to avail this offer\n50 free minutes will be posted on offer validity period. 5GB will be posted on offer subscription and 5GB will be posted again 30 Days.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("EMERGENCY LOAD")
                .setSim("TELENOR")
                .setNumber("5")
                .setPrice("Rs. 5.3/-")
                .setCode("*0#")
                .setDescription("With Telenor Emergency Load, you can now get a load of Rs. 20.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Balance Inquiry")
                .setSim("TELENOR")
                .setNumber("5")
                .setPrice("Rs. 0.24/-")
                .setCode("*444#")
                .setDescription("*444# (balance) | *111# (SMS) | *222# (Minutes) | *999# (Internet)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("SMART SHARE")
                .setSim("TELENOR")
                .setNumber("5")
                .setPrice("Rs. 5.98/-")
                .setDescription("*1*1*923xxxxxxxxx*amount# and press 1 to confirm the balance transfer\nShare between 20 to 200 Rs.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("SACHA SMS")
                .setSim("TELENOR")
                .setNumber("5")
                .setPrice("Rs. FREE/-")
                .setCode("*1122#")
                .setDescription("Now receive all details about your balance usage & spending on calls, SMS, Internet, Smart Tune and VAS along with recharge information.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("CALL RASEED")
                .setSim("TELENOR")
                .setNumber("5")
                .setPrice("Rs. FREE/-")
                .setCode("*460#")
                .setDescription("Un-subscribe: *460# then press 1.\nGet free call duration and call cost details after every call in a flash message.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("SMART TUNES")
                .setSim("TELENOR")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.79/-")
                .setCode("*230*000#")
                .setDescription("De-Activation Code: *230*001#\nDial 230 (Rs. 1.20 call setup free incl. tax) while listening to any smart tune on a call before it is answered.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("MISSED CALL ALERTS")
                .setSim("TELENOR")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 4.77/-")
                .setCode("*345*622#")
                .setDescription("De-Activation Code: *345*623#\nDon't miss a call even when your phone is out of reach or switched off.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("CALL AND SMS BLOCKER")
                .setSim("TELENOR")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 8.96/-")
                .setCode("*420#")
                .setDescription("Un-subscribe: SMS 'USUB' to 420\nto add a number to blacklist: SMS B<space><Number> to 420\nTo remove number from blacklist: SMS UB<space><number> to 420.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("SMART NUMBER")
                .setSim("TELENOR")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 10/-")
                .setCode("*345*7700#")
                .setDescription("De-Activation Code: *345*7701#\nYou can now have 2 numbers on 1 sim so you do not need to carry two phones with you anymore.")
                .build()
        );


        return packageList;
    }
}
