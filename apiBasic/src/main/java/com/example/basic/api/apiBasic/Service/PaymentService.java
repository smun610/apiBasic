package com.example.basic.api.apiBasic.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.basic.api.apiBasic.Entity.Payment;
import com.example.basic.api.apiBasic.Repository.PaymentRespositroy;

@Service
public class PaymentService {
    @Autowired
    private PaymentRespositroy paymentRespositroy;

    public void save (Payment payment){
        paymentRespositroy.save(payment);
    }
}
