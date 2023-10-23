package com.example.login.mapper;

import com.example.login.dto.response.BoardResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    /**
     * 게시글 리스트
     */
    List<BoardResponse> findAll();
}
