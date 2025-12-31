package com.hogger.siliconbay.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Brand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false)
    private String name;
}
