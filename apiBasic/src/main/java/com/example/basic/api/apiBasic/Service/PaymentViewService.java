package com.example.basic.api.apiBasic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.basic.api.apiBasic.Entity.PaymentView;
import com.example.basic.api.apiBasic.Repository.PaymentViewRespository;

@Service
public class PaymentViewService {

    @Autowired
    private PaymentViewRespository paymentViewRespository;

    public List<PaymentView> getAllPayment (){
        return paymentViewRespository.findAll();
    }

    public PaymentView getPaymentView (Integer id){
        return paymentViewRespository.findById(id).get();
    }
}
