package fr.uge.poo.amanet.items.q1;

public record VideoGame(Product product, Platform platform) implements Item {
    @Override
    public String getLongDescription() {
        return "GAME : " + product.toString() + "\nPlateform : " + platform;
    }
}