package com.example.couriermanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Objects;

@Entity
@Table(name = "delivery_point_products")
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPointProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 0L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_point_id", nullable = false)
    private DeliveryPoint deliveryPoint;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

}