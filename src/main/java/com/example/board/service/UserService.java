package com.example.board.service;

import org.springframework.http.ResponseEntity;

public interface UserService {
  ResponseEntity<? super GetUserResponseDto> getUserResponseEntity();
}
