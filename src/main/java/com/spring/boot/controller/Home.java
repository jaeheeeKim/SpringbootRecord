package com.spring.boot.controller;

import com.spring.boot.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class Home {
    @Autowired
    StudyService studyService;

    @GetMapping("/")
    public String doHome() {
        return "home";
    }
//    // redirect로 WEB-INF에 클라이언트에서 접근 불가능❌
//    @RequestMapping("/home")
//    public String doHome2() {
//        return "redirect:/WEB-INF/views/home.jsp";
//    }
//    // 접근 가능⭕
//    @RequestMapping("/home2")
//    public String doHome3() {
//        return "redirect:/base/home.jsp";
//    }

//    @GetMapping("/study")
//    public List<Map<String, String>> study() {
//        List<Map<String, String>> list = new ArrayList<>();
//        list = studyService.doStudyList();
//        return list;
//    }
    @GetMapping("/study")
    @ResponseBody
    public String study() {
        List<Map<Object, Object>> list = new ArrayList<>();
        list = studyService.doStudyList();
        for(Map<Object, Object> map : list) {
            System.out.println(map.get("key_id"));
            System.out.println(map.get("contents"));
        }
        return "...";
    }
}
