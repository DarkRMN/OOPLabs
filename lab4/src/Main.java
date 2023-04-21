import Car.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {
        Car[] cars;
        cars = new Car[4];

        cars[0] = new Car(1, "Nissan", 1999, BigDecimal.valueOf(120000), "BO6969AA");
        cars[1] = new Car(2, "Toyota", 1998, BigDecimal.valueOf(90000), "BO7777AA");
        cars[2] = new Car(3, "McLaren", 2012, BigDecimal.valueOf(1597000), "BO0804AA");
        cars[3] = new Car(4, "Tesla", 2022, BigDecimal.valueOf(91380),"BO3232AA");

        Arrays.sort(cars, new CarComparatorByYear());
        for (Car car : cars){
            System.out.println(car.toString());
        }

        System.out.println("");

        Arrays.sort(cars);
        for (Car car : cars){
            System.out.println(car.toString());
        }

    }

    public Main(){

    }
}
