package com.manifestcorp.bootcamp.framework.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.manifestcorp.bootcamp.framework.FrameworkApplication;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { FrameworkApplication.class })
@WebAppConfiguration
public class CustomerRepositoryIntegrationTest {

    @Autowired
    CustomerRepository customerRepository;

    @Before
    public void setup() {
        customerRepository.deleteAll();
    }

    @Test
    public void repoCanSave() {
        Customer customer = new Customer();
        customer.setFirstName("bill");
        customer.setLastName("monroe");
        customerRepository.save(customer);

        List<Customer> customers = customerRepository.findAll();
        assertThat(customers.size()).isEqualTo(1);
    }

}