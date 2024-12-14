package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Value("${app.key}")
    private static String licKey;

    public static void main(String[] args) {
    	licKey = "1234567989";
    	System.out.println("License Key: " + licKey);
		System.out.println("Syncfusion");
		SpringApplication.run(DemoApplication.class, args);
	}

}
