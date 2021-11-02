package com.smartHome.temperature;


import com.smartHome.temperature.data.temperatureRepository;
import com.smartHome.temperature.domain.Temperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DevelopmentConfig implements CommandLineRunner {

            @Autowired
            temperatureRepository temperatureRepo;

            @Override
            public void run(String... args) throws Exception {

                System.out.println("ZALADOWANE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                Temperature first = new Temperature(11, 34.2);
                Temperature second = new Temperature(22, 22.34);
                temperatureRepo.save(first);
                temperatureRepo.save(second);
                System.out.println(temperatureRepo.count());
                System.out.println("ZALADOWANE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

            }
        }

