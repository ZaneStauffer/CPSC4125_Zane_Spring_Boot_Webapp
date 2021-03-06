package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @GetMapping("/")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
    }
    
    @GetMapping("/contact")
    public String contact(Model model){
        return "contact";
    }

    @PostMapping("/contact")
    public String postContact(Model model, @RequestBody Contact contact){
        //return fragment contactResponse
        model.addAttribute("email", contact.getEmail());
        model.addAttribute("message", contact.getMessage());
        return "fragments/contactResponse :: #contactSuccess";
    }

    @GetMapping("/about")
    public String about(Model model){
        return "about";
    }

    @GetMapping("/blog")
    public String blog(Model model){
        return "blog";
    }

    @PostMapping("/blog")
    public String blog(Model model, @RequestBody Entry entry){
        model.addAttribute("title", entry.getTitle());
        model.addAttribute("date", entry.getDate());
        model.addAttribute("contents", entry.getContents());
        return "fragments/blogEntry";
    }
    //adding another GET and POST similar to contact, public postBlog(Blog)
    //new object blog needs a string

}
