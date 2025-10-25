# Courier Management System

Spring Boot 3 приложение для управления курьерской службой.

## Требования
- Java Development Kit (JDK) 21 — настройте переменную `JAVA_HOME`.
- Git для получения исходного кода.
- Docker _или_ установленный PostgreSQL 14+ (опционально, для запуска с боевой базой).

Gradle поставляется вместе с проектом (`./gradlew`), отдельно ставить его не нужно.

## Первичная настройка
1. Склонируйте репозиторий и перейдите в каталог проекта.
2. Выполните `./gradlew --version`, чтобы Gradle скачал зависимости и убедился в корректной установке JDK.

## Быстрый старт (встроенная H2)
По умолчанию используется встроенная база H2 в памяти и активируется профиль `default`.

```bash
./gradlew bootRun
```

Приложение поднимется на `http://localhost:8080`. Консоль H2 будет доступна на `http://localhost:8080/h2-console` (логин `sa`, пароль пустой). Liquibase автоматически применит миграции из `src/main/resources/db`.

## Запуск с PostgreSQL
Для использования боевой конфигурации активируйте профиль `prod`. Его настройки описаны в `src/main/resources/application-prod.yml`.

1. Поднимите PostgreSQL и создайте базу `courier_management`.
   ```bash
   docker run --name courier-postgres \
     -e POSTGRES_DB=courier_management \
     -e POSTGRES_USER=courier_user \
     -e POSTGRES_PASSWORD=courier_password \
     -p 5432:5432 \
     -d postgres:15
   ```
   При необходимости замените пользователя/пароль и передайте их приложению через переменные `DB_USERNAME` / `DB_PASSWORD`.
2. Запустите сервис с активным prod-профилем:
   ```bash
   SPRING_PROFILES_ACTIVE=prod \
   DB_USERNAME=courier_user \
   DB_PASSWORD=courier_password \
     ./gradlew bootRun
   ```

Liquibase автоматически выполнит миграции в PostgreSQL при старте.

## Сборка и тесты
- `./gradlew test` — прогон модульных тестов.
- `./gradlew bootJar` — сборка исполняемого JAR (`build/libs/*.jar`).

Для запуска собранного JAR:
```bash
java -jar build/libs/courier-management-system-java-0.0.1-SNAPSHOT.jar
```
При необходимости укажите профиль, например `--spring.profiles.active=prod`.

## Полезные эндпоинты
- Swagger UI: `http://localhost:8080/swagger-ui.html`
- OpenAPI спецификация: `http://localhost:8080/v3/api-docs`

Логи приложения выводятся в консоль; уровни логирования настраиваются в `application.yml`.
