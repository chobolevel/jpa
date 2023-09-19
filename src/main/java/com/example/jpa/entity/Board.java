package com.example.jpa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Board {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false)
  private String title;
  @Column(nullable = false)
  private String content;

  public Board(String title, String content) {
    this.title = title;
    this.content = content;
  }

}
