package com.juan.Exercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ExercisesApplication {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opt;
		Exercises exercises = new Exercises();
		//SpringApplication.run(ExercisesApplication.class, args);
		do {
			System.out.println("***Stream Exercices***" +
					"\n0. Exit" +
					"\n1. products which belongs to \"books\" with price > 100");

			opt = scan.nextInt();
			switch (opt){
				case 1:
					exercises.exercise1();
			}
		} while (opt != 0);
	}

}
