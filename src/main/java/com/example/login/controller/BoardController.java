package com.example.login.controller;

import com.example.login.dto.response.BoardResponse;
import com.example.login.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/list")
    public String openBoardList(Model model) {
        List<BoardResponse> posts = boardService.findAllPost();
        model.addAttribute("posts", posts);
        return "list";
    }
}