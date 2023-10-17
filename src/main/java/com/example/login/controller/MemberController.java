package com.example.login.controller;

import com.example.login.dto.request.LoginRequest;
import com.example.login.dto.request.MemberRequest;
import com.example.login.dto.response.MemberResponse;
import com.example.login.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequiredArgsConstructor

@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/login")
    public String memberLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String memberLogin(LoginRequest dto, HttpServletRequest req) {

        MemberResponse memberResponse = memberService.login(dto);
        if (memberResponse == null) {
            return "login";
        }

        req.getSession().invalidate();
        HttpSession session = req.getSession(true);

        session.setAttribute("num", memberResponse.getNum());
        session.setMaxInactiveInterval(1800);

        return "index";
    }

    @GetMapping("/join")
    public String memberJoinForm() {
        return "join";
    }

    @PostMapping("/join")
    public String memberJoin(MemberRequest dto) {

        memberService.join(dto);

        return "join";
    }

}
