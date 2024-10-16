package com.study.board.global.mapper;

import com.study.board.domain.entity.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    // 게시글 생성
    void createBoard(Board board);
    // 게시글 목록 조회
    List<Board> getBoardList();
    // 게시글 상세 조회
    Board getBoard(Long id);
    // 게시글 업데이트
    void updateBoard(Board board);
    // 게시글 삭제
    void deleteBoard(Long id);
}
