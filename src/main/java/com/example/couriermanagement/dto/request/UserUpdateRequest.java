package com.example.couriermanagement.dto.request;

import com.example.couriermanagement.entity.UserRole;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Данные для обновления пользователя")
public class UserUpdateRequest {
    @Schema(description = "Имя пользователя", example = "Иван Иванов")
    private String name;

    @Schema(description = "Логин пользователя", example = "courier1")
    private String login;

    @Schema(description = "Роль пользователя")
    private UserRole role;

    @Schema(description = "Пароль пользователя (только если нужно сменить)", example = "newpassword123")
    private String password;
}