package org.aleem.services;

import org.aleem.controllers.PokemonController;
import org.aleem.data.PokemonProduct;
import org.aleem.scrappers.PokemonScrapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    PokemonScrapper pokemonScrapper;
    PokemonService(PokemonScrapper pokemonScrapper){
        this.pokemonScrapper=pokemonScrapper;
    }
    public List<PokemonProduct> getProducts() {
        return pokemonScrapper.getPokemonProducts();
    }
}
