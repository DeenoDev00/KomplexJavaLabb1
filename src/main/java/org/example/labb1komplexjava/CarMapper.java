package org.example.labb1komplexjava;

import org.example.labb1komplexjava.DTOs.CarDTO;
import org.example.labb1komplexjava.DTOs.CreateCarDTO;
import org.example.labb1komplexjava.DTOs.UpdateCarDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDTO toCarDTO(Car car);

    Car toCar(CreateCarDTO createCarDTO);

    void updateCarFromDTO(UpdateCarDTO updateCarDTO, @MappingTarget Car car);
}
