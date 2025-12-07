package fr.uge.poo.amanet.items.q2;

import java.util.Objects;
import java.util.Set;
import java.util.function.ToIntFunction;

public final class Dvd implements Item {
    private final Product product;
    private final int zone;
    private final Set<Language> languages;
    private final ToIntFunction<Dvd> function = item -> item.product.releaseDate() < 2000 ? 2 : 10;

    public Dvd(Product product, int zone, Set<Language> languages){
        this.product = Objects.requireNonNull(product);
        if(zone < 1 || zone > 5){
            throw new IllegalArgumentException();
        }
        this.zone = zone;
        this.languages = Set.copyOf(languages);
        super();
    }
    @Override
    public String getShortDescription() {
        return product.toString();
    }
    @Override
    public String getLongDescription() {
        return "DVD : " + product.toString() + "\nAudio : " + languages.toString() + "\nZone : " + zone;
    }
    @Override
    public int price() {
        return function.applyAsInt(this);
    }
}