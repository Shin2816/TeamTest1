package com.green.TeamTest1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //시작 페이지
    @GetMapping("/")
    public String main(){
        return "index";
    }

}
