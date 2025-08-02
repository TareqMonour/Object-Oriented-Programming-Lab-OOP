package com.mycompany.tareq.mid;

public class Contact {
    String name, email, phoneNumber;

    public boolean createNewContact(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        return true;
    }

    public boolean addToExisting(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        return true;
    }


    public boolean deleteContact(String name, String phoneNumber){
        this.name = null;
        this.phoneNumber = null;
        return true;
    }

    public void displayContactInfo(String name){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Phone number: "+phoneNumber);
    }


}
