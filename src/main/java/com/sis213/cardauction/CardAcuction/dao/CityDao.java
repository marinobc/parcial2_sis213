package com.sis213.cardauction.CardAcuction.dao;

import com.sis213.cardauction.CardAcuction.model.CityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CityDao {

    @Autowired
    private DataSource dataSource;

    private Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }


    public List<CityModel> Cities() {
        List<CityModel> cities = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT idcity, name FROM city");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                String idCity = String.valueOf(resultSet.getInt("idcity"));
                String name = resultSet.getString("name");
                CityModel city = new CityModel(idCity, name);
                cities.add(city);
            }
            System.out.println("hoañ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cities;
    }
}
