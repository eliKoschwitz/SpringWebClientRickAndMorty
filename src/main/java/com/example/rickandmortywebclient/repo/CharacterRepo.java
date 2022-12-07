package com.example.rickandmortywebclient.repo;

import com.example.rickandmortywebclient.model.Info;
import com.example.rickandmortywebclient.model.Character;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class CharacterRepo {
    private Info info = new Info();
    private List<Character> results = new ArrayList<>();

    public List<Character> getAllCharacter(){
        return results;
    }

}
