package com.example.couriermanagement.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Результат расчета маршрута")
public class RouteCalculationResponse {
    @Schema(description = "Расстояние в км", example = "25.5")
    private BigDecimal distanceKm;

    @Schema(description = "Время в пути в минутах", example = "120")
    private Integer durationMinutes;

    @Schema(description = "Рекомендуемое время")
    private SuggestedTime suggestedTime;
}