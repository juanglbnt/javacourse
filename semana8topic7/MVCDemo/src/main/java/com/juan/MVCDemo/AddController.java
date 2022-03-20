package com.juan.MVCDemo;

import com.juan.MVCDemo.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {

    @Autowired
    private AddService addService;

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") int number1, @RequestParam("t2") int number2,
                            HttpServletRequest request, HttpServletResponse response) {

        int result = addService.add(number1, number2);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("display.jsp");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
