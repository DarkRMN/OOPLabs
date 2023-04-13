import Car.*;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Car[] cars;
        cars = new Car[4];

        cars[0] = new Car(1, "Nissan", 1999, 120000, "BO6969AA");
        cars[1] = new Car(2, "Toyota", 1998, 90000, "BO7777AA");
        cars[2] = new SportsCar(3, "McLaren", 2012, 1597000, "BO0804AA", 350, 2);
        cars[3] = new ElectricCar(4, "Tesla", 2022, 91380,"BO3232AA", 100, 648);


        for (Car car : cars){
            System.out.println(car.toString());
        }
    }

    public Main(){

    }
}