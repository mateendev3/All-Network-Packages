package com.gmail.mateendev3.allnetworkpackages.contract;

import com.gmail.mateendev3.allnetworkpackages.model.Package;

import java.util.List;

public interface SimDataProvider {
    List<Package> getCallPackages();
    List<Package> getSMSPackages();
    List<Package> getInternetPackages();
    List<Package> getLocationBasedPackages();
    List<Package> getOtherPackages();
}
