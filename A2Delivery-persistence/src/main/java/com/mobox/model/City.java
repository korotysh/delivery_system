package com.mobox.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class City {

    @Id
    @Column(name = "CITY_ID")
    @GeneratedValue
    private long id;
    private String name;

    @OneToMany(mappedBy = "deliveryCity")
    private Set<Order> orders = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
