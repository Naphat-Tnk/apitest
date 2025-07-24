package com.example.apitest.controller;

import com.example.apitest.Entity.SsoUser;
import com.example.apitest.model.SsoResponse;
import com.example.apitest.service.SsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apitest")
public class SsoController {

    private final SsoService ssoService;
    @Autowired
    public SsoController(SsoService ssoService) {
        this.ssoService = ssoService;
    }

    @PostMapping("/gettoken")
    public ResponseEntity<SsoResponse> create(@RequestBody SsoUser user) {
        return ssoService.post(user);
    }

}
