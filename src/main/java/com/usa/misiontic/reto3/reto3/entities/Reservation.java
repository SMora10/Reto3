package com.usa.misiontic.reto3.reto3.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Integer startDate;
    private Integer devolutionDate;
    public Integer getIdReservation() {
        return idReservation;
    }
    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }
    public Integer getStartDate() {
        return startDate;
    }
    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }
    public Integer getDevolutionDate() {
        return devolutionDate;
    }
    public void setDevolutionDate(Integer devolutionDate) {
        this.devolutionDate = devolutionDate;
    }



}
