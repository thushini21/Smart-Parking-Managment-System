package com.example.paymentserver.repository;

import com.example.paymentserver.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByUserId(String userId);
    List<Payment> findByParkingSpaceId(Long parkingSpaceId);
    List<Payment> findByStatus(String status);
} 