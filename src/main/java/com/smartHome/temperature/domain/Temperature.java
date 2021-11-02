package com.smartHome.temperature.domain;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data // alternative getter, setters

@Table(name="Temperature")
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Entity
public class Temperature {

    @Id
    private final int id;
    private final double temperature;

    // alternative to this constructor, we can use @@RequiredArgsConstructor (from lombok)
    public Temperature(int id, double temperature) {
        this.id = id;
        this.temperature = temperature;
    }
}
