package com.example.login.dto.request;

import lombok.Data;

@Data
public class MemberRequest {

    private String id;
    private String password;
    private String email;
}
