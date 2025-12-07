package fr.uge.poo.amanet;

import fr.uge.poo.amanet.client.Client;
import fr.uge.poo.amanet.client.Country;
import fr.uge.poo.amanet.items.q1.Dvd;
import fr.uge.poo.amanet.items.q1.Language;
import fr.uge.poo.amanet.items.q1.Product;

import java.util.Set;

public class Application {
    void main(){
        var client = new Client.ClientBuilder()
                .firstName("Arnaud")
                .lastName("Carayol")
                .country(Country.FRANCE)
                .email("arnaud.carayol@univ-eiffel.fr")
                .build();
        System.out.println(client);

        var product = new Product("Avatar", 2009);
        var dvd = new Dvd(product, 1, Set.of(Language.FRENCH, Language.ENGLISH));
        System.out.println(dvd.getLongDescription());
        System.out.println(dvd.getShortDescription());
        //System.out.println(dvd.price());
    }
}