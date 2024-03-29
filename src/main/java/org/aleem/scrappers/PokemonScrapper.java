package org.aleem.scrappers;

import org.aleem.data.PokemonProduct;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class PokemonScrapper {

    public List<PokemonProduct> getPokemonProducts() {
        Document doc;
        try {
            doc = Jsoup
                    .connect("https://scrapeme.live/shop")
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36")
                    .header("Accept-Language", "*")
                    .get();
        } catch (Exception e) {
            throw new RuntimeException();
        }

        // initializing the list of Java object to store the scraped data
        List<PokemonProduct> pokemonProducts = new ArrayList<>();

        // retrieving the list of product HTML elements
        Elements products = doc.select(".product");

        // iterating over the list of HTML products
        for (Element product : products) {
            PokemonProduct pokemonProduct = new PokemonProduct();

            // extracting the data of interest from the product HTML element
            // and storing it in pokemonProduct
            pokemonProduct.setUrl(product.selectFirst("a").attr("href"));
            pokemonProduct.setImage(product.selectFirst("img").attr("src"));
            pokemonProduct.setName(product.selectFirst("h2").text());
            pokemonProduct.setPrice(product.selectFirst("span").text());

            // adding pokemonProduct to the list of the scraped products
            pokemonProducts.add(pokemonProduct);
        }


        return pokemonProducts;
    }


}
