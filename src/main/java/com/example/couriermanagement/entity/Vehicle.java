package com.example.couriermanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "vehicles")
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 0L;

    @Column(name = "brand", nullable = false, length = 100)
    private String brand;

    @Column(name = "license_plate", unique = true, nullable = false, length = 20)
    private String licensePlate;

    @Column(name = "max_weight", nullable = false, precision = 8, scale = 2)
    private BigDecimal maxWeight;

    @Column(name = "max_volume", nullable = false, precision = 8, scale = 3)
    private BigDecimal maxVolume;

}