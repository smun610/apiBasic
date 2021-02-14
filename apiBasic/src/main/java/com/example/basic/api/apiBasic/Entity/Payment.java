package com.example.basic.api.apiBasic.Entity;

import java.text.ParseException;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payments_id")
    private Integer id;
    @JsonFormat(pattern="dd/MM/yyyy")
    @Column(name = "paid_Date")
    private Date paidDate;
    @Column(name = "paid_Status")
    private String paidStatus;
    @Column(name = "player_id")
    private Integer playerId;


    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(final Integer playerId) {
        this.playerId = playerId;
    }

    public String getPaidStatus() {
        return paidStatus;
    }

    public void setPaidStatus(final String paidStatus) {
        this.paidStatus = paidStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(final Date paidDate) throws ParseException {
        this.paidDate = paidDate;
    }
}
