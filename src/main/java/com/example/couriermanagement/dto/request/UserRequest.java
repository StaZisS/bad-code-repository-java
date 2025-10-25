package com.example.couriermanagement.dto.request;

import com.example.couriermanagement.entity.UserRole;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

@Schema(description = "Данные для создания пользователя")
public class UserRequest {
    @NotBlank(message = "Логин обязателен")
    @Schema(description = "Логин пользователя", example = "courier1")
    private String login;

    @NotBlank(message = "Пароль обязателен")
    @Schema(description = "Пароль пользователя", example = "password123")
    private String password;

    @NotBlank(message = "Имя обязательно")
    @Schema(description = "Имя пользователя", example = "Иван Иванов")
    private String name;

    @NotNull(message = "Роль обязательна")
    @Schema(description = "Роль пользователя")
    private UserRole role;

    public UserRequest() {}

    public UserRequest(String login, String password, String name, UserRole role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    // Getters and Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRequest that = (UserRequest) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(password, that.password) &&
                Objects.equals(name, that.name) &&
                role == that.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, name, role);
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}