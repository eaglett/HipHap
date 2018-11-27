package com.company;

import java.util.ArrayList;
import java.util.*;
import java.text.*;

public class Event {
    private String name;
    private int ID;
    private String type;
    private String location;
    // format for the date and time variables
    private SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy 'at' HH:mm");
    // Date startDate = new Date();
    // Date endDate = new Date();
    private String startDate;
    private String endDate;
    //TODO:change start and end date of the event from strings to Date

    ArrayList<String> partners = new ArrayList<>(); // partners for this particular event
    ArrayList<String> specs = new ArrayList<>();
    //eg: food, dj, photographer, limousine, cocaine, balloons
    // also maybe this should be just one string

    // Constructor
    Event(int ID, String name, String type, String startDate, String endDate){
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Set-ers
    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Get-ers
    public String getName(){
        return this.name;
    }

    public int getID() {
        return this.ID;
    }

    public String getType() {
        return this.type;
    }

    public String getLocation() {
        return this.location;
    }



    // Modifiers
    public void addPartner(String partner) {
        partners.add(partner);
    }
}