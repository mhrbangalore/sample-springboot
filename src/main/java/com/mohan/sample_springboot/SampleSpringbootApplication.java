package com.mohan.sample_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ResourceLoader;

@SpringBootApplication
public class SampleSpringbootApplication implements CommandLineRunner {

	@Autowired
	private ResourceLoader resourceLoader;

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
