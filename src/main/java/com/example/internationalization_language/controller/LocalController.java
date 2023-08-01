package com.example.internationalization_language.controller;

import com.example.internationalization_language.helper.Translator;
import com.example.internationalization_language.services.LocaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/api")
public class LocalController {
    @Autowired
    private LocaleService localeService;

    @GetMapping("/hello")
    public String index(HttpServletRequest request) throws UnsupportedEncodingException {
        return localeService.getMessage("hello", request);
    }

    @GetMapping("/locale")
    public String getMessage(@RequestParam("msg") String msg) {
        return Translator.toLocale(msg);
    }
}
