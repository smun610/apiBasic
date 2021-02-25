package com.example.basic.api.apiBasic.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import io.swagger.annotations.ApiModelProperty;


@Entity
@Table(name = "players")
@EntityListeners(AuditingEntityListener.class)
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(value = "123",notes="Unique ID", name="Id")
    @Column(name="player_id")
    private int id;
    @ApiModelProperty(value = "Shohei",notes="Players First name", name="FirstName")
    private String firstname;
    @ApiModelProperty(value = "Ono",notes="Players surname", name="surname")
    private String surname;


    public Players() {
    }

    public Players(int id, String firstname, String surname) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
