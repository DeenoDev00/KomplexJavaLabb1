package org.example.labb1komplexjava.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CreateCarDTO {

    @NotBlank(message = "name cannot be empty")
    private String name;

    private String description;

    @PastOrPresent(message = "Tillverkningsdatum kan inte vara i framtiden")
    private LocalDate manufactureDate;

    @Pattern(regexp = "^[A-Z]{3}[0-9]{2}[A-Z0-9]$", message = "Ogiltigt registreringsnummer")
    private String registrationNumber;

    @Positive(message = "Motorstyrka måste vara positiv")
    private int enginePower;
}
