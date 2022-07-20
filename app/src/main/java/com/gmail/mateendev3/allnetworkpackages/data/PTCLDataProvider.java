package com.gmail.mateendev3.allnetworkpackages.data;

import com.gmail.mateendev3.allnetworkpackages.R;
import com.gmail.mateendev3.allnetworkpackages.contract.SimDataProvider;
import com.gmail.mateendev3.allnetworkpackages.model.Package;

import java.util.ArrayList;
import java.util.List;

public class PTCLDataProvider implements SimDataProvider {

    //Telephone Packages.
    @Override
    public List<Package> getCallPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Freedom 1000")
                .setSim("PTCL")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("900 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 1000/-")
                .setDescription("Unlimited on net calls\n 700 minutes to all nationwide mobile network within Pakistan \n 200 minutes to international Zone 1 destinations Free VAS bundle")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Freedom 3000")
                .setSim("PTCL")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("2200 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 3000/-")
                .setDescription("Unlimited on net calls\n 2000 minutes to all nationwide mobile network within Pakistan \n 200 minutes to international Zone 1 destinations Free VAS bundle")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Freedom 5000")
                .setSim("PTCL")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("4400 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 5000/-")
                .setDescription("Unlimited on net calls\n 4000 minutes to all nationwide mobile network within Pakistan \n 400 minutes to international Zone 1 destinations Free VAS bundle")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Freedom 8000")
                .setSim("PTCL")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("8800 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 8000/-")
                .setDescription("Unlimited on net calls\n 8000 minutes to all nationwide mobile network within Pakistan \n 800 minutes to international Zone 1 destinations Free VAS bundle")
                .build()
        );

        return packageList;
    }

    @Override
    public List<Package> getSMSPackages() {
        return null;
    }

    //Internet packages.
    @Override
    public List<Package> getInternetPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Broadband 6 Mbps")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("Unlimited MB")
                .setValidity("1 Month")
                .setPrice("Rs. 1799/-")
                .setDescription("Up to 6Mbps with Unlimited Downloads fro Rs.1,799/-per month\n On existing Telephone connection, internet Installation charges are Rs.2499/-\n On new Telephone connection, internet installation charges are Rs.5,000/-")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Broadband 8 Mbps Free Smart TV")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("Unlimited MB")
                .setValidity("1 Month")
                .setPrice("Rs. 2449/-")
                .setDescription("Up to 8Mbps with free smart TV and Unlimited Downloads & Quality Video Streaming for Rs.2,249/- per month\n On existing Telephone connection, internet Installation charges are Rs.2499/-\n On new Telephone connection, internet installation charges are Rs.5,000/-")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Broadband 25 Mbps Free Smart TV")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("Unlimited MB")
                .setValidity("1 Month")
                .setPrice("Rs. 3299/-")
                .setDescription("Up to 25Mbps with free smart TV and Unlimited Downloads for Rs.3,299/- per month\n On existing Telephone connection, internet Installation charges are Rs.2499/-\n On new Telephone connection, internet installation charges are Rs.5,000/-")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Broadband 50 Mbps Free Smart TV")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("Unlimited MB")
                .setValidity("1 Month")
                .setPrice("Rs. 5099/-")
                .setDescription("Up to 50Mbps with free smart TV and High speed internet and seamless connectivity for Rs.5,099/- per month\n On existing Telephone connection, internet Installation charges are Rs.2499/-\n On new Telephone connection, internet installation charges are Rs.5,000/-")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Broadband 100 Mbps Free Smart TV")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("Unlimited MB")
                .setValidity("1 Month")
                .setPrice("Rs. 7599/-")
                .setDescription("Enjoy Unlimited Downloads, Fast Streaming & Browsing with free smart TV and High speed Internet for Rs.7599/- per month\n On existing Telephone connection, internet Installation charges are Rs.2499/-\n On new Telephone connection, internet installation charges are Rs.5,000/-")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("3G EVO Wingle 9.3 10GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 750/-")
                .setDescription("This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("3G EVO Wingle 9.3 20GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1000/-")
                .setDescription("This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("3G EVO Wingle 9.3 30GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1250/-")
                .setDescription("This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("3G EVO Wingle 9.3 50GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("50 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1500/-")
                .setDescription("This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("EVO Nitro Cloud 10GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 750/-")
                .setDescription("Connect up to 5 WiFi gadgets simultaneously.\n This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("EVO Nitro Cloud 20GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1000/-")
                .setDescription("Connect up to 5 WiFi gadgets simultaneously.\n This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("EVO Nitro Cloud 30GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1250/-")
                .setDescription("Connect up to 5 WiFi gadgets simultaneously.\n This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("EVO Nitro Cloud 50GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("50 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1500/-")
                .setDescription("Connect up to 5 WiFi gadgets simultaneously.\n This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("PTCL EVO C@rFi 15GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("15 GB")
                .setValidity("3 Month")
                .setPrice("Rs. 4000/-")
                .setDescription("Plug-n-Play C@rFi Product - Simply plug into your vehicle cigarette lighter port to create a wifi hotspot no installation, no hassle")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("PTCL EVO C@rFi 30GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("6 Month")
                .setPrice("Rs. 5000/-")
                .setDescription("Plug-n-Play C@rFi Product - Simply plug into your vehicle cigarette lighter port to create a wifi hotspot no installation, no hassle")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("CharJi EVO Cloud 20GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1000/-")
                .setDescription("Single Mode mobile hotspot device, connect up to 10 WiFi gadgets simultaneously.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("CharJi EVO Cloud 30GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1250/-")
                .setDescription("Single Mode mobile hotspot device, connect up to 10 WiFi gadgets simultaneously.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("CharJi EVO Cloud: Karachi Unlimited Packages")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("Unlimited GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1499/-")
                .setDescription("Price Breakdown:\n 1)CharJi Cloud Device: Rs.2500/-\n 2)CharJi Unlimited Package : Rs.1499/-(incl taxes)\n Cash-On-deliveryCharges : Rs.234/-\n Total Amount: Rs.4733/-(Payable at the time of delivery).")
                .build()
        );

        return packageList;
    }

    @Override
    public List<Package> getLocationBasedPackages() {
        return null;
    }

    //Smart TV Packages.
    @Override
    public List<Package> getOtherPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Smart TV App")
                .setSim("PTCL")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 99/-")
                .setDescription("The Smart TV App is absolutely FREE for PTCl Broadband, Smart TV & Char Ji user. You can enjoy hundreds of live Tv channels, movies and TV on-demand on your mobile, tablets (Android & IOS ) and PCs (using browsers eg. Internet explorer Google Chrome etc.) Whenever and whenever you want. Customers using only landline service will be charged Rs 99/- per month")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Smart TV with Broadband")
                .setSim("PTCL")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 525/-")
                .setDescription("This Package includes only Smart TV charges, Customer can get Landline and Broadband Packages of his on choice")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Smart TV App")
                .setSim("PTCL")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 799/-")
                .setDescription("Smart TV + telephone (Freedom Package)")
                .build()
        );

        return packageList;
    }

}
