package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {

    public static final GsonBuilder Builder = new GsonBuilder();
    public static final Gson gson = Builder.setPrettyPrinting().create();

    public static void main(String[] args) {

        Driver driver1 = new Driver(45, "Don");
        Driver driver2 = new Driver(25, "Sonya");
        Driver driver3 = new Driver(21, "Erik");

        Driver[] drivers = {driver1, driver2, driver3};
        String allDrivers = gson.toJson(drivers);
        writeDrivers(allDrivers);

        InfoTruck infoTruck1 = new InfoTruck(1, "MAN", driver1, State.ROUTE);
        InfoTruck infoTruck2 = new InfoTruck(2, "HOWO", driver2, State.BASE);
        InfoTruck infoTruck3 = new InfoTruck(3, "RENAULT", driver3, State.REPAIR);


        InfoTruck[] infoTrucks = {infoTruck1, infoTruck2, infoTruck3};

        String allTrucks = gson.toJson(infoTrucks);
        writeInfoTRuck(allTrucks);

        /*------------------------------------------вывод всех грузовиков ---------------------------------*/
        for (InfoTruck info : infoTrucks) {
            info.printTrucks();
        }
        /*------------------------------------------вывод всех грузовиков ---------------------------------*/
        for (Driver driver : drivers) {
            driver.printDrivers();
        }
    }

    /*------------------------------------------статик методы запись в json---------------------------------*/
    private static void writeInfoTRuck(String obj) {
        Path write = Paths.get("./trucks.json");
        try {
            Files.writeString(write,obj, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        }catch (IIOException e) {
            e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeDrivers(String obj) {
        Path write = Paths.get("./drivers.json");
        try {
            Files.writeString(write,obj, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        }catch (IIOException e) {
            e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
