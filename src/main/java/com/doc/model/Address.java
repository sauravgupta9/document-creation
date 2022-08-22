package com.doc.model;

public class Address {
    private String houseNo;
    private String streetName;
    private String cityOrLocality;
    private String pincode;
    private String district;
    private String state;

    public Address(String houseNo, String streetName, String cityOrLocality, String pincode, String district, String state) {
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.cityOrLocality = cityOrLocality;
        this.pincode = pincode;
        this.district = district;
        this.state = state;
    }

    public Address() {
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityOrLocality() {
        return cityOrLocality;
    }

    public void setCityOrLocality(String cityOrLocality) {
        this.cityOrLocality = cityOrLocality;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", cityOrLocality='" + cityOrLocality + '\'' +
                ", pincode='" + pincode + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
