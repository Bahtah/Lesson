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

        for (InfoTruck info : infoTrucks) {
            if (info.getState() != State.ROUTE && info.getState() != State.REPAIR) {
                info.changeDriver(new Driver(24, "Hardi"));
                info.startDriving(info);
            }else if(info.getState() != State.BASE && info.getState() != State.REPAIR) {
                System.out.println("грузовик " + info.getName() + " в пути ");
            }else if(info.getState() != State.BASE && info.getState() != State.ROUTE){
                System.out.println("Грузовик " + info.getName() + " на ремонте и " + info.getDriver() + " свободен");
            }
        }

        /*----------------------------------------4 этап----------------------------------------------------*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите id грузовика ");
        int value = sc.nextInt();
        for (InfoTruck info : infoTrucks) {
            if (value == info.getId()) {
                System.out.println("Грузовик с " + info);
            }
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
