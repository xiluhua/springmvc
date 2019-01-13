package com.springmvc.pojo;

public class Addr {
    private String city;
    private String road;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    @Override
    public String toString() {
        return "Addr{" +
                "city='" + city + '\'' +
                ", road='" + road + '\'' +
                '}';
    }

}
