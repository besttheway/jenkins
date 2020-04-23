package com.example.studyspring;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class StudyspringApplicationTests {
    ArrayList<String> list = new ArrayList<String>(){
        {
            add("ali");
            add("jack");
        }
    };
    @Test
    void contextLoads() {
        System.out.println(list.contains("ali"));
    }

}
