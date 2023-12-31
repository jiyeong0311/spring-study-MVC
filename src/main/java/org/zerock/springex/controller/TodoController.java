package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {

    @RequestMapping("/list")
    public void list(Model model){
        log.info("todo list.............");
    }

    @GetMapping("/register")
    public void register(){
        log.info("todo register...........");
    }

//    @PostMapping("/register")
//    public void registerPost(TodoDTO todoDTO) {
//        log.info("POST todo register.............");
//        log.info(todoDTO);
//    }

}
