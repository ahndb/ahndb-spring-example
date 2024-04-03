package com.example.board.dto.response.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.board.dto.response.ResponseCode;
import com.example.board.dto.response.ResponseMessage;
import com.example.board.dto.response.user.GetUserResponseDto;
import com.example.board.entity.UserEntity;

import lombok.Getter;

@Getter

public class SignUpResponseDto {
  private String email;
  private String password;
  private String nickname;
  private String telNumber;
  private String address;
  private String addressDetail;

    private SignUpResponseDto(UserEntity userEntity) {
    super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
    this.email = userEntity.getEmail();
    this.password = userEntity.getPassword();
    this.nickname = userEntity.getNickname();
    this.telNumber = userEntity.getTelNumber();
    this.address = userEntity.getAddress();
    this.addressDetail = userEntity.getAddressDetail();
  }

  public static ResponseEntity<GetUserResponseDto> success(UserEntity userEntity) {
    GetUserResponseDto body = new GetUserResponseDto(userEntity);
    return ResponseEntity.status(HttpStatus.OK).body(body);
  }

}
}
