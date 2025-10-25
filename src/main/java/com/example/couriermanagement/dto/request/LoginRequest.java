package com.example.couriermanagement.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import java.util.Objects;

@Schema(description = "Данные для входа в систему")
public class LoginRequest {
    @NotBlank(message = "Логин обязателен")
    @Schema(description = "Логин пользователя", example = "admin")
    private String login;

    @NotBlank(message = "Пароль обязателен")
    @Schema(description = "Пароль пользователя", example = "password")
    private String password;

    public LoginRequest() {}

    public LoginRequest(String login, String password) {
        this.login = login;
        this.password = password;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginRequest that = (LoginRequest) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "login='" + login + '\'' +
                '}';
    }
}