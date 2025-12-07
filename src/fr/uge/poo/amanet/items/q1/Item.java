package fr.uge.poo.amanet.items.q1;

public sealed interface Item permits BluRay, Dvd, VideoGame {
    String getShortDescription();
    String getLongDescription();
}