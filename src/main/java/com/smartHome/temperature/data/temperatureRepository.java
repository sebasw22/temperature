package com.smartHome.temperature.data;

import com.smartHome.temperature.domain.Temperature;
import org.springframework.data.repository.CrudRepository;


public interface temperatureRepository extends CrudRepository<Temperature, Integer> {

    //Temperature findById(int id);

}
