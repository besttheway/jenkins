package com.example.studyspring.cn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
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

        return "i love you";
    }

    @RequestMapping("getStatus")
    public String say(HttpServletResponse response) throws IOException {

        return "自动化部署";
    }



    public String login(){

        return "";
    }


}
