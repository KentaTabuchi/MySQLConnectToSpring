package com.kenta.tabuchi.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JEBCTest {
    @Autowired
    private JdbcTemplate jdbc;
	public void findAll() {
        List<Map<String, Object>> list = jdbc.queryForList("SELECT * FROM M_student");
        list.forEach(System.out::println);
	}
}
