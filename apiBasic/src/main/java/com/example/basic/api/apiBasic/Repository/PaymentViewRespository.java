package com.example.basic.api.apiBasic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.basic.api.apiBasic.Entity.PaymentView;

public interface PaymentViewRespository extends JpaRepository<PaymentView, Integer> {
}
