package com.example.jpa.service.board;

import com.example.jpa.entity.Board;

public interface BoardService {

  void create(Board board);

  Board findById(String id);

}
