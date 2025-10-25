package com.example.couriermanagement.dto.request;

import com.example.couriermanagement.entity.UserRole;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

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

    public UserUpdateRequest() {}

    public UserUpdateRequest(String name, String login, UserRole role, String password) {
        this.name = name;
        this.login = login;
        this.role = role;
        this.password = password;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
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
        UserUpdateRequest that = (UserUpdateRequest) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(login, that.login) &&
                role == that.role &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, login, role, password);
    }

    @Override
    public String toString() {
        return "UserUpdateRequest{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", role=" + role +
                '}';
    }
}