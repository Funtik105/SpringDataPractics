package com.example.dz2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dz2.models.Bike;
import org.springframework.stereotype.Repository;
@Repository
public interface BikeRepositories extends JpaRepository<Bike, Integer> {
}
