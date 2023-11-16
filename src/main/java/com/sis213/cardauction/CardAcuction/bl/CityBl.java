package com.sis213.cardauction.CardAcuction.bl;

import com.sis213.cardauction.CardAcuction.dao.CityDao;
import com.sis213.cardauction.CardAcuction.model.CityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityBl {
    @Autowired
    private CityDao dataCity;

    public List<CityModel> listCities() {
        return dataCity.Cities();
    }
}
