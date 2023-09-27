package com.green.TeamTest1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //시작페이지
    @GetMapping("/")
    public String main(){
        System.out.println("집에 보내주세요..");
        System.out.println("집에 보내주세요..");
        return "index";
    }
}
