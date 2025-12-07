package fr.uge.poo.amanet.items.q2;

public record VideoGame(Product product, Platform platform) implements Item {
    @Override
    public String getLongDescription() {
        return "GAME : " + product.toString() + "\nPlateform : " + platform;
    }
    @Override
    public int price() {
        return platform == Platform.PC ? 60 : 50;
    }
}