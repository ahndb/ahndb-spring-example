package com.example.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/search")
public class SearchController {
  
  // 인기 검색어 리스트
  @GetMapping("/popular-list")
  public String popularList() {
    return null;
  }

  // 관련 검색어 리스트
  @GetMapping("/{searchWord}/relation-list")
  public String relationList() {
    return null;
  }





















}
