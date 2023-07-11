package com.example.dz2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dz2.models.Car;
import org.springframework.stereotype.Repository;
@Repository
public interface CarRepositories extends JpaRepository<Car, Integer> {
}
