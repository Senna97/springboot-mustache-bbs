package com.mustache.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller // 컨트롤러 선언
public class MustacheController {
    @GetMapping(value = "/hi") // /hi 라는 Endpoint 에 매핑
    public String mustacheCon(Model model) {
        model.addAttribute("username", "rok"); // view 에 값을 넘기겠다.
        return "greetings"; // greetings 라는 이름의 view 리턴
    }

    @GetMapping(value = "/hi/{id}")
    public String mustacheCon2(@PathVariable String id, Model model) {
        model.addAttribute("username", "rok");
        model.addAttribute("id", id);
        return "greetings";
    }
}
