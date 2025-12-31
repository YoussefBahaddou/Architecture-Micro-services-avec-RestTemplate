package com.example.car.repositories;

import com.example.car.entities.Car;
import org.springframework.dataInfo.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> 
{
    

    
    
}

