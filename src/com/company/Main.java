package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

    public static final GsonBuilder Builder = new GsonBuilder();
    public static final Gson gson = Builder.setPrettyPrinting().create();

    public static void main(String[] args) {

        Driver driver = new Driver(1, "Yryskeldi");
        Driver driver2 = new Driver(2, "Tom");
        Driver driver3 = new Driver(3, "Jerry");

        Driver[] drivers = {driver,driver2, driver3};
        String allDrivers = gson.toJson(drivers);
        writeDrivers(allDrivers);
        System.out.println(allDrivers);

        InfoTruck[] trucks = {
                InfoTruck.showInfo(1,"Хонда", driver, State.BASE),
                InfoTruck.showInfo(2,"MAZ", driver2, State.ROUTE),
                InfoTruck.showInfo(3,"Kamaz", driver3, State.REPAIR),
        };

        String allTrucks = gson.toJson(trucks);
        writeInfoTRuck(allTrucks);
        System.out.println(allTrucks);
    }

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
