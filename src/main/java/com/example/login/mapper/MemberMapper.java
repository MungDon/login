package com.example.login.mapper;

import com.example.login.dto.request.LoginRequest;
import com.example.login.dto.request.MemberRequest;
import com.example.login.dto.response.MemberResponse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    void memberInsert(MemberRequest dto);
    MemberResponse findByIdAndPwd(LoginRequest dto);





}
