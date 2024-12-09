package com.kalleH.animeLab.Controller;

import com.kalleH.animeLab.Repository.AnimeRepository;
import com.kalleH.animeLab.model.Anime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
@Controller
public class AnimeController {
    private WebClient animeWebClientConfig;
    @Autowired
    AnimeRepository animeRepository;
    public AnimeController(WebClient.Builder webClient, AnimeRepository animeRepository) {
        this.animeWebClientConfig = webClient
                .baseUrl("http://localhost:8080")
                .build();
        this.animeRepository = animeRepository;
    }

    @GetMapping("/login")
    public String test() {
        return "login";
    }


    @GetMapping("/anime")
        public ResponseEntity<List<Anime>> getAllUsers() {
        return ResponseEntity.ok(animeRepository.findAll());
    }
    @PostMapping("/anim")
        public ResponseEntity<Anime> insertUserToUsers (@RequestBody Anime anime) {
            return ResponseEntity
            .status(201)
            .body(animeRepository.save(anime));
    }
}


