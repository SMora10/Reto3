package com.usa.misiontic.reto3.reto3.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="bike")
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String brand;
    @Column(name = "`year`")
    private Integer year;
    private String description;

    @ManyToOne
    @JoinColumn(name = "CategoryId")
    @JsonIgnoreProperties("bike")
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "bike")
    @JsonIgnoreProperties({"bike","message"})
    private List<Reservation> reservation;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "bike")
    @JsonIgnoreProperties({"bike","client"})
    private List<Message> message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    public List<Message> getMessage() {
        return message;
    }
    public void setMessage(List<Message> message) {
        this.message = message;
    }
    public List<Reservation> getReservations() {
        return reservation;
    }
    public void setReservations(List<Reservation> reservations) {
        this.reservation = reservations;
    }
}
