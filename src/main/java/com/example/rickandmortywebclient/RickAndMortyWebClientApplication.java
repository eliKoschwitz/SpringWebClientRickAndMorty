package com.example.rickandmortywebclient;

import com.example.rickandmortywebclient.model.Character;
import com.example.rickandmortywebclient.service.WebClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class RickAndMortyWebClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RickAndMortyWebClientApplication.class, args);
    }
}
