package com.example.couriermanagement.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Детали ошибки валидации")
public class ValidationErrorInfo {
    @Schema(description = "Код ошибки", example = "VALIDATION_FAILED")
    private String code;

    @Schema(description = "Общее сообщение об ошибке", example = "Ошибка валидации данных")
    private String message;

    @Schema(description = "Детализированные ошибки по полям")
    private Map<String, String> details;
}