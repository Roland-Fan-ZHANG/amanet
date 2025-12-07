package fr.uge.poo.amanet.items.q1;

import java.util.Set;

public record Dvd(Product product, int zone, Set<Language> languages) implements Item{
    @Override
    public String getShortDescription() {
        return product.toString();
    }

    @Override
    public String getLongDescription() {
        return "DVD : " + product.toString() + "\nAudio : " + languages.toString() + "\nZone : " + zone;
    }
}