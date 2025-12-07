package fr.uge.poo.amanet.items.q2;

import java.util.Objects;
import java.util.Set;
import java.util.function.ToIntFunction;

public final class BluRay implements Item {
    private final Product product;
    private final Set<Language> languages;
    private final boolean is3D;
    private final ToIntFunction<BluRay> function = item -> item.is3D ? 30 : 20;

    public BluRay(Product product, Set<Language> languages, boolean is3D){
        this.product = Objects.requireNonNull(product);
        this.languages = Set.copyOf(languages);
        this.is3D = is3D;
    }
    @Override
    public String getShortDescription() {
        return product.toString();
    }

    @Override
    public String getLongDescription() {
        return "BLU-RAY : " + product.toString() + "\nAudio : " + languages.toString() + "\n3D : " + is3D;
    }
}