package com.example.couriermanagement.service;

import com.example.couriermanagement.dto.request.RouteCalculationRequest;
import com.example.couriermanagement.dto.response.RouteCalculationResponse;

public interface RouteService {
    RouteCalculationResponse calculateRoute(RouteCalculationRequest request);
}