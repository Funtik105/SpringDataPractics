package com.example.dz2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dz2.models.Plane;
import org.springframework.stereotype.Repository;
@Repository
public interface PlaneRepositories extends JpaRepository<Plane, Integer> {
}
