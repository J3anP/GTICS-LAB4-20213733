package org.example.lab4_gtics.entity;

import jakarta.persistence.*;

@Entity
@Table(name="regions")
public class Regions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="region_id")
    private Double regionId;

    @Column(name="region_name")
    private String regionName;
}
