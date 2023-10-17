package com.example.login.dto.response;

import lombok.Data;
import lombok.Getter;

@Data
public class MemberResponse {
    private Long num;
    private String id;
    private String password;
    private String email;
}
