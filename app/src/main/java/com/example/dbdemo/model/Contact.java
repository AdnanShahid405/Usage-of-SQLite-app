package com.example.dbdemo.model;

public class Contact {
    private int id;
    private String name;
    private String rollnumber;

    public Contact(String name, String rollnumber) {
        this.name = name;
        this.rollnumber = rollnumber;
    }

    public Contact(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.rollnumber = rollnumber;
    }

    public Contact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollnumber;
    }

    public void setRollNumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }
}
