package fr.uge.poo.amanet.items.q1;

import java.util.Set;

public record BluRay(Product product, Set<Language> languages, boolean is3D) implements Item{
    @Override
    public String getShortDescription() {
        return product.toString();
    }

    @Override
    public String getLongDescription() {
        return "BLU-RAY : " + product.toString() + "\nAudio : " + languages.toString() + "\n3D : " + is3D;
    }
}