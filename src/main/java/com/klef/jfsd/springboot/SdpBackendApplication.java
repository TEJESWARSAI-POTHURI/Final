package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SdpBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdpBackendApplication.class, args);
		System.out.println("!....This is my SDP backend....!");
	}

}
