package com.example.basic.api.apiBasic.Controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic.api.apiBasic.Entity.Payment;
import com.example.basic.api.apiBasic.Entity.PaymentView;
import com.example.basic.api.apiBasic.Entity.Players;
import com.example.basic.api.apiBasic.Service.PaymentService;
import com.example.basic.api.apiBasic.Service.PaymentViewService;
import com.example.basic.api.apiBasic.Service.PlayersService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping ("/payments")
public class PaymentViewController {
    @Autowired
    private PaymentViewService paymentViewService;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private PlayersService playersService;
    @ApiOperation(value="Get all payment", response = PaymentView.class)
    @GetMapping("/payment")
    private List<PaymentView> getAllPlayer() {
        return paymentViewService.getAllPayment();
    }

    @ApiOperation(value="Get a single payment via an ID", response = PaymentView.class)
    @GetMapping("/payment/{id}")
    private PaymentView getPayment(@PathVariable Integer id) {
        return paymentViewService.getPaymentView(id);
    }

    @ApiOperation(value="Make a payment via a Post request", response = Payment.class)
    @PostMapping(value = "/payment/pay/{id}")
    private void makePayment(@RequestBody Payment payment, @PathVariable Integer id) throws ParseException {
        Players p = playersService.getById(id);
        if (p != null) {
            payment.setPlayerId(id);
            paymentService.save(payment);
        }

    }


}
