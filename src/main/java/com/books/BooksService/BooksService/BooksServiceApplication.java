package com.books.BooksService.BooksService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class BooksServiceApplication {

	public static void main(String[] args) {
//		Connection con;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			con=DriverManager.getConnection(
//					"jdbc:postgres://postgresdatabase.c4dbgrfkebwk.us-east-2.rds.amazonaws.com:5432/Book","postgresdatabase","TestPasswd123");
//		}catch(Exception e){ System.out.println(e);}

		SpringApplication.run(BooksServiceApplication.class, args);
	}

}
