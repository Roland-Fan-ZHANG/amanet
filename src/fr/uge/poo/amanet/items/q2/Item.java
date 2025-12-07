package fr.uge.poo.amanet.items.q2;

public sealed interface Item permits BluRay, Dvd, VideoGame {
    String getShortDescription();
    String getLongDescription();
    int price();
}