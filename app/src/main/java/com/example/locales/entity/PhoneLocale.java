package com.example.locales.entity;

public class PhoneLocale {

    private String iso2;
    private int code;
    private String country;

    public PhoneLocale(String iso2, int code, String country){
        this.iso2 = iso2;
        this.code = code;
        this.country = country;
    }


    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "CODE : " + iso2 + " | " + country + " -> " + code;
    }
}
