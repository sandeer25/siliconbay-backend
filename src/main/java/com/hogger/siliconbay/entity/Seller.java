package com.hogger.siliconbay.entity;

import jakarta.persistence.*;

@Entity
public class Seller extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "company_name", length = 100, nullable = false)
    private String companyName;

    @Column(name = "company_mobile", length = 15, nullable = false)
    private String companyMobile;

    @Column(name = "company_email", length = 100, nullable = false)
    private String companyEmail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id", nullable = false)
    private Status status;
}
