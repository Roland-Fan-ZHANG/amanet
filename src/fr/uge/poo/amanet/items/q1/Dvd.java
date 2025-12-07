package fr.uge.poo.amanet.items.q1;

import java.util.Set;
import java.util.stream.Collectors;

public record Dvd(Product product, int zone, Set<Language> languages) implements Item, VideoItem{
    @Override
    public String getLongDescription() {
        return "DVD : " + product.toString() + "\nAudio : " + languages.stream().map(Enum::name).collect(Collectors.joining(", ")) + "\nZone : " + zone;
    }
}