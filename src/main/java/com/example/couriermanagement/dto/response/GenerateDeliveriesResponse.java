package com.example.couriermanagement.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Результат генерации доставок")
public class GenerateDeliveriesResponse {
    @Schema(description = "Общее количество созданных доставок", example = "5")
    private Integer totalGenerated;

    @Schema(description = "Результаты генерации по датам")
    private Map<LocalDate, GenerationResultByDate> byDate;
}