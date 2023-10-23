package com.example.login.dto.request;

import lombok.Data;

@Data
public class BoardRequest {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private Boolean noticeYn;
}
