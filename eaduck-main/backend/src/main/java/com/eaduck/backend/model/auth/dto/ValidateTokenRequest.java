package com.eaduck.backend.model.auth.dto;

public class ValidateTokenRequest {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}