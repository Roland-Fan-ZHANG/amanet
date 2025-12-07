package fr.uge.poo.amanet.items.q1;

public record Product(String title, int releaseDate) {
    @Override
    public String toString(){
        return title + " (" + releaseDate + ")";
    }
}