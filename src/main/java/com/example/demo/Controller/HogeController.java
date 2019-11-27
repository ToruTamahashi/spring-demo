package com.example.demo.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="api")
@EnableAutoConfiguration
public class HogeController {


    @RequestMapping("/text1")
    public String text1() {
        return "s";
    }

    @RequestMapping(value="/v1/tickets", method = RequestMethod.POST)
    public Map<String, String> post(HttpServletRequest request) {
        Map<String, String> map = new HashMap<>();
        map.put("parameter1", request.getParameter("parameter1")+"abc");
        map.put("parameter2", request.getParameter("parameter2")+"def");
        System.out.println("parameter1 : " + request.getParameter("parameter1"));
        System.out.println("parameter2 : " + request.getParameter("parameter2"));
        return map;
    }
}
