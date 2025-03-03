package org.example.labb1komplexjava.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CarDTO {

    private Long id;
    private String name;
    private String description;
    private LocalDate manufactureDate;
    private String registrationNumber;
    private int enginePower;
}