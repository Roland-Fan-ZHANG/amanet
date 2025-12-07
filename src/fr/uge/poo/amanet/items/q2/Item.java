package fr.uge.poo.amanet.items.q2;

public sealed interface Item permits BluRay, Dvd, VideoGame {
    default String getShortDescription(){
        return product().toString();
    }
    String getLongDescription();
    Product product();
    int price();
}