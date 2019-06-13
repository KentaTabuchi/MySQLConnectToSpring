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

    public static void main(String[] args) {
      
        	SpringApplication.run(MySqlTest2Application.class, args);
        	try {
				SSHConnection sshcon = new SSHConnection();

			} catch (Throwable e) {
				e.printStackTrace();
			}
        }

    }


