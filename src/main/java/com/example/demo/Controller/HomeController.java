package com.example.demo.Controller;

import com.example.demo.Model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    String home(){
        return "index";
    }
    @GetMapping ("/frontPage")
    public String frontPage(Model model){
        List<Product> products = new ArrayList<>();
        model.addAttribute("books", bookList);
        return "/bookFront";
    }
}
