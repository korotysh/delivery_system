package com.mobox.model.enumInfo;

import com.mobox.model.Order;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public enum OrderStatus {
    ACTIVE,COMPLETED;

    @Id
    @Column(name = "ORDER_STATUS_ID")
    @GeneratedValue
    private long id;

    @OneToMany(mappedBy = "deliveryCity")
    private Set<Order> orders = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
