package com.manifestcorp.bootcamp.framework.database;

import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.*;

@Component
public class DataAccess {

    public void connect() throws Exception {
        String url = "jdbc:mysql://localhost:3306/framework";
        Connection conn = DriverManager.getConnection (url, "root", "root+1");
        conn.createStatement().execute("insert into customer (first_name, last_name) values ('john', 'pendexter')");
    }

    public List<Customer> getCustomers() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/framework";
        Connection conn = DriverManager.getConnection (url, "root", "root+1");
        ResultSet resultSet = conn.createStatement().executeQuery("select * from customer");

        List<Customer> customers = new ArrayList<>();

        while (resultSet.next()) {
            customers.add(new Customer(resultSet.getString(2), resultSet.getString(3)));
        }

        return customers;
    }

    public void deleteCustomers() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/framework";
        Connection conn = DriverManager.getConnection (url, "root", "root+1");
        conn.createStatement().execute("delete from customer");
    }

}
