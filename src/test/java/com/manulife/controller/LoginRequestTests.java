package com.manulife.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * LoginRequest 测试类
 * 覆盖所有 getter 和 setter 方法
 */
class LoginRequestTests {

    @Test
    void testDefaultConstructor() {
        LoginRequest request = new LoginRequest();

        assertNull(request.getUsername());
        assertNull(request.getPassword());
    }

    @Test
    void testUsernameGetterAndSetter() {
        LoginRequest request = new LoginRequest();

        assertNull(request.getUsername());
        request.setUsername("testuser");
        assertEquals("testuser", request.getUsername());
    }

    @Test
    void testPasswordGetterAndSetter() {
        LoginRequest request = new LoginRequest();

        assertNull(request.getPassword());
        request.setPassword("testpassword");
        assertEquals("testpassword", request.getPassword());
    }

    @Test
    void testAllFieldsSetAndGet() {
        LoginRequest request = new LoginRequest();

        request.setUsername("admin");
        request.setPassword("secret123");

        assertEquals("admin", request.getUsername());
        assertEquals("secret123", request.getPassword());
    }
}



