package com.example.spring_boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		int i = 5;
		int[] arr = {0,1,2,3};

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 1 || arr[j] == 3) {
				continue;
			}
			System.out.println(j);
		}

		try {
			i = i / 0;
		} catch (Exception e) {
			System.out.println("ex");
		}

		System.out.println("after ex");

		System.out.println("finished ok");
	}
}
