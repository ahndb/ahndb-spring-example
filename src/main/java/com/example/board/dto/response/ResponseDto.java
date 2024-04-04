package com.example.board.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseDto {
  private String code;
  private String message;

  public static ResponseEntity<ResponseDto> success() {
    ResponseDto body = new ResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
    return ResponseEntity.status(HttpStatus.OK).body(body);
  }

  // 중복이메일
  public static ResponseEntity<ResponseDto> duplicateEmail() {
    ResponseDto body = new ResponseDto(ResponseCode.DUPLICATE_EMAIL, ResponseMessage.DUPLICATE_EMAIL);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
  }

  // 중복닉네임
  public static ResponseEntity<ResponseDto> duplicateNickname() {
    ResponseDto body = new ResponseDto(ResponseCode.DUPLICATE_NICKNAME, ResponseMessage.DUPLICATE_NICKNAME);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
  }

  // 중복 휴대전화번호
  public static ResponseEntity<ResponseDto> duplicateTelNumber() {
    ResponseDto body = new ResponseDto(ResponseCode.DUPLICATE_TEL_NUMBER, ResponseMessage.DUPLICATE_TEL_NUMBER);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
  }

  // 여기로 옮긴 이유: 같은 내용으로 계속 쓰이기 때문에
  public static ResponseEntity<ResponseDto> databaseError() {
    ResponseDto body = new ResponseDto(ResponseCode.DATABASE_ERROR, ResponseMessage.DATABASE_ERROR);
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
  }

  public static ResponseEntity<ResponseDto> notExistUser() {
    ResponseDto body = new ResponseDto(ResponseCode.NOT_EXIST_USER, ResponseMessage.NOT_EXIST_USER);
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(body);
  }
}
