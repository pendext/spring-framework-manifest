package com.manifestcorp.bootcamp.framework.database;

import java.sql.*;
import java.util.*;

public class DataAccess {

    private String url;

    public DataAccess(String url) {
        this.url = url;
    }

    public void connect() throws Exception {
        Connection conn = DriverManager.getConnection (url, "root", "root+1");
        conn.createStatement().execute("insert into customer (first_name, last_name) values ('john', 'pendexter')");
    }

    public List<Customer> getCustomers() throws SQLException {
        Connection conn = DriverManager.getConnection (url, "root", "root+1");
        ResultSet resultSet = conn.createStatement().executeQuery("select * from customer");

        List<Customer> customers = new ArrayList<>();

        while (resultSet.next()) {
            customers.add(new Customer(resultSet.getString(2), resultSet.getString(3)));
        }

        return customers;
    }

    public void deleteCustomers() throws SQLException {
        Connection conn = DriverManager.getConnection (url, "root", "root+1");
        conn.createStatement().execute("delete from customer");
    }

}
