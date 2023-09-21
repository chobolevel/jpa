package com.example.jpa.service.board.impl;

import com.example.jpa.entity.Board;
import com.example.jpa.repository.BoardRepository;
import com.example.jpa.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardServiceImpl implements BoardService {

  private final BoardRepository boardRepository;

  @Override
  public void create(Board board) {
    String id = UUID.randomUUID().toString();
    board.setId(id);
    boardRepository.save(board);
  }

  @Override
  public Board findById(String id) {
    return boardRepository.findById(id);
  }
}
