package fr.uge.poo.amanet.client;

import java.util.Objects;

public class SMSAdapter implements Message{
    @Override
    public void message(String dest, String message) {
        Objects.requireNonNull(dest);
        Objects.requireNonNull(message);
        Connect.sendSMS(dest, message);
    }
}
