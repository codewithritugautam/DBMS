package com.example.demo.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@RequestMapping("/home")
public String getInfor() {
return "Your in home page";
}
@GetMapping("/index")
public String display() {
return "Your name is Arun kumar u r in batch4119";
}
}
