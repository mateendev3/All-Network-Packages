package com.gmail.mateendev3.allnetworkpackages.data;

import com.gmail.mateendev3.allnetworkpackages.R;
import com.gmail.mateendev3.allnetworkpackages.contract.SimDataProvider;
import com.gmail.mateendev3.allnetworkpackages.model.Package;

import java.util.ArrayList;
import java.util.List;

public class ZongDataProvider implements SimDataProvider {
    @Override
    public List<Package> getCallPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Super Student Bundle")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setInternet("30 MB")
                .setValidity("2 Hours")
                .setPrice("Rs. 5 + tax/-")
                .setCode("*5555#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily Voice Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("20 Mins")
                .setValidity("1 Day")
                .setPrice("Rs. 5/-")
                .setCode("*45#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Full Gub Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("75 Mins")
                .setSms("100 Msgs")
                .setInternet("30 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 5 + tax/-")
                .setCode("*118*1#")
                .setDescription("Un-sub: SMS 'Unsub' to 1181\nMB's are usable for WhatsApp")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Sixer Plus Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setSms("500 Msgs")
                .setValidity("1 Day")
                .setPrice("Rs. 8 + tax/-")
                .setCode("*666#")
                .setDescription("Validity: 6am - 6pm\nTo Unsubscribe: SMS 'Unsub' to 666111")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Non Stop Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setValidity("1 Day")
                .setPrice("Rs. 10 + tax/-")
                .setCode("*777#")
                .setDescription("Offer Not Applicable: 7pm - 10pm\nUn-subscribe: SMS 'UnSub' to 7141")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily Unlimited Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setInternet("1 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 12 + tax/-")
                .setCode("*522#")
                .setDescription("Get 1MB mobile internet\nZong Unlimited Offers are auto-renewable\nTo De-Activate SMS 'unsub' to 522")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Flutter Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("120 Mins")
                .setSms("120 Msgs")
                .setInternet("50 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 12 + tax/-")
                .setCode("*369#")
                .setDescription("To Un-subscribe: SMS 'unsub' to 369")
                .build()
        );



        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Hello 1 Din Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("150 Mins")
                .setSms("150 Msgs")
                .setInternet("50 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 13 + tax/-")
                .setCode("*2200*1#")
                .setDescription("To Un-subscribe: SMS 'unsub' to 4952")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Shandaar Daily Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setSms("800 Msgs")
                .setInternet("50 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 14 + tax/-")
                .setCode("*999#")
                .setDescription("Get your hands on unlimited zong calls, 50MB, 800 sms")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Hello 7 Day Bundle")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("100 Mins")
                .setSms("100 Msgs")
                .setInternet("1 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 45 + tax/-")
                .setCode("310")
                .setDescription("Just Dial 310 and select 4 from main menu and follow instructions")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Weekly Unlimited Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setSms("150 Msgs")
                .setValidity("7 Days")
                .setPrice("Rs. 63 + tax/-")
                .setCode("522")
                .setDescription("To subscribe: Send 'PK7' to 522\nTo Un-scribe: SMS 'unsub' to 522")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Shandaar Haftawaar Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("500 Mins")
                .setOffNet("40 Mins")
                .setSms("500 Msgs")
                .setInternet("500 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 120 + tax/-")
                .setCode("*7#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Hello Monthly Day Bundle")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("100 Mins")
                .setSms("100 Msgs")
                .setInternet("1 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 170 + tax/-")
                .setCode("4952")
                .setDescription("Dial 310 and select 4 and follow the instructions")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("All - in - 1 Weekly")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("1000 Mins")
                .setOffNet("40 Mins")
                .setSms("1000 Msgs")
                .setInternet("2.5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 200/-")
                .setCode("6464")
                .setDescription("To Un-subscribe: dial *6464#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Haftawaar Load Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("5000 Mins")
                .setOffNet("80 Mins")
                .setSms("5000 Msgs")
                .setInternet("12 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 270/-")
                .setCode("*70#")
                .setDescription("6GB + 6GB(1am - 9am)\nTo un-subscribe: dial *6464#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Super Weekly Premium")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("100 Mins")
                .setInternet("30 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 330/-")
                .setCode("*225#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Voice 80 min Bundle")
                .setSim("ZONG")
                .setNumber("1")
                .setOffNet("80 Mins")
                .setSms("100 Msgs")
                .setValidity("15 Days")
                .setPrice("Rs. 120 + tax/-")
                .setCode("310")
                .setDescription("Dial 310 and select 5 and follow the instructions")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Combo Pack")
                .setSim("ZONG")
                .setNumber("1")
                .setOffNet("50 Mins")
                .setInternet("3 GB")
                .setValidity("15 Days")
                .setPrice("Rs. 200 + tax/-")
                .setCode("*15#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("WhatsApp Plus Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("200 Mins")
                .setOffNet("20 Mins")
                .setInternet("4 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 80/-")
                .setCode("*4000#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly Unlimited Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setSms("500 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 255 + tax/-")
                .setCode("522")
                .setDescription("To Subscribe: Send 'PK30' to 522\nTo Un-Subscribe: send SMS 'unsub' to 522.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Shandaar Mahana Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("1000 Mins")
                .setOffNet("100 Mins")
                .setSms("1000 Msgs")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 300 + tax/-")
                .setCode("*1000#")
                .setDescription("To Un-Subscribe: 'unsub Mahana' to 7091")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Voice 425 min Bundle")
                .setSim("ZONG")
                .setNumber("1")
                .setOffNet("425 Mins")
                .setSms("500 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 600 + tax/-")
                .setCode("310")
                .setDescription("Dial 310 and select 5 and follow the instructions")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Zong Super Card")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("3000 Mins")
                .setOffNet("180 Mins")
                .setSms("3000 Msgs")
                .setInternet("6 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 650/-")
                .setCode("6464")
                .setDescription("De-Activation: *6464#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Supreme Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("5000 Mins")
                .setOffNet("300 Mins")
                .setSms("5000 Msgs")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1000/-")
                .setCode("*3030#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Voice 900 min Bundle")
                .setSim("ZONG")
                .setNumber("1")
                .setOffNet("900 Mins")
                .setSms("1000 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 1200 + tax/-")
                .setCode("310")
                .setDescription("Dial 310 and select 5 and follow the instructions")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly Super Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("5000 Mins")
                .setOffNet("300 Mins")
                .setSms("5000 Msgs")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1300/-")
                .setCode("*4567#")
                .setDescription("20GB Internet + 6GB YouTube + 4GB WhatsApp")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Supreme Plus Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("10000 Mins")
                .setOffNet("600 Mins")
                .setSms("10000 Msgs")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1732/-")
                .setCode("*1500#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Work From Home Bundle")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("2500 Mins")
                .setOffNet("300 Mins")
                .setSms("2000 Msgs")
                .setInternet("4 GB")
                .setPrice("Rs. 499 + tax/-")
                .setCode("*567#")
                .setDescription("This is PostPaid bundle.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("ALL VOICE - 500")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("500 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 550 + tax/-")
                .setCode("*567#")
                .setDescription("Activation Points: *567#, 310 Smart IVR, My Zong App *310#, E-Care, Online Shop.\nDe-Activation Points: *567#, 310 Smart IVR, My Zong App, E-Care")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("ALL VOICE - 1000")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("1000 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 1000 + tax/-")
                .setCode("*567#")
                .setDescription("Activation Points: *567#, 310 Smart IVR, My Zong App *310#, E-Care, Online Shop.\nDe-Activation Points: *567#, 310 Smart IVR, My Zong App, E-Care")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Z500")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("1500 Mins")
                .setOffNet("300 Mins")
                .setSms("1000 Msgs")
                .setInternet("4 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500 + tax/-")
                .setDescription("This offer is only for Zong PostPaid Customers.\nFor Activation and further details please call 310 Helpline or visit nearest customer service center.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Z800")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("500 Mins")
                .setSms("2000 Msgs")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 800 + tax/-")
                .setDescription("This offer is only for Zong PostPaid Customers.\nFor Activation and further details please call 310 Helpline or visit nearest customer service center.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Z1200")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("800 Mins")
                .setSms("4000 Msgs")
                .setInternet("20 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1200 + tax/-")
                .setDescription("This offer is only for Zong PostPaid Customers.\nFor Activation and further details please call 310 Helpline or visit nearest customer service center.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Z2500")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("1200 Mins")
                .setSms("5000 Msgs")
                .setInternet("45 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2500 + tax/-")
                .setDescription("This offer is only for Zong PostPaid Customers.\nFor Activation and further details please call 310 Helpline or visit nearest customer service center.")
                .build()
        );

        return packageList;
    }

    @Override
    public List<Package> getSMSPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Zulu SMS Bundle")
                .setSim("ZONG")
                .setNumber("2")
                .setSms("500 Msgs")
                .setInternet("1 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 4 + tax/-")
                .setCode("*704#")
                .setDescription("To Un-Subscribe: Send 'unsubscribe' or 'unsub' to 704\nData Usage Check: Dial *102#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily SMS + WhatsApp")
                .setSim("ZONG")
                .setNumber("2")
                .setSms("500 Msgs")
                .setInternet("30 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 5 + tax/-")
                .setCode("*700#")
                .setDescription("Dial *700# and reply 1\nTo Un-Subscribe: Send 'unsubscribe' or 'unsub' to 700")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Weekly SMS Bundle")
                .setSim("ZONG")
                .setNumber("2")
                .setSms("1500 Msgs")
                .setInternet("200 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 21 + tax/-")
                .setCode("*702#")
                .setDescription("To Un-Subscribe: Send 'unsubscribe' or 'unsub' to 700")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("15 Days Unlimited SMS Bundle")
                .setSim("ZONG")
                .setNumber("2")
                .setOnNet("Unlimited Mins")
                .setValidity("15 Days")
                .setPrice("Rs. 149 + tax/-")
                .setCode("701")
                .setDescription("To Un-Subscribe: sms 'unsub' to 701")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly SMS + WhatsApp Bundle")
                .setSim("ZONG")
                .setNumber("2")
                .setSms("15000 Msgs")
                .setInternet("1.5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 50 + tax/-")
                .setCode("*705#")
                .setDescription("500 SMS / day for 30 days\n30MB/day for each 30 days and are only usable for WhatsApp\nTo Un-Subscribe: Send 'unsub' to 700")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("PostPaid 300")
                .setSim("ZONG")
                .setNumber("2")
                .setSms("300 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 25 + tax/-")
                .setCode("*567#")
                .setDescription("To Un-Subscribe: send sms 'unsub' to 700")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("PostPaid 700")
                .setSim("ZONG")
                .setNumber("2")
                .setSms("700 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 50 + tax/-")
                .setCode("*567#")
                .setDescription("To Un-Subscribe: send sms 'unsub' to 700")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("PostPaid Unlimited")
                .setSim("ZONG")
                .setNumber("2")
                .setSms("Unlimited Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 90 + tax/-")
                .setCode("*567#")
                .setDescription("To Un-Subscribe: send 'unsub' to 700")
                .build()
        );


        return packageList;
    }

    @Override
    public List<Package> getInternetPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily Facebook Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("500 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 5/-")
                .setCode("*32#")
                .setDescription("Now enjoy Facebook on Pakistan No. 1 Data Network.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("CLASSIFIED PACK")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("50 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 5+t/-")
                .setCode("*6464#")
                .setDescription("Dial *6464# and follow the on Screen instructions \n To Check Remaining MBs: Dial *102#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Social Pack")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("100 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 10+t/-")
                .setCode("*6464#")
                .setDescription("Dial *6464# and follow the on Screen instructions \n To Check Remaining MBs: Dial *102#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Good Night Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("2.5 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 16+t/-")
                .setCode("464")
                .setDescription("Subscribe:\n Just SMS 'gno' to 6464 \n Only Applicable from 1am to 9am\n To Check Remaining MBs: Dial *102#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Day Time Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("1.2 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 16+t/-")
                .setCode("*47#")
                .setDescription("Only Applicable from 4am to 7am \n Offer Duration: Limited Time Offer\n To Check remaining MBs: Dial *102#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily Basic")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("100 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 17+t/-")
                .setCode("*6464#")
                .setDescription("Dial *6464# and follow the on Screen instructions \n To Check Remaining MBs: Dial *102#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily Data Max")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 38+t/-")
                .setCode("*5#")
                .setDescription("5000MB + 5000MB YouTube\n To Check remaining: Dial *102#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("WEEKLY TIKTOK OFFER")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("2 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 50/-")
                .setCode("*606#")
                .setDescription("Now Enjoy fun video on TikTok on Pakistan No.\n 1 Data Network. Watch and create Crazy video on TikTok with 2 GB Data for the whole week @ only Rs. 35 tax")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Mega Data Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("100 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 100/-")
                .setCode("*808#")
                .setDescription("100GB(1am to 9am) for 7 days.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Weekly YouTube Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("8 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 135/-")
                .setCode("*570#")
                .setDescription("The Data resources can be utilized only for Youtube contain.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Super Weekly ")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("2.5 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 165/-")
                .setCode("*6464#")
                .setDescription("Dial *6464# and follow the on Screen instructions \n To Check Remaining MBs: Dial *102#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Super Weekly Plus")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("7 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 240/-")
                .setCode("*20#")
                .setDescription("To Check Remaining MBs: Dial *102#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Super Weekly Max")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 299/-")
                .setCode("*220#")
                .setDescription("30 GB[15 GB 15 GB Data for YouTube]\n To Check Remaining MBs: Dial *102#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("WhatsApp Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("4 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 50/-")
                .setCode("*247#")
                .setDescription("Now enjoy Monthly 4GB WhatsApp on Pakistan No.1 Data Network. \n To Check Remaining MBs: Dial *102#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("IMO OFFER")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 50/-")
                .setCode("*466#")
                .setDescription("Zong subscribe can enjoy all features of IMO at Rs. 20! Simply Dial *466# once\n Data Usage Check: Dial *102#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly Mini 150")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("150 MB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 50+t/-")
                .setCode("*6464#")
                .setDescription("Dial *6464# and follow the on Screen instructions \n To Check Remaining MBs: Dial *102#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("WhatsApp Plus Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("4GB")
                .setValidity("1 Month")
                .setPrice("Rs. 80/-")
                .setCode("*4000#")
                .setDescription("Now enjoy non-stop voice and video calls for a month on whatsApp Plus Offer.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("MONTHLY FACEBOOK OFFER")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("6 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 100/-")
                .setCode("*250#")
                .setDescription("Data Resources(To be consumed on Facebook only , include Facebook Messenger)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly Basic 500")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("500 MB")
                .setValidity("1 Month")
                .setPrice("Rs. 150+t/-")
                .setCode("*6464#")
                .setDescription("Dial *6464# and follow the on Screen instructions \n To Check Remaining MBs: Dial *102#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Data Share Bundle 5GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500+t/-")
                .setCode("*6464*5#")
                .setDescription("With Zong Data Share, you can share your data bundle with upto 10 friend and Family members. Only 1 person has to buy the data share bundle dial *6464*5# & follow the following steps.\n Step 1: create group step \n 2: Subscribe to bundle steps\n 3: Add member(s) & start sharing!")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly Premium 15 GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("15 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 600/-")
                .setCode("*6464#")
                .setDescription("15GB(including 5GB 1 AM to 9 AM)\n Dial *6464# and follow the on Screen instructions \n To Check Remaining MBs: Dial *102#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Data Share Bundle 10GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("10 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 900+t/-")
                .setCode("*6464*5#")
                .setDescription("With Zong Data Share, you can share your data bundle with upto 10 friend and Family members. Only 1 person has to buy the data share bundle dial *6464*5# & follow the following steps.\n Step 1: create group step \n 2: Subscribe to bundle steps\n 3: Add member(s) & start sharing!")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Data Share Bundle 40GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("40 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 1000/-")
                .setCode("*6464#")
                .setDescription("40Gb Data(including 20GB 1 AM to 9 AM)\n Dial *6464# and follow the on Screen instruction\n To Check Remaining  MBs: Dial *102#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("YouTube 12 GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("12 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 500+t/-")
                .setCode("*567#")
                .setDescription("Activation Point: *567#, 310 Smart IVR, My Zong App, *310#, E-Care, Online Shop.\n Deactivation Point: *567#, 310 Smart IVR, My zong App, *310#, E-Care")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("YouTube 25 GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("25 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 800/-")
                .setCode("*567#")
                .setDescription("Activation Point: *567#, 310 Smart IVR, My Zong App, *310#, E-Care, Online Shop.\n Deactivation Point: *567#, 310 Smart IVR, My zong App, *310#, E-Care")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("ZDATA 3 GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("3 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 250/-")
                .setCode("*567#")
                .setDescription("Activation Point: *567#, 310 Smart IVR, My Zong App, *310#, E-Care, Online Shop.\n Deactivation Point: *567#, 310 Smart IVR, My zong App, *310#, E-Care")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("ZDATA GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("10 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 600/-")
                .setCode("*567#")
                .setDescription("Activation Point: *567#, 310 Smart IVR, My Zong App, *310#, E-Care, Online Shop.\n Deactivation Point: *567#, 310 Smart IVR, My zong App, *310#, E-Care")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("ZDATA 20 GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 1000/-")
                .setCode("*567#")
                .setDescription("Activation Point: *567#, 310 Smart IVR, My Zong App, *310#, E-Care, Online Shop.\n Deactivation Point: *567#, 310 Smart IVR, My zong App, *310#, E-Care")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("MBB GOOD NIGHT OFFER")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 230/-")
                .setCode("*6767#")
                .setDescription(" Dial *6767# and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("150GB MBB Exclusive Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 3500/-")
                .setCode("*6767#")
                .setDescription("Dial *6767# and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 60 GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("60 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 2000/-")
                .setCode("*6767#")
                .setDescription("Dial *6767# and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 150GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 2500/-")
                .setCode("*6767#")
                .setDescription("150 GB (inc.75GB 4:00 AM to 4:00 PM )\n Dial *6767# and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 200GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("200 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 3250/-")
                .setCode("*6767#")
                .setDescription("200 GB (inc.100GB 4:00 AM to 4:00 PM )\n Dial *6767# and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("3 Month Package")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("180 GB")
                .setValidity("3 Monthly")
                .setPrice("Rs. 5500/-")
                .setCode("*6767#")
                .setDescription("60GB/Month\n Dial *6767# and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("6 Month Package")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("600 GB")
                .setValidity("6 Monthly")
                .setPrice("Rs. 12000/-")
                .setCode("*6767#")
                .setDescription("100 GB (inc.25GB 4:00 AM to 4:00 PM )/Month\n Dial *6767# and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("12 Month Package")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("1200 GB")
                .setValidity("12 Monthly")
                .setPrice("Rs. 22000/-")
                .setCode("*6767#")
                .setDescription("100 GB (inc.25GB 4:00 AM to 4:00 PM )/Month\n Dial *6767# and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Good Night Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 230/-")
                .setCode("*6666#")
                .setDescription("1GB/Day(1:00AM to 09:00 AM)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Day Time Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 570/-")
                .setCode("*6666#")
                .setDescription("1GB/Day(9:00am to 04:00 pm)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 8GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("8 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 750/-")
                .setCode("*6666#")
                .setDescription("4GB+4GB(4:00AM to 04:00 AM)\n To Activate Dial *6666# from your internet SIM or ask your nearest retailer to activate this offer for you \n Internet SIM cannot be used in zong MBB Devises.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 24GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("24 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 1200/-")
                .setCode("*6666#")
                .setDescription("12GB+12GB(4:00AM to 04:00 AM)\n To Activate Dial *6666# from your internet SIM or ask your nearest retailer to activate this offer for you \n Internet SIM cannot be used in zong MBB Devises.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 30GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 1800/-")
                .setCode("*6666#")
                .setDescription("To Activate Dial *6666# from your internet SIM or ask your nearest retailer to activate this offer for you \n Internet SIM cannot be used in zong MBB Devises.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 60GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("60 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 2000/-")
                .setCode("*6666#")
                .setDescription("To Activate Dial *6666# from your internet SIM or ask your nearest retailer to activate this offer for you \n Internet SIM cannot be used in zong MBB Devises.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 75GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("75 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 3250/-")
                .setCode("*6666#")
                .setDescription("175GB(Inc.100 GB from 1AM to 9Am), Validity 30 Days\n To Activate Dial *6666# from your internet SIM or ask your nearest retailer to activate this offer for you \n Internet SIM cannot be used in zong MBB Devises.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("3 Month Bundles 3GB/Month")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("9 GB")
                .setValidity("3 Monthly")
                .setPrice("Rs. 1150/-")
                .setCode("*6666#")
                .setDescription("3GB/Month\n To Activate Dial *6666# from your internet SIM or ask your nearest retailer to activate this offer for you \n Internet SIM cannot be used in zong MBB Devises.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("3 Month Bundles 12GB/Month")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("36 GB")
                .setValidity("3 Monthly")
                .setPrice("Rs. 2790/-")
                .setCode("*6666#")
                .setDescription("12GB/Month\n To Activate Dial *6666# from your internet SIM or ask your nearest retailer to activate this offer for you \n Internet SIM cannot be used in zong MBB Devises.")
                .build()
        );

        return packageList;
    }

    @Override
    public List<Package> getLocationBasedPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("AJK Daily Offer")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("unlimited Mins")
                .setValidity("1 Day")
                .setPrice("Rs. 12+t/-")
                .setCode("522")
                .setDescription("Subscribe now by sending 'AJK' to 522")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily Zong Unlimited Offer")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setValidity("1 Day")
                .setPrice("Rs. 12+t/-")
                .setCode("*522#")
                .setDescription("Available in selected cities only")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Karachi Daily Offer")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setInternet("125 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 13+t/-")
                .setCode("522")
                .setDescription("Subscribe now by sending 'KHI7' to 522 or dial *544#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily Mehran(Sindh)")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("500 Msgs")
                .setInternet("125 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 25/-")
                .setCode("2345")
                .setDescription("Dial *2345# and chose the offer of your choice \n These offer are available in entire sindh province except Karachi.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("BOL LAHORE OFFER")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("300 Mins")
                .setOffNet("50 Mins")
                .setSms("500 Msgs")
                .setInternet("75 MB")
                .setValidity("1 Day")
                .setPrice("Rs.25/-")
                .setCode("*2233#")
                .setDescription("This offer is available in Lahore only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("AJK WEEKLY OFFER")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setValidity("7 Days")
                .setPrice("Rs. 60+t/-")
                .setCode("522")
                .setDescription("Subscribe now Sending 'AJK7' to 522")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("WEEKLY ZONG UNLIMITED OFFER")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setValidity("7 Days")
                .setPrice("Rs. 63+t/-")
                .setCode("522")
                .setDescription("Available in selected cities only.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("KARACHI WEEKLY OFFER")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("1000 Msgs")
                .setValidity("7 Days")
                .setPrice("Rs. 76+t/-")
                .setCode("522")
                .setDescription("Subscribe now by sending 'KHI6' to 522" )
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("WEEKLY BACHAT OFFER\n (PUNJAB)")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("500 Mins")
                .setOffNet("30 Mins")
                .setInternet("2 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 100+t/-")
                .setCode("*4444#")
                .setDescription("For Punjab only")
                .build()
        );



        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Apna Shehar Offer\n (PUNJAB)")
                .setSim("ZONG")
                .setNumber("4")
                .setOffNet("150 MB")
                .setInternet("6 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 230/-")
                .setCode("*2222#")
                .setDescription("[Rs. 220 Load]\n Eligibility: Customer in Selected cities of Punjab")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Apna Shehar Offer\n (KARACHI)")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("500 Mins")
                .setOffNet("75 MB")
                .setSms("5000 Msgs")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 250/-")
                .setCode("*54#")
                .setDescription("[Rs. 250 Load]\n Eligibility: Customer in Selected cities of Punjab")
                .build()
        );



        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Apna Sindh Offer")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("5000 Mins")
                .setOffNet("75 MB")
                .setSms("5000 Msgs")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 250/-")
                .setCode("*54#")
                .setDescription("[Rs. 250 Load]\n Customer residing in Sindh can also visit their nearest retailer and request for apna sindh Offer Subscription")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Karachi Monthly Offer")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("1000 Msgs")
                .setValidity("1 Monthly")
                .setPrice("Rs. 238+t/-")
                .setCode("522")
                .setDescription("Subscription now by sending 'KHI' to 522")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly Zong Unlimited Offer")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setValidity("1 Monthly")
                .setPrice("Rs. 255/-")
                .setCode("522")
                .setDescription("available in selected cities only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("AJK Monthly Offer")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setValidity("1 Monthly")
                .setPrice("Rs. 268/-")
                .setCode("522")
                .setDescription("Subscribe now by sending 'AJK30' 522")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly Mehran (Sindh)")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("1000 Msgs")
                .setInternet("1.5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500/-")
                .setCode("*2345#")
                .setDescription("1000 SMS /Day\n Dail *2345# and choose the offer of your choice \n These Offer are available in entire Sindh province except Karachi")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("SUPER STAR OFFER")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("300 Mins")
                .setOffNet("400 Mins")
                .setInternet("8 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500/-")
                .setCode("*7070#")
                .setDescription("This Offer is available in following cities Vehrari Burewwala Hasilpur Malsi RYK Sadiqabad Khanewal Abdulhakim KabirWala Faisalabad Sargodha.")
                .build()
        );

        return packageList;
    }

    @Override
    public List<Package> getOtherPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Sim Lagao Offer")
                .setSim("ZONG")
                .setNumber("5")
                .setOnNet("6000 Mins")
                .setSms("6000 Msgs")
                .setInternet("4 GB")
                .setValidity("2 Month")
                .setPrice("Rs. 2244/-")
                .setCode("*2244#")
                .setDescription("Zong brings to you its SIM Lagao Offer. If you have not used your Zong SIM for 30 days then you can enjoy 6000 Zong Minutes, 6000 SMS and 4GB internet for 60 days.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("New Sim Offer")
                .setSim("ZONG")
                .setNumber("5")
                .setOnNet("1000 Mins")
                .setInternet("4 GB")
                .setValidity("7 Days")
                .setCode("*10#")
                .setDescription("Subscriber has to dial *10# once after activating the Sim to avail this offer")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Zong Advance Loan")
                .setSim("ZONG")
                .setNumber("5")
                .setPrice("Rs. 3.5 + tax/-")
                .setCode("*911#")
                .setDescription("Advance Loan Standard Amount Rs 25 sevice charges 3.5 ")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Zong Recharge Card Code")
                .setSim("ZONG")
                .setNumber("5")
                .setCode("*101*CardNumber#")
                .setDescription("Dial *101*CardNumber#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("*310# USSD Portal")
                .setSim("ZONG")
                .setNumber("5")
                .setCode("*310#")
                .setDescription("*310# is a self-service channel through which you can check usage details, Activate/De-Activate Packages etc")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Zong Dial Tune")
                .setSim("ZONG")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.78 + tax/-")
                .setCode("230")
                .setDescription("To Subscribe: Send 'sub' to 230\nDe-Activate: Send 'unsub' to 230\nZong dial tunes give you a chance to say it all even before you pick up you caller's phone. When your friend call you, they no longer have to hear that boring old 'dial-tone' instead, they can groove to the hottest new tracks on the music scene.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Zong My Status")
                .setSim("ZONG")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.19 + tax/-")
                .setCode("*652#")
                .setDescription("To De-Activate: send 'unsub' to 6009\nZong My Status: now you can post a status to calling party upon receiving a call from them.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Call and SMS Block")
                .setSim("ZONG")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 15 + tax/-")
                .setCode("420")
                .setDescription("To Subscribe: Send 'sub' to 420\nTo Un-Subscribe: send 'unsub' to 420\nTotal 50 numbers could be added to the blocklist.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Doosra Number")
                .setSim("ZONG")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 30 + tax/-")
                .setCode("4600")
                .setDescription("Activate: sms 'sub' to 4600\nDe-Activate: sms 'unsub' to 4600\nGet 2 numbers in 1 sim")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Missed Call Alerts")
                .setSim("ZONG")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 20 + tax/-")
                .setCode("6227")
                .setDescription("Activate: send 'sub' to 6227\nDe-Activate: send 'unsub' to 6227")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Zong Yaari Call")
                .setSim("ZONG")
                .setNumber("5")
                .setPrice("Rs. 2 + tax/-")
                .setCode("*110#")
                .setDescription("Brings you the opportunity to stay connected to your loved ones even in case of insufficient balance.\nDial 11 followed by the desired Zong number e.g. 1103120333888\nDial *110* followed by the desired zong number e.g. *110*03123333333#")
                .build()
        );

        return packageList;
    }
}
