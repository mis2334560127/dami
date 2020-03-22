package com.shop.shopzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinStreamServer
public class ShopZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopZipkinServerApplication.class, args);
	}
}
