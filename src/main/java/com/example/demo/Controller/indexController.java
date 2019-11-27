package com.example.demo.Controller;

import com.example.demo.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("categories/{category_id}")
public class indexController {
    @RequestMapping("/")
    public String showTopPage(){
        return "index";
    }

    @RequestMapping(value = "/input", method = RequestMethod.GET)
    public String input(Model model){
        // 空のフォームオブジェクトをModelに設定
        model.addAttribute("message", new Message());
        // 遷移先を返す(この場合はinput.htmlが遷移先となる)
        return "input";
    }

    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    public String confirm(@ModelAttribute("message") Message form) {
        // 遷移先を返す(この場合はconfirm.htmlが遷移先となる)
        return "confirm";
    }

    @RequestMapping("/jq")
    public String showjQuery(){
        return "testjQuery";
    }


    @RequestMapping("/top")
    public String hello() {
        return "top";
    }

    @RequestMapping("/scroll")
    public String scroll() {
        return "scrollspy";
    }



}
