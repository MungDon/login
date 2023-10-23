package com.example.login.service;

import com.example.login.dto.response.BoardResponse;
import com.example.login.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public List<BoardResponse> findAllPost() {
        return boardMapper.findAll();
    }
}
