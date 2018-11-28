package com.company.users;

import java.util.ArrayList;

public class Employee {
    private ArrayList<Integer> eventIDs;
    private int ID;
    private String name;
    private String password;
    private String email;

    // Constructor
    public Employee(int ID, ArrayList<Integer> ids, String name, String pass, String email) {
        this.ID = ID;
        this.eventIDs = new ArrayList<>(ids);
        this.name = name;
        this.password = pass;
        this.email = email;
    }

    // Getters

    /**
     * get Employee id
     * @return id (int) of Employee
     */
    public int getID() {
        return ID;
    }

    /**
     * get Employee Event IDs
     * @return eventIDs (ArrayList<Integer>) of Employee
     */
    public ArrayList<Integer> getEventIDs() {
        return eventIDs;
    }

    /**
     * get Employee name
     * @return name (String) of Employee
     */
    public String getName() {
        return name;
    }

    /**
     * get Employee password
     * @return password (String) of Employee
     */
    public String getPassword() {
        return password;
    }

    /**
     * get Employee email address
     * @return email (String) of Employee
     */
    public String getEmail() {
        return email;
    }
}
