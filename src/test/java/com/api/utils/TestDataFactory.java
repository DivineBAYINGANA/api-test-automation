package com.api.utils;

import java.util.HashMap;
import java.util.Map;

public class TestDataFactory {

    // ===================== Post Test Data =====================

    public static Map<String, Object> createValidPost() {
        Map<String, Object> post = new HashMap<>();
        post.put("userId", 1);
        post.put("title", "API Test - Test Post Title");
        post.put("body", "This is a test body created by the API test automation framework.");
        return post;
    }

    public static Map<String, Object> createUpdatedPost() {
        Map<String, Object> post = new HashMap<>();
        post.put("id", 1);
        post.put("userId", 1);
        post.put("title", "Updated Title via PUT Request");
        post.put("body", "This body was updated using a full PUT request operation.");
        return post;
    }

    public static Map<String, Object> createPatchData() {
        Map<String, Object> patch = new HashMap<>();
        patch.put("title", "Patched Title via PATCH Request");
        return patch;
    }

    private TestDataFactory() {
    }
}
