package com.sis213.cardauction.CardAcuction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Repository
public class CardDao {

    @Autowired
    private DataSource dataSource;

    private Connection getConnection() throws SQLException{
        return dataSource.getConnection();
    }

    private void listCards(){

    }
}
