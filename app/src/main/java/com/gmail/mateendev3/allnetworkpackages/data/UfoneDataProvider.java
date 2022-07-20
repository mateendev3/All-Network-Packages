package com.gmail.mateendev3.allnetworkpackages.data;

import com.gmail.mateendev3.allnetworkpackages.R;
import com.gmail.mateendev3.allnetworkpackages.contract.SimDataProvider;
import com.gmail.mateendev3.allnetworkpackages.model.Package;

import java.util.ArrayList;
import java.util.List;

public class UfoneDataProvider implements SimDataProvider {
    @Override
    public List<Package> getCallPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Power Hour")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("60 Mins")
                .setSms("60 Msgs")
                .setInternet("60 MB")
                .setValidity("1 Hour")
                .setPrice("Rs. 7.17/-")
                .setCode("*99#")
                .setDescription("Additional call setup charges of Rs. 0.13 + tax will be charged on every call.\n Please dail *707# to check remaining minutes, SMS and data volume")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Best Call Offer")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setValidity("2 Hour")
                .setPrice("Rs. 6/-")
                .setCode("*343#")
                .setDescription("Not available between 5pm - 9pm \n Additional call setup charges of Rs. 0.13 + tax will be charged on every call")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Beyhisaab Offer")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setValidity("1 Day")
                .setPrice("Rs. 14.5/-")
                .setCode("*5700#")
                .setDescription("Fair Usage Policy of 300 minutes per subscription applies. \n Addition call setup charges of Rs. 0.13/- tax will be charged of every call.")
                .build()

        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Daily Pakistan Offer")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("100 Mins")
                .setInternet("10 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 18/-")
                .setCode("*888#")
                .setDescription("Offer will be automatically renewed at 12:00 AM (PST)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Super Recharge Offer")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("300 Mins")
                .setOffNet("10 Mins")
                .setSms("700 Msgs")
                .setInternet("100 MB")
                .setValidity("2 Day")
                .setPrice("Rs. 53/-")
                .setCode("*300#")
                .setDescription("You can also your nearest retailer, or subscribe through My Ufone App")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Weekly Pakistan Offer")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("700 Mins")
                .setInternet("100 MB")
                .setValidity("7 Day")
                .setPrice("Rs. 100/-")
                .setCode("*8888#")
                .setDescription("Dail to *707# to check remaining minutes and data volume, charged at 20 paise+tax")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Asli Chapper Phaar Offer")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("100 Mins")
                .setSms("100 Msgs")
                .setInternet("1 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 120/-")
                .setCode("*5050#")
                .setDescription("Please dial *707#to check remaining minutes ,SMS and data volume")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Super Minutes")
                .setSim("UFONE")
                .setNumber("1")
                .setOffNet("100 Mins")
                .setValidity("7 Day")
                .setPrice("Rs. 135/-")
                .setCode("*210#")
                .setDescription("You can also your nearest retailer, or subscribe through My Ufone App")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Mini Super Card")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("500 Mins")
                .setOffNet("75 Mins")
                .setSms("3500 Msgs")
                .setInternet("600 MB")
                .setValidity("15 Day")
                .setPrice("Rs. 330/-")
                .setCode("*230#")
                .setDescription("You can also your nearest retailer, or subscribe through My Ufone App")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Monthly Pakistan Offer")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("4000 Mins")
                .setInternet("400 MB")
                .setValidity("1 Month")
                .setPrice("Rs. 418/-")
                .setCode("*8888#")
                .setDescription("dail *707# to check remaining minutes and data volume, charged at 20 paise+tax")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Super Card Plus")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("180 Mins")
                .setSms("4200 Msgs")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 599/-")
                .setCode("*250#")
                .setDescription("You can also your nearest retailer, or subscribe through My Ufone App\n 2000MB+5000Mb Facebook")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Super Card Gold")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("300 Mins")
                .setSms("Unlimited Msgs")
                .setInternet("5 Gb")
                .setValidity("1 Month")
                .setPrice("Rs. 999/-")
                .setCode("*900#")
                .setDescription("You can also your nearest retailer, or subscribe through My Ufone App\n 5000MB+7000Mb Facebook")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("PrimeCall 1500(On Net")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("1500 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 200+t/-")
                .setCode("*2525#")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Prime Call Unlimited(On Net)")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 500+t/-")
                .setCode("*2500#")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("PrimeTalk 250(off Net")
                .setSim("UFONE")
                .setNumber("1")
                .setOffNet("250 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 250+t/-")
                .setCode("*4848#")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("PrimeTalk 500(Off Net)")
                .setSim("UFONE")
                .setNumber("1")
                .setOffNet("500 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 500+t/-")
                .setCode("*5656#")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Prime 400")
                .setSim("UFONE")
                .setNumber("1")
                .setOffNet("400 Mins")
                .setSms("2000 Msgs")
                .setInternet("2 Gb")
                .setValidity("1 Month")
                .setPrice("Rs. 400/-")
                .setCode("")
                .setDescription("You can also your nearest retailer, or subscribe through My Ufone App")
                .build()
        );

        return packageList;
    }

    @Override
    public List<Package> getSMSPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Daily Package")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("1600 Msgs")
                .setValidity("1 Day")
                .setPrice("Rs. 4.77+t/-")
                .setCode("605")
                .setDescription("Subscribe: SMS Sub to 605")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Daily CHAT")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("10000 Msgs")
                .setInternet("500 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 6/-")
                .setCode("*3465#")
                .setDescription("500MB are usable for WhatsApp only\n To check remaining resources dail *706#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("2-in-1 SMS Offer")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("5000+50 Msgs")
                .setValidity("3 Day")
                .setPrice("Rs. 9.99+t/-")
                .setCode("*615#")
                .setDescription("5000 local SMS\n 50 International SMS")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Weekly SMS Bucket")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("1250 Msgs")
                .setValidity("7 Days")
                .setPrice("Rs. 11.95+t/-")
                .setCode("608")
                .setDescription("Subscribe: SMS Sub to 608\n Only Uth pack Customer can avail this offer")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Fortnightly Package")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("10500 Msgs")
                .setValidity("14 Day")
                .setPrice("Rs. 39.3+t/-")
                .setCode("603")
                .setDescription("Subscription: SMS Sub to 603 ")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Unlimited Package")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("21,000 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 95.6+t/-")
                .setCode("607")
                .setDescription("Subscription: SMS Sub to 607")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("45 Day SMS Bucket" )
                .setSim("UFONE")
                .setNumber("2")
                .setSms("31,000 Msgs")
                .setValidity("1.5 Month")
                .setPrice("Rs. 118+t/-")
                .setCode("614")
                .setDescription("Subscription: SMS Sub to 614")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Yearly SMS Package")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("Unlimited Msgs")
                .setValidity("12 Month")
                .setPrice("Rs. 795+t/-")
                .setCode("601")
                .setDescription("Subscription: SMS Sub to 601\n *fair Usage Policy of 110,000 SMS apply")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Unlimited SMS Package")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("10000 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 150/-")
                .setCode("610")
                .setDescription("Subscription: SMS Sub to 610\n This offer is valid for postpaid number only")
                .build()
        );

        return packageList;
    }

    @Override
    public List<Package> getInternetPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("STREAMING OFFER")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("500 MB")
                .setValidity("1 Hour")
                .setPrice("Rs. 10/-")
                .setCode("*78#")
                .setDescription("500MB are only usable for Youtube and Dailymotion")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("SPECIAL DAILY")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("550 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 6/-")
                .setCode("*3461#")
                .setDescription("Validity: 1AM-9PM \n 500MB for Facebook WhatsApp Twitter and Line 50MB for all usage\n To check remaining resources dial *706#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("SOCIAL DAILY")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("100 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 6/-")
                .setCode("*4422#")
                .setDescription("100MB for Facebook Whatsapp Twitter To Check remaining resource dial *706#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Daily CHAT")
                .setSim("UFONE")
                .setNumber("3")
                .setSms("10000 Msgs")
                .setInternet("500 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 6/-")
                .setCode("*3465#")
                .setDescription("500MB for Facebook Whatsapp Twitter To Check remaining resource dial *706#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Daily Night")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("540 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 12/-")
                .setCode("*2256#")
                .setDescription("500MB for Facebook Whatsapp Twitter and Line 40MB for all usage To check remaining resource dial *706#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("MEGA Internet")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("2 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 15/-")
                .setCode("*550#")
                .setDescription("Validity: 1Am_ 8AM\nTo Check remaining resource dial *706#")
                .build()
        );



        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("DAILY HEAVY")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("575 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 18/-")
                .setCode("*2258#")
                .setDescription("500MB for Facebook Whatsapp Twitter and Line 40MB for all usage To check remaining resource dial *706#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("3 DAILY BUCKET")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("600 MB")
                .setValidity("3 Day")
                .setPrice("Rs. 30/-")
                .setCode("*3350#")
                .setDescription("500MB for Facebook Whatsapp Twitter and Line 40MB for all usage To check remaining resource dial *706#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("UFONE TIKTOK OFFER")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("1.5 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 50/-")
                .setCode("*2345#")
                .setDescription("1500 MB for Tiktok")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("SUPER INTERNET")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("1.2 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 135/-")
                .setCode("*220#")
                .setDescription("You can also visit your nearest retailer or subscriber through My Ufone App")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("WEEKLY INTERNET PLUS")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("6 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 180/-")
                .setCode("*260#")
                .setDescription("To Check remaining resources, dial *706#\n 3GB+3GB(from 1am to 8 am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("SOCIAL Monthly")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 60/-")
                .setCode("*5858#")
                .setDescription("100MB for Facebook Whatsapp Twitter and Line To check remaining resource dial *706#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Monthly Light")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("3 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 390/-")
                .setCode("*7807#")
                .setDescription("2GB for Facebook Whatsapp Twitter and Line\n 1GB to all usage\n To check remaining resource dial *706#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("SUPER INTERNET PLUS")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("13 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 499/-")
                .setCode("*290#")
                .setDescription("5GB Whatsapp\n 8GB for all usage\n To check remaining resource, dial *706#")
                .build()
        );



        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Monthly Heavy")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 780/-")
                .setCode("*803#")
                .setDescription("2GB for Facebook Whatsapp Twitter and Line\n 3GB for all usage\n To check remaining resource dial *706#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("MONTHLY MAX")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("12 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1560/-")
                .setCode("*5100#")
                .setDescription("100MB for Facebook Whatsapp Twitter and Line\n 10GB for all usage\n To check remaining resource dial *706#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("PrimePly 1000")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 100/-")
                .setCode("*323#")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("PrimePlay 3000")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("3 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 250/-")
                .setCode("*434#")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );



        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("PrimePlay 6000")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("6 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500/-")
                .setCode("*656#")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("PrimePlay 10000")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 750/-")
                .setCode("*989#")
                .setDescription("This offer is valid for postpaid number only")
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
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("SIM Lagoa Offer")
                .setSim("UFONE")
                .setNumber("5")
                .setOnNet("3000 Mins")
                .setSms("3000 Msgs")
                .setInternet("3 GB")
                .setValidity("1 Month")
                .setCode("*5000#")
                .setDescription("Ufone customers who have not use their SIM for over 60 days will now get the below mentioned incentive. Please note that customer will be awarded 50 U2U/ PTCl Min, 50 MBs 50 SMS daily for the next 60 days.However on spending Rs.5 per day or more, customers can get an additional 50 U_U/PTCL Min, 50 MBs, 50SMS")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Nayi SIM Offer")
                .setSim("UFONE")
                .setNumber("5")
                .setOnNet("500 Mins")
                .setSms("500 Msgs")
                .setInternet("1 GB")
                .setValidity("5 Days")
                .setCode("*1000#")
                .setDescription("Buy a new Ufone SIM or switch to Ufone network,dial *1000#vand get free Whatsapp for 3 Month. MoreEver, on every recharge of Rs. 50 or more with in the next 3 month get free 1GB Internet + 1GB for  Facebook, 500 U_U/ PTCL minutes and SMS for 5 days.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("UAdvance")
                .setSim("UFONE")
                .setNumber("5")
                .setPrice("Rs. 4.40+t/-")
                .setCode("*456#")
                .setDescription("Rs.20/ advance is available to all Ufone Subscriber, Whose balance drops below Rs. 11.95/.\n UAdvance gives the facility of getting instant balance whenever you are running low. ")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("UShare")
                .setSim("UFONE")
                .setNumber("5")
                .setPrice("Rs. 2.99+t/-")
                .setDescription("Dial *828*Recipient Number*Amount# e.g.*828*03330000000*10#\n Customer will be prompted with: Reply with: 1 to transfer Rs. 10 to 033300000000 ")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("UTunes")
                .setSim("UFONE")
                .setNumber("5")
                .setPrice("Rs. 1.5+t/-")
                .setCode("*6666#")
                .setDescription("Rs 1.5+t / day (Prepaid & Postpaid)\n To Unsubscribe UTunes write 'UNSUB' and send it to 6666.\n Let your friend and family hear your favorite tunes every time they call U! ")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("My Tunes")
                .setSim("UFONE")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.2+t/-")
                .setCode("666")
                .setDescription("DAil 666 and choose from a list of tunes that you like to set as your MyTune.\n Subscription: Rs.1.2/day\n Call to666: Rs 2.99/minutes\n Never be bored listening to the mainstream dial tone when U make a call again!")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("UNotification")
                .setSim("UFONE")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 0.12+t/-")
                .setCode("3030")
                .setDescription("Subscription: SMS Sub to 3030\n To UnSubscription SMS UnSub to 3030\n You now have the facility of sending a missed call to any local number of any network in Pakistan, even when you have no balance! \n Tired of missing out on important calls? Let UNotification remember and remind you")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Ufone Collect Call")
                .setSim("UFONE")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 0.72+t/-")
                .setCode("*111#")
                .setDescription("Now make call even if you don't want to pay for it or if you don't have balance.\nTo Unsubscribe the service, SMS Unsub to 902 To add a Ufone number to your collect Call FNF : Dial 901 and press 1 to build your FNF list.\n Just add your Friend and family to your list , so they can call you Whenever they want without Worrying about your balance")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Missed Call Notification")
                .setSim("UFONE")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 0.99+t/-")
                .setCode("180")
                .setDescription("Subscription: SMS Sub to 180 Allows U to be aware of the call you are missing When you cannot be reached or your phone is off.\n Rs.0.99/day-Prepaid\n Rs. 20.00. month - postpaid \n To UnSubscription: SMS  'UnSub' 180")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Kaun Hai ")
                .setSim("UFONE")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 0.99+t/-")
                .setCode("*406#")
                .setDescription("Preaid : Rs.0.99/day\n Postpaid: Rs.29.88/month\n With this services, user can now identify the person calling their phone before answering  the incoming call. By subscribing to 'Kaun Hai', users will receive a flash notification message on their screen with the caller's name, preceding the call.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("My Status")
                .setSim("UFONE")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.2+t/-")
                .setCode("*969#")
                .setDescription("Share your thoughts, ideas, status or any personalized message via Ufone My Status. Once your set up your status, your contacts will start receiving it as a flash SMS any time they call you.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("U Block")
                .setSim("UFONE")
                .setNumber("5")
                .setValidity("7 Day")
                .setPrice("Rs. 4.48+t/-")
                .setCode("*420#")
                .setDescription("Now enjoy Control over who call and next you.\n Prepaid Charges:Rs.4,48/ week\n Postpaid Charges:Rs.15.00/month\n o add and remove users *420#")
                .build()
        );

        return packageList;
    }
}
