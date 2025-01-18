package com.mohan.sample_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@SpringBootApplication
public class SampleSpringbootApplication implements CommandLineRunner {

	@Autowired
	private ResourceLoader resourceLoader;

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Resource resource = resourceLoader.getResource("classpath:git.properties");
//		if (resource.exists()){
//			try (InputStream inputStream = resource.getInputStream()){
//				Properties properties = new Properties();
//				properties.load(inputStream);
//				System.out.println("Origin URL: " + properties.getProperty("git.remote.origin.url"));
//				System.out.println("Git Commit Id: " + properties.getProperty("git.commit.id"));
//				System.out.println("Comment: " + properties.getProperty("git.commit.message.full"));
//			}
//		} else {
//			System.out.println("git.properties is not found");
//		}

//		Resource resource = resourceLoader.getResource("application.properties");
//		if (resource.exists()){
//			System.out.println("Resource file exists");
//			try (InputStream inputStream = resource.getInputStream()) {
//				Properties properties = new Properties();
//				properties.load(inputStream);
//				System.out.println(properties.getProperty("server.port").getClass().getName());
//				System.out.println(properties.getProperty("booleadum.value").getClass().getName());
//				System.out.println(properties.getProperty("dummy.value"));
//				for (Map.Entry<Object, Object> entry : properties.entrySet()){
//					System.out.println("Key: " + entry.getKey());
//					System.out.println("Value: " + entry.getValue());
//				}
//			}
//		} else {
//			System.out.println("Resource file does not exist");
//		}

//		System.getenv().forEach((key, value) -> System.out.println(key + " = " + value));

		Resource resource = resourceLoader.getResource("classpath:application.properties");
		if (resource.exists()){
			try (InputStream inputStream = resource.getInputStream()){
				Properties properties = new Properties();
				properties.load(inputStream);
				for (Map.Entry<Object,Object> entry: properties.entrySet()){
					System.out.println(entry.getKey() + ": " + entry.getValue());
				}
				System.out.println("Added a new line to test...");
			}
		} else {
			System.out.println("Resource does not exist");
		}
	}


















}
