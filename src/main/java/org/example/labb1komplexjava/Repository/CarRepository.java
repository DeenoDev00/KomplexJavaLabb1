package org.example.labb1komplexjava.Repository;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;
import org.example.labb1komplexjava.Entitys.Car;
import java.util.List;

/**
 * Repository interface for Car entity.
 * Provides methods for CRUD operations and additional filtering.
 */
@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    /**
     * Finds all cars based on the car's registration number.
     *
     * @param carRegistrationNumber The registration number to search for.
     * @return A list of cars with the given registration number.
     */
    List<Car> findByRegistrationNumber(String carRegistrationNumber);

    /**
     * Finds all cars based on the car's name.
     *
     * @param carName The name of the car.
     * @return A list of cars with the given name.
     */
    List<Car> findByName(String carName);

    /**
     * Finds all cars with engine power greater than the given value.
     *
     * @param minEnginePower The minimum engine power for the filter.
     * @return A list of cars that meet the engine power requirement.
     */
    List<Car> findByEnginePowerGreaterThan(int minEnginePower);
}
