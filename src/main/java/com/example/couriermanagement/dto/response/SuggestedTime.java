package com.example.couriermanagement.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Рекомендуемое время для маршрута")
public class SuggestedTime {
    @Schema(description = "Рекомендуемое время начала", example = "09:00")
    private LocalTime start;

    @Schema(description = "Рекомендуемое время окончания", example = "12:00")
    private LocalTime end;
}