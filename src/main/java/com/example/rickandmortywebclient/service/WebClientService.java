package com.example.rickandmortywebclient.service;

import com.example.rickandmortywebclient.repo.CharacterRepo;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Data
@NoArgsConstructor
@Service
public class WebClientService {

    private CharacterRepo characterRepo;

    public WebClientService(CharacterRepo characterRepo) {
        this.characterRepo = characterRepo;
    }

    public CharacterRepo getAllCharacterFromAPI(){
        allCharacterFromAPI();
        return characterRepo;
    }

    public CharacterRepo getAllAliveCharacterFromAPI(){
        allAliveCharacterFromAPI();
        return characterRepo;
    }

    private void allCharacterFromAPI(){
        WebClient getWebClient = WebClient.create("https://rickandmortyapi.com");

        CharacterRepo results = getWebClient.get()
                .uri("/api/character")
                .retrieve()
                .toEntity(CharacterRepo.class)
                .block()
                .getBody();

        System.out.println(results.toString());

        characterRepo = results;
    }

    private void allAliveCharacterFromAPI(){
        WebClient getWebClient = WebClient.create("https://rickandmortyapi.com");

        CharacterRepo results = getWebClient.get()
                .uri("api/character?status=alive")
                .retrieve()
                .toEntity(CharacterRepo.class)
                .block()
                .getBody();

        characterRepo = results;
    }
}
