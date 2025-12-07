package fr.uge.poo.amanet.items.q2;

import java.util.Objects;
import java.util.function.ToIntFunction;

public final class VideoGame implements Item {
    private final Product product;
    private final Platform platform;
    private final ToIntFunction<VideoGame> function = item -> item.platform == Platform.PC ? 60 : 50;

    public VideoGame(Product product, Platform platform){
        this.product = Objects.requireNonNull(product);
        this.platform = Objects.requireNonNull(platform);
        super();
    }
    @Override
    public String getShortDescription() {
        return product.toString();
    }

    @Override
    public String getLongDescription() {
        return "GAME : " + product.toString() + "\nPlateform : " + platform;
    }
    @Override
    public int price() {
        return function.applyAsInt(this);
    }
}