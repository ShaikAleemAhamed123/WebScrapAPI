package org.aleem.data;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.ComponentScan;

@Getter
@Setter
public class PokemonProduct {

    private String url;
    private String image;
    private String name;
    private String price;

    // getters and setters omitted for brevity...

    @Override
    public String toString() {
        return "{ \"url\":\"" + url + "\", "
                + " \"image\": \"" + image + "\", "
                + "\"name\":\"" + name + "\", "
                + "\"price\": \"" + price + "\" }";
    }

}
