package fr.uge.poo.amanet.client;

import java.util.Objects;

public record Client(String firstName, String lastName, Country country, String twitterId, String phoneNumber, String email) {
    public static class ClientBuilder {
         private String firstName;
         private String lastName;
         private Country country;
         private String twitterId;
         private String phoneNumber;
         private String email;

         public ClientBuilder firstName(String firstName){
             this.firstName = Objects.requireNonNull(firstName);
             return this;
         }
         public ClientBuilder lastName(String lastName){
             this.lastName = Objects.requireNonNull(lastName);
             return this;
         }
         public ClientBuilder country(Country country){
             this.country = Objects.requireNonNull(country);
             return this;
         }
         public ClientBuilder twitterId(String twitterId){
             this.twitterId = Objects.requireNonNull(twitterId);
             return this;
         }
         public ClientBuilder phoneNumber(String phoneNumber){
             this.phoneNumber = Objects.requireNonNull(phoneNumber);
             return this;
         }
         public ClientBuilder email(String email){
             this.email = Objects.requireNonNull(email);
             return this;
         }
         public Client build(){
             if(twitterId == null && phoneNumber == null && email == null){
                 throw new IllegalStateException();
             }
             if(firstName == null || lastName == null || country == null){
                 throw new IllegalStateException();
             }
             return new Client(firstName, lastName, country, twitterId, phoneNumber, email);
         }
     }
     public void message(String msg){

     }
}
