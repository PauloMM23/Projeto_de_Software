package com.example.demo.controller;

import com.example.demo.model.Arduino;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/led")
public class ControllerLed {

    private Arduino arduino = new Arduino();
    @GetMapping("/ligar")
    public String ligar(){
        arduino.ligar();
        return "ligado";
    }

    @GetMapping("/desligar")
    public String desligar(){
        arduino.desligar();
        return "desligado";
    }
}
