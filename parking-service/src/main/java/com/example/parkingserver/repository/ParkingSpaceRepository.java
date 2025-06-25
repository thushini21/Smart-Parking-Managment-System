package com.example.parkingserver.repository;

import com.example.parkingserver.model.ParkingSpace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, Long> {
    List<ParkingSpace> findByIsAvailable(boolean isAvailable);
    List<ParkingSpace> findByOwnerId(String ownerId);
    List<ParkingSpace> findByLocation(String location);
} 