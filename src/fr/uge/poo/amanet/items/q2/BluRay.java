package fr.uge.poo.amanet.items.q2;

import java.util.Set;
import java.util.stream.Collectors;

public record BluRay(Product product, Set<Language> languages, boolean is3D) implements Item, VideoItem {
    @Override
    public String getLongDescription() {
        return "BLU-RAY : " + product.toString() + "\nAudio : " + languages.stream().map(Enum::name).collect(Collectors.joining(", ")) + "\n3D : " + is3D;
    }
    @Override
    public int price() {
        return is3D ? 30 : 20;
    }
}