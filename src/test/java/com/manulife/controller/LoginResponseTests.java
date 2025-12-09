package com.manulife.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * LoginResponse 测试类
 * 覆盖所有构造函数、getter 和 setter 方法
 */
class LoginResponseTests {

    @Test
    void testNoArgsConstructor() {
        LoginResponse response = new LoginResponse();

        assertFalse(response.isSuccess());
        assertNull(response.getMessage());
    }

    @Test
    void testAllArgsConstructorWithSuccess() {
        LoginResponse response = new LoginResponse(true, "Login successful");

        assertTrue(response.isSuccess());
        assertEquals("Login successful", response.getMessage());
    }

    @Test
    void testAllArgsConstructorWithFailure() {
        LoginResponse response = new LoginResponse(false, "Login failed");

        assertFalse(response.isSuccess());
        assertEquals("Login failed", response.getMessage());
    }

    @Test
    void testSuccessGetterAndSetter() {
        LoginResponse response = new LoginResponse();

        assertFalse(response.isSuccess());
        response.setSuccess(true);
        assertTrue(response.isSuccess());
        response.setSuccess(false);
        assertFalse(response.isSuccess());
    }

    @Test
    void testMessageGetterAndSetter() {
        LoginResponse response = new LoginResponse();

        assertNull(response.getMessage());
        response.setMessage("Test message");
        assertEquals("Test message", response.getMessage());
        response.setMessage("Another message");
        assertEquals("Another message", response.getMessage());
    }

    @Test
    void testAllFieldsSetAndGet() {
        LoginResponse response = new LoginResponse();

        response.setSuccess(true);
        response.setMessage("All fields test");

        assertTrue(response.isSuccess());
        assertEquals("All fields test", response.getMessage());
    }
}

