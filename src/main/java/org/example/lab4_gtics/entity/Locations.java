package org.example.lab4_gtics.entity;

import jakarta.persistence.*;

@Entity
@Table(name="locations")
public class Locations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="location_id")
    private int locationId;

    @Column(name="street_address")
    private String streetAddress;

    @Column(name="postal_code")
    private String postalCode;

    private String city;

    @Column(name="state_province")
    private String stateProvince;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Countries countries;
}
