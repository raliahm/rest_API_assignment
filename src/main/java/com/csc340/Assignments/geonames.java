package com.csc340.Assignments;

public class geonames {
    private String adminCode1;
    private String lng;
    private String distance;
    private int geonameId;
    private String toponymName;
    private String countryId;
    private String fcl;
    private int population;
    private String countryCode;
    private String name;
    private String fclName;
    private String[] adminCodes1;
    private String countryName;
    private String fcodeName;
    private String adminName1;
    private String lat;
    private String fcode;

    public geonames( String adminCode1,
    String lng,
    String distance,
    int geonameId,
    String toponymName,
    String countryId,
    String fcl,
    int population,
    String countryCode,
    String name,
    String fclName,
    String[] adminCodes1,
    String countryName,
    String fcodeName,
    String adminName1,
    String lat,
    String fcode) {
        this.adminCode1 = adminCode1;
        this.lng = lng;
        this.distance = distance;
        this.geonameId = geonameId;
        this.toponymName = toponymName;
        this.countryId = countryId;
        this.fcl = fcl;
        this.population = population;
        this.countryCode = countryCode;
        this.name = name;
        this.fclName = fclName;
        this.adminCodes1 = adminCodes1;
        this.countryName = countryName;
        this.fcodeName = fcodeName;
        this.adminName1 = adminName1;
        this.lat = lat;
        this.fcode = fcode;
    }

    public int getGeonameId() {
        return geonameId;
    }
    public void setGeonameId(int geonameId) {
        this.geonameId = geonameId;
    }
    public String getToponymName() {
        return toponymName;
    }
    public void setToponymName(String toponymName) {
        this.toponymName = toponymName;
    }
    public String getCountryId() {
        return countryId;
    }
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }
    public String getFcl() {
        return fcl;
    }
    public void setFcl(String fcl) {
        this.fcl = fcl;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFclName() {
        return fclName;
    }
    public void setFclName(String fclName) {
        this.fclName = fclName;
    }
    public String[] getAdminCodes1() {
        return adminCodes1;
    }
    public void setAdminCodes1(String[] adminCodes1) {
        this.adminCodes1 = adminCodes1;
    }
    public String getLat() {
        return lat;
    }
    public void setLat(String lat) {
        this.lat = lat;
    }
    public String getFcode() {
        return fcode;
    }
    public void setFcode(String fcode) {
        this.fcode = fcode;
    }
    public String getAdminName1() {
        return adminName1;
    }
    public void setAdminName1(String adminName1) {
        this.adminName1 = adminName1;
    }
    public String getLng() {
        return lng;
    }
    public void setLng(String lng) {
        this.lng = lng;
    }
    public String getDistance() {
        return distance;
    }
    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getFcodeName() {
        return fcodeName;
    }

    public void setFcodeName(String fcodeName) {
        this.fcodeName = fcodeName;
    }

    public String getAdminCode1() {
        return adminCode1;
    }

    public void setAdminCode1(String adminCode1) {
        this.adminCode1 = adminCode1;
    }
}
