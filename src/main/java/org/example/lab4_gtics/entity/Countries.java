package org.example.lab4_gtics.entity;
import jakarta.persistence.*;

@Entity
@Table(name="countries")
public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="countryid")
    private int countryId;

    @Column(name="country_name")
    private String countryName;

    @ManyToOne
    @JoinColumn(name="region_id")
    private Regions regions;
}
