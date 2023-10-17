package com.example.login.service;
import com.example.login.dto.request.LoginRequest;
import com.example.login.dto.request.MemberRequest;
import com.example.login.dto.response.MemberResponse;
import com.example.login.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;
    @Transactional()
    public void join(MemberRequest dto) {
        memberMapper.memberInsert(dto);

    }
    @Transactional(readOnly = true)
    public MemberResponse login(LoginRequest dto){
        return memberMapper.findByIdAndPwd(dto);

    }

}
