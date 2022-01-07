package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    void contextLoads() {
//        jdbcTemplate.queryForList("select * from testtable");
        Long along = jdbcTemplate.queryForObject("select count(*) from testtable",long.class);
        System.out.println(along);
    }

}
