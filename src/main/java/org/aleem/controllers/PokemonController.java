package org.aleem.controllers;

import org.aleem.data.PokemonProduct;
import org.aleem.scrappers.PokemonScrapper;
import org.aleem.services.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokemonController {

    PokemonService pokemonService;

    // Constructor Injection
    PokemonController(PokemonService pokemonService){
        this.pokemonService=pokemonService;
    }
    @GetMapping("/pokemon/getProducts")
    public List<PokemonProduct> getPokemonProducts(){
        return pokemonService.getProducts();
    }
}
