package com.example.board.dto.response.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.board.dto.response.ResponseCode;
import com.example.board.dto.response.ResponseDto;
import com.example.board.dto.response.ResponseMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetUserResponseDto extends ResponseDto {
  
  private String email;
  private String nickname;
  private String profileImage;

  public GetuserResponseDto(String email, String nickname, String profileImage) {
    super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
    this.email = email;
    this.nickname = nickname;
    this.profileImage = profileImage;
  }

  public static ResponseEntity<GetuserResponseDto> success (email, nickname, profileImage) {
    GetuserResponseDto body = new GetuserResponseDto(email, nickname, profileImage);
    return ResponseEntity.status(HttpStatus.OK).body(body);
  }

}