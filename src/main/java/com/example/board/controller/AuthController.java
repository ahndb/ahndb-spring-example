package com.example.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

  @PostMapping("/sign-in")
  public String signIn(@RequestBody String entity) {
    return null;
  }

  @PostMapping("/sign-up")
  public String signUp(@RequestBody String entity) {
    return null;
  }

}
