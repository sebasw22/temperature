package com.smartHome.temperature;

import com.smartHome.temperature.data.temperatureRepository;
import com.smartHome.temperature.domain.Temperature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemperatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperatureApplication.class, args);

/*		for(int i = 1; i<=100; i++){
			System.out.print(i + " ");

			if(i%3==0 || i%5==0){
				if(i%3==0 && i%5==0){
					System.out.println("FizzBuzz");
				}
				else if(i%3==0) {
					System.out.println("Fizz");
				}
				else if (i%5==0) {
					System.out.println("Buzz");
				}
			}
			else
				System.out.println("");
		}*/


		}


	}


