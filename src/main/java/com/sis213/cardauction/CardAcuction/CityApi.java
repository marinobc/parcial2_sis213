package com.sis213.cardauction.CardAcuction;

import com.sis213.cardauction.CardAcuction.bl.CityBl;
import com.sis213.cardauction.CardAcuction.model.CityModel;
import com.sis213.cardauction.CardAcuction.util.ApiResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/cities")
public class CityApi {
    @Autowired
    private CityBl cityLogic;

    @Autowired
    private ApiResponseBuilder resposeContract;

    @GetMapping("/list")
    public ResponseEntity<Map<String, Object>> listCities() {
        try {
            List<CityModel> cities = cityLogic.listCities();
            return resposeContract.buildResponse(
                    HttpStatus.OK, "CITY-0000", "Cities fetched successfully", "", cities);
        } catch (Exception e) {
            return resposeContract.buildResponse(
                    HttpStatus.INTERNAL_SERVER_ERROR, "CITY-0001", "", "Error fetching cities. Please try again later.", null);
        }
    }}
