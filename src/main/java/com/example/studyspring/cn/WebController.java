package com.example.studyspring.cn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;

@RestController
public class WebController {

    ArrayList<String> list = new ArrayList<String>(){
        {
            add("ali");
            add("jack");
        }
    };

    @RequestMapping
    public String say(){

        return "this new";
    }

    @RequestMapping("getStatus")
    public String say(HttpServletRequest request) throws IOException {
        System.out.println("a");
        return "自动化部署a";
    }



    public String login(){

        return "";
    }


}
