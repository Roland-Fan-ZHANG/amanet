package fr.uge.poo.amanet.client;

import java.util.Objects;

public class MailAdapter implements Message{
    @Override
    public void message(String dest, String message) {
        Objects.requireNonNull(dest);
        Objects.requireNonNull(message);
        Connect.sendMail(dest, "Nofication from AmaNet", message);
    }
}