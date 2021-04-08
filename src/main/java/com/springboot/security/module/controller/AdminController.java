package com.springboot.security.module.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/app/rest")
public class AdminController {

    @RequestMapping(value = "/get_admin",method = RequestMethod.GET)
    public ResponseEntity getAdminDetail(@RequestParam Long id){
        System.out.println("working "+id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
