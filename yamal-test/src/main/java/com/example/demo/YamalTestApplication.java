package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YamalTestApplication implements CommandLineRunner{
	
	@Autowired
	private JavaProperties javaProperties;
	
	@Autowired
	private SpringProperties springProperties;

	public static void main(String[] args) {
		SpringApplication.run(YamalTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		javaProperties.getCourse().stream().forEach(a-> System.out.println("Topic: "+ a.getTopic() + "Fee: " + a.getFee()));
		System.out.println("Datasource : "+springProperties.getDatasource());
		System.out.println("URL : " + springProperties.getUrls());
		System.out.println("PORT:  " + springProperties.getPort1());
	}

}
