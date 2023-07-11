package com.example.dz2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dz2.models.Truck;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface TruckRepositories extends JpaRepository<Truck, Integer> {
    List<Truck> findAllByModel(String model);
}
