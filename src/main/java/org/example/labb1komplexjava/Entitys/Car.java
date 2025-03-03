package org.example.labb1komplexjava.Entitys;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    @Setter
    @NotBlank(message = "Name can not be empty")
    private String carName;

    @Setter
    private String description;

    @Setter
    @PastOrPresent(message = "Date can not be in the future")
    private LocalDate Manufacturedate;

    @Setter
    @Pattern(regexp = "^[A-Z]{3}[0-9]{2}[A-Z0-9]$", message = "Ogiltigt registreringsnummer")
    @Column(unique = true)
    private String carRegistrationNumber;

    @Setter
    @Positive(message = "HorsePower must be positive")
    private int horsePower;

    public Car(){

    }

    public Car(String carName, String description, LocalDate Manufacturedate, String carRegistrationNumber, int horsePower) {
        this.carName = carName;
        this.description = description;
        this.Manufacturedate = Manufacturedate;
        this.carRegistrationNumber = carRegistrationNumber;
        this.horsePower = horsePower;
    }

    public String toString(){
        return "Car{" +"Car{" +
                "id=" + carId +
                ", name='" + carName + '\'' +
                ", description='" + description + '\'' +
                ", manufactureDate=" + Manufacturedate +
                ", registrationNumber='" + carRegistrationNumber + '\'' +
                ", enginePower=" + horsePower +
                '}';
    }


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getCarId() != null && Objects.equals(getCarId(), car.getCarId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}
