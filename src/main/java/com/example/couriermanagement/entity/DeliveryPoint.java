package com.example.couriermanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(
    name = "delivery_points",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"delivery_id", "sequence"})
    }
)
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 0L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_id", nullable = false)
    private Delivery delivery;

    @Column(name = "sequence", nullable = false)
    private Integer sequence;

    @Column(name = "latitude", precision = 10, scale = 8, nullable = false)
    private BigDecimal latitude;

    @Column(name = "longitude", precision = 11, scale = 8, nullable = false)
    private BigDecimal longitude;

    @OneToMany(mappedBy = "deliveryPoint", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DeliveryPointProduct> deliveryPointProducts = new ArrayList<>();

}