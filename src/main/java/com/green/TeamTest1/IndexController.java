package com.green.TeamTest1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //시작 페이지
    @GetMapping("/")
    public String main(){
        System.out.println("프로젝트 시작 :3");
        System.out.println("새로 추가된 내용");
        return "index";
    }

}
