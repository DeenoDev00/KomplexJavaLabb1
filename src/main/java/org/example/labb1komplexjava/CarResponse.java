package org.example.labb1komplexjava;

public class CarResponse {


    private Long carId;
    private String carName;
    private String description;
    private String manufactureDate;
    private String carRegistrationNumber;
    private int horsePower;

    public CarResponse(Long carId, String carName, String description, String manufactureDate, String carRegistrationNumber, int horsePower) {
        this.carId = carId;
        this.carName = carName;
        this.description = description;
        this.manufactureDate = manufactureDate;
        this.carRegistrationNumber = carRegistrationNumber;
        this.horsePower = horsePower;
    }

    public Long getCarId() {
        return carId;
    }

    public String getCarName() {
        return carName;
    }

    public String getDescription() {
        return description;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public String getCarRegistrationNumber() {
        return carRegistrationNumber;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "CarResponse{" +
                "carId=" + carId +
                ", carName='" + carName + " " +
                ", description='" + description + " " +
                ", manufactureDate='" + manufactureDate + " " +
                ", carRegistrationNumber='" + carRegistrationNumber + " " +
                ", horsePower=" + horsePower +
                '}';
    }
}