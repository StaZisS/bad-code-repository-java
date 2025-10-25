package com.example.couriermanagement.service;

import java.math.BigDecimal;

public interface OpenStreetMapService {
    /**
     * Calculate distance between two points using OpenStreetMap routing
     */
    BigDecimal calculateDistance(
        BigDecimal startLatitude,
        BigDecimal startLongitude,
        BigDecimal endLatitude,
        BigDecimal endLongitude
    );
}