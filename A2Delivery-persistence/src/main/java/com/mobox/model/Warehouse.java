package com.mobox.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "WAREHOUSES")
public class Warehouse {

    @Id
    @Column(name = "WAREHOUSE_ID")
    @GeneratedValue
    private int id;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "warehouse_product",joinColumns = {
            @JoinColumn(name = "WAREHOUSE_ID", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "PRODUCT_ID", nullable = false, updatable = false) })
    Set<Product> products;

}
