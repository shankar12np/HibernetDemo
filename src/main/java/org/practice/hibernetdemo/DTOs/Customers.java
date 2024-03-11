package org.practice.hibernetdemo.DTOs;

import jakarta.persistence.*;

@Entity
@Table(name = "costomers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    public Customers() {
    }

    public Customers(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress(String address) {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
