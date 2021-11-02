package com.smartHome.temperature.controller;

import com.smartHome.temperature.data.temperatureRepository;
import com.smartHome.temperature.domain.Temperature;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/temperature",
        produces="application/json")
public class TemperatureController {

    private temperatureRepository temperatureRepo;

    public TemperatureController(temperatureRepository temperatureRepo) {this.temperatureRepo = temperatureRepo; }

    @GetMapping("/recent")
    public Iterable<Temperature> recentTemperatures() {
        return temperatureRepo.findAll();
        //return temperatureRepo.findById(Long(3));
    }





}
