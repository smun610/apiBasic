package com.example.basic.api.apiBasic.Entity;

import java.text.ParseException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.Immutable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.example.basic.api.apiBasic.Utility.Utility;

@Entity
@Table (name="payment_view")
@EntityListeners(AuditingEntityListener.class)
@Immutable
public class PaymentView {

    @Column(name="paidDate")
    private String paidDate;

    @Column(name="paidStatus")
    private String paidStatus;

    @Column(name="fullname")
    private String fullname;
    @Id
    private Integer payments_id;


    public Integer getPayments_id() {
        return payments_id;
    }

    public void setPayments_id(final Integer payments_id) {
        this.payments_id = payments_id;
    }

    public String getPaidDate() throws ParseException {
        Utility utility = new Utility();
        paidDate = utility.dateToFormat(paidDate);
        return paidDate;
    }

    public void setPaidDate(final String paidDate) {
        this.paidDate = paidDate;
    }

    public String getPaidStatus() {
        return paidStatus;
    }

    public void setPaidStatus(final String paidStatus) {
        this.paidStatus = paidStatus;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(final String fullname) {
        this.fullname = fullname;
    }
}
