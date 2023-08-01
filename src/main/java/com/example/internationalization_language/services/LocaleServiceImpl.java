package com.example.internationalization_language.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.LocaleResolver;

import jakarta.servlet.http.HttpServletRequest;

import java.io.UnsupportedEncodingException;

@Service
public class LocaleServiceImpl implements LocaleService {

    @Autowired
    private MessageSource messageSource;
    @Autowired
    private LocaleResolver localeResolver;

    @Override
    public String getMessage(String code, HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        return messageSource.getMessage(code, null, localeResolver.resolveLocale( request));
    }
}
