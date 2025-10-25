package com.example.couriermanagement.dto.response;

import com.example.couriermanagement.entity.DeliveryStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Доставка курьера (упрощенная информация)")
public class CourierDeliveryResponse {
    @Schema(description = "ID доставки", example = "1")
    private Long id;

    @Schema(description = "Номер доставки", example = "DEL-2025-001")
    private String deliveryNumber;

    @Schema(description = "Дата доставки", example = "2025-01-30")
    private LocalDate deliveryDate;

    @Schema(description = "Время начала", example = "09:00")
    private LocalTime timeStart;

    @Schema(description = "Время окончания", example = "18:00")
    private LocalTime timeEnd;

    @Schema(description = "Статус доставки")
    private DeliveryStatus status;

    @Schema(description = "Информация о машине")
    private VehicleInfo vehicle;

    @Schema(description = "Количество точек в маршруте", example = "5")
    private Integer pointsCount;

    @Schema(description = "Общее количество товаров во всех точках", example = "10")
    private Integer productsCount;

    @Schema(description = "Общий вес товаров в кг", example = "150.5")
    private BigDecimal totalWeight;
}