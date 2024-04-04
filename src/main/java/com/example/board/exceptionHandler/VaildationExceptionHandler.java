package com.example.board.exceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.board.dto.response.ResponseDto;

@RestControllerAdvice
public class VaildationExceptionHandler {

  @ExceptionHandler(value = {
      HttpMessageNotReadableException.class,
      MethodArgumentNotValidException.class
  })
  public ResponseEntity<ResponseDto> validationExceptionHandler(Exception exception) {
    exception.printStackTrace();
    return ResponseDto.validationFail();
  }
}
