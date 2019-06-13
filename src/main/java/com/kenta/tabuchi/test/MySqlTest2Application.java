package com.kenta.tabuchi.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MySqlTest2Application {
    @Autowired
    private JdbcTemplate jdbc;
    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx = SpringApplication.run(MySqlTest2Application.class, args)) {
        	MySqlTest2Application myapp = ctx.getBean(MySqlTest2Application.class);
        
        	try {
				SSHConnection sshcon = new SSHConnection();
	            List<Map<String, Object>> list = myapp.jdbc.queryForList("SELECT * FROM M_student");
	            list.forEach(System.out::println);
			} catch (Throwable e) {
				e.printStackTrace();
			}
        }

    }

}
