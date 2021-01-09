package com.example.basic.api.apiBasic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.basic.api.apiBasic.Entity.Payment;


public interface PaymentRespositroy extends JpaRepository<Payment,Integer> {
}
