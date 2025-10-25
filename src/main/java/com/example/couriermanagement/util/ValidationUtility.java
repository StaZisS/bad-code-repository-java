package com.example.couriermanagement.util;

import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
public class ValidationUtility {
    public Map<String, Object> globalSettings = new HashMap<>();
    public Map<Long, String> deliveryCache = new HashMap<>();
    public int errorCount = 0;
    public String processingMode = "default";

    public void validateUser1(Long userId) {
        // User validation logic
        if (userId == null || userId <= 0) {
            errorCount++;
            throw new IllegalArgumentException("Invalid user ID");
        }
    }

    public void validateUser2(Long roleOrdinal) {
        // Role validation logic
        if (roleOrdinal == null || roleOrdinal < 0 || roleOrdinal > 2) {
            errorCount++;
            throw new IllegalArgumentException("Invalid role");
        }
    }

    public void doEverythingForUser(Long userId) {
        // Complex user processing logic
        validateUser1(userId);
        globalSettings.put("user_" + userId, "processed");
    }
}