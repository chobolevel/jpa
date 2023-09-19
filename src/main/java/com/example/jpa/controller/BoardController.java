package com.example.jpa.controller;

import com.example.jpa.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {

  private final BoardRepository boardRepository;

  @GetMapping("/api/board/{id}")
  public ResponseEntity<?> boardList(@PathVariable Long id) {
    return new ResponseEntity<>(boardRepository.findOneById(id), HttpStatus.OK);
  }

}
