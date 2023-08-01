package com.example.internationalization_language.services;

import jakarta.servlet.http.HttpServletRequest;

import java.io.UnsupportedEncodingException;

public interface LocaleService {
    String getMessage(String code, HttpServletRequest request) throws UnsupportedEncodingException;
}
