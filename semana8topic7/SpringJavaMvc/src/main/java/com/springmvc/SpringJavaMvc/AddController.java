package com.springmvc.SpringJavaMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("t1") int number1, @RequestParam("t2") int number2) {
        ModelAndView modelAndView = new ModelAndView();

        int result = number1 + number2;
        modelAndView.addObject("result", result);
        modelAndView.setViewName("result.jsp");

        return modelAndView;
    }
}
