package com.delivery.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "address")
public class Address {

    // Declare variables with annotations for table columns
    @Id
    private String id;
    private String userid;
    private String title;
    private String location;
    private String province;
    private String district;
    private String city;
    private String zip;
    private String phone;
    
    // Implement default constructor
    public Address() {
    }

    // Implement overload constructor
    public Address(String id, String userid, String title, String location, String province, String district, String city, String zip, String phone) {
        this.id = id;
        this.userid = userid;
        this.title = title;
        this.location = location;
        this.province = province;
        this.district = district;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
    }

    // To String
    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    // Implement Getter & Setter for variables
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
