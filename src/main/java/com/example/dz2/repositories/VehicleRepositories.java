package com.example.dz2.repositories;
import com.example.dz2.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepositories extends JpaRepository<Vehicle,Integer> {
}