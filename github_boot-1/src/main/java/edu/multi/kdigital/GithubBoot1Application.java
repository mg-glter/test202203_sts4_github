package edu.multi.kdigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(GithubBoot1Application.class, args);
		System.out.println("깃헙push용도!");
	}

}
