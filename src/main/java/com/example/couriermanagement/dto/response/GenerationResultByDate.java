package com.example.couriermanagement.dto.response;

import com.example.couriermanagement.dto.DeliveryDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Результат генерации доставок для конкретной даты")
public class GenerationResultByDate {
    @Schema(description = "Количество доставок на эту дату", example = "3")
    private Integer generatedCount;

    @Schema(description = "Созданные доставки")
    private List<DeliveryDto> deliveries;

    @Schema(description = "Предупреждения при генерации")
    private List<String> warnings;
}