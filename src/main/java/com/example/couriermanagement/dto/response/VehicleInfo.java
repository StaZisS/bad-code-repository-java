package com.example.couriermanagement.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Информация о машине для курьера")
public class VehicleInfo {
    @Schema(description = "Марка машины", example = "Ford Transit")
    private String brand;

    @Schema(description = "Регистрационный номер", example = "А123БВ")
    private String licensePlate;
}