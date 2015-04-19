package com.mobox.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private int rating;
    @Column(nullable = false)
    private String name;
    private String description;
    private double weight;
    private double price;
    private double salePrice;
    private String manufacturer;
    private String brand;
    private String instructions;
    private String countryMade;
    private String allergicInfo;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "products")
    private Set<Warehouse> warehouses;

}
