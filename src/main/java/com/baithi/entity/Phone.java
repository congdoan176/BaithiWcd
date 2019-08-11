package com.baithi.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Phone {
    @Id
    private Long id;
    private String name;
    private String brand;
    private String price;
    private String phone;
    private String description;

    public Phone setId(Long id) {
        this.id = id;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Phone setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public long getId() {
        return id;
    }

    public Phone setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Phone setName(String name) {
        this.name = name;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Phone setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Phone setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Phone setDescription(String description) {
        this.description = description;
        return this;
    }

    public static void save(Phone phone){

    }
}
