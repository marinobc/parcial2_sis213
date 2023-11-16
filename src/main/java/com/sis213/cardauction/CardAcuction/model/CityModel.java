package com.sis213.cardauction.CardAcuction.model;

public class CityModel {
    private String idCity;
    private String name;

    public CityModel() {
    }

    public CityModel(String idCity, String name) {
        this.idCity = idCity;
        this.name = name;
    }

    public String getIdCity() {
        return idCity;
    }

    public void setIdCity(String idCity) {
        this.idCity = idCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "idCity='" + idCity + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
