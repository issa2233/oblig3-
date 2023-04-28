package com.example.oblig3cinematickets;

public class Tickets {

    private String movies;
    private String firstName;
    private String lastName;
    private String number;
    private String email;
    private String amount;

    public Tickets(String movies, String firstName, String lastName, String phoneNumber, String email, String amount){
        this.movies = movies;
        this.firstName = firstName;
        this.lastName = lastName;
        this.number= phoneNumber;
        this.email = email;
        this.amount = amount;
    }

    public Tickets(){ }


    public String getMovies(){
        return movies;
    }

    public void setMovies(String movies){
        this.movies = movies;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public String getPhoneNumber(){
        return number;
    }

    public void setPhoneNumber (String phoneNumber){
        this.number = phoneNumber;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail (String email){
        this.email = email;
    }
    public String getAmount(){
        return amount;
    }

    public void setAmount (String amount){
        this.amount = amount;
    }
}


