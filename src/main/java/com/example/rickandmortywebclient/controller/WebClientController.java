package com.example.rickandmortywebclient.controller;

import com.example.rickandmortywebclient.service.WebClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WebClientController {

    WebClientService webClientService;

    public WebClientController(WebClientService webClientService) {
        this.webClientService = webClientService;
    }

    @GetMapping("/character")
    public void getAllCharacter(){
        webClientService.getAllCharacterFromAPI();
    }

    @GetMapping("/status=alive")
    public void getAllAliveCharacter(){
        webClientService.getAllAliveCharacterFromAPI();
    }
}