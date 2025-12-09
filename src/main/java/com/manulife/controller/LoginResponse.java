package com.manulife.controller;

import lombok.Getter;
import lombok.Setter;

/**
 * 登录响应类
 */
@Setter
@Getter
public class LoginResponse {
    private boolean success;
    private String message;

    public LoginResponse() {
    }

    public LoginResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

}

