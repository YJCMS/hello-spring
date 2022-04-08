package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// 웹어플리케이션의 첫 진입점이 Controller
// 컨트롤러는 컨트롤러 어노테이션을 작성

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data","spring!!");
        return "hello";

    }
}
