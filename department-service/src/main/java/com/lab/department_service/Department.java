package com.lab.department_service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
//toto
@Entity
@Data
public class Department {
    private @Id @GeneratedValue Long id;
    private String name;
    private String location;
    // feiveri

    public Department() {}
//vfkrgnofdngvdfbnojfvnofr
    //vdrebnnb
    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

}