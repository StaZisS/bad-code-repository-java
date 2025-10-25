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
@Schema(description = "Детали ошибки")
public class ErrorInfo {
    @Schema(description = "Код ошибки", example = "FORBIDDEN")
    private String code;

    @Schema(description = "Сообщение об ошибке", example = "Доступ запрещен")
    private String message;
}