package fr.uge.poo.amanet.client;

import java.util.Objects;

public class TweeterAdapter implements Message{
    @Override
    public void message(String dest, String message) {
        Objects.requireNonNull(dest);
        Objects.requireNonNull(message);
        Connect.sendTweet(dest, message);
    }
}