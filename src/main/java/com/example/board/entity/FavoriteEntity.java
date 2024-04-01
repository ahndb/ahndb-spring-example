package com.example.board.entity;

import com.example.board.entity.pk.FavoritePk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "favorite")
@Table(name = "favorite")
@IdClass(FavoritePk.class)
public class FavoriteEntity {
  // pk가 여러개 설정되어 있을 때 파일하나 만들고 클래스로 묶어서 타입선언에 사용하기
  @Id
  private Integer boardNumber;
  @Id
  private String userEmail;
}
