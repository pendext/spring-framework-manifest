package com.manifestcorp.bootcamp.framework.math;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MathServiceIntegrationTest {

    private MathService mathService;

    @Before
    public void setup() {
        mathService = new MathService();
    }

    @Test
    public void addAddsAsExpected() {
        assertThat(mathService.add(3, 7)).isEqualTo(10);
    }

    @Test
    public void subtractSubtracts() {
        assertThat(mathService.subtract(16, 4)).isEqualTo(12);
    }

}