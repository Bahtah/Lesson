package com.company;

public class Driver {

    private int id;
    private String name;

    public Driver(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Driver() {
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

    public void printDrivers() {
        System.out.println("--------------------Driver---------------------"+'\n'+
                "#|"+ " Name " + "| ID " + '\n' +
                "-+-----------------+-----------+---------------"+'\n'
                + getName() +   "|" + getId() + "\n");
    }

    @Override
    public String toString() {
        return " имя: " + name;
    }
}
