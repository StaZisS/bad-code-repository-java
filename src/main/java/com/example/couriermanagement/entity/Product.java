package com.example.couriermanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "products")
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 0L;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "weight", nullable = false, precision = 8, scale = 3)
    private BigDecimal weight;

    @Column(name = "length", nullable = false, precision = 6, scale = 2)
    private BigDecimal length;

    @Column(name = "width", nullable = false, precision = 6, scale = 2)
    private BigDecimal width;

    @Column(name = "height", nullable = false, precision = 6, scale = 2)
    private BigDecimal height;

    public BigDecimal getVolume() {
        return length.multiply(width).multiply(height).divide(new BigDecimal("1000000")); // convert cm³ to m³
    }
}