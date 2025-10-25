package com.example.couriermanagement.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Данные для входа в систему")
public class LoginRequest {
    @NotBlank(message = "Логин обязателен")
    @Schema(description = "Логин пользователя", example = "admin")
    private String login;

    @NotBlank(message = "Пароль обязателен")
    @Schema(description = "Пароль пользователя", example = "password")
    private String password;
}