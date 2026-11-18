package com.example.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class StudentManagementApplication {

	public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
		System.out.println("Hello World");
	}

}
