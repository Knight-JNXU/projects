package code.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController{
    
    @RequestMapping(value = {"", "/", "/index"}, method=RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response, Model model){
        return "mhindex";
    }
    
}
