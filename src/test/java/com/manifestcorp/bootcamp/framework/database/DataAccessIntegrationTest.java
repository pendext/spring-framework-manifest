package com.manifestcorp.bootcamp.framework.database;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DataAccessIntegrationTest {

    DataAccess dataAccess;

    @Before
    public void setup() {
        dataAccess = new DataAccess("jdbc:mysql://localhost:3306/framework");
    }

    @After
    public void teardown() throws SQLException {
        dataAccess.deleteCustomers();
    }


    @Test
    public void canRetrieveDataFromDatabase() throws Exception {
        dataAccess.connect();
        List<Customer> customers = dataAccess.getCustomers();
        assertThat(customers.size()).isEqualTo(1);
    }

}