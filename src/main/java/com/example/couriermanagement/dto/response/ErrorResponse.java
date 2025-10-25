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
@Schema(description = "Ответ при ошибке")
public class ErrorResponse {
    @Schema(description = "Информация об ошибке")
    private ErrorInfo error;
}