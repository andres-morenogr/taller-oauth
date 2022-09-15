package com.mintic.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/")
  public String hello(){
    return "Hello";
  }

  @GetMapping("/restricted")
  public String restricted(){
    return "This is restricted, you are logged in";
  }

}
