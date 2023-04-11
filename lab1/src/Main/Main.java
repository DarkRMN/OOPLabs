package Main;
import Car.Car;

import java.util.Scanner;

public class Main {
    private Car[] cars;

    public static void main(String[] args) {
        Main main = new Main();


        main.showModel();
        main.showYear();
        main.showPrice();
    }

    public Main(){
        cars = new Car[2];

        cars[0] = new Car(1, "Nissan", 1999, 11, "BO6969AA");
        cars[1] = new Car();
    }

    public void showModel(){
        System.out.println("-------------------------------------------");
        System.out.println("Enter car model:");
        Scanner scanner = new Scanner(System.in);
        String carModel = scanner.nextLine();
        for(Car item : cars){
            if (item.getModel().equals(carModel))
                System.out.printf(item.toString());

        }
    }

    public void showYear(){
        System.out.println("-------------------------------------------");
        System.out.println("Enter car production year:");
        Scanner scanner = new Scanner(System.in);
        int carYear = scanner.nextInt();
        for (Car item: cars){
            if (item.getYear() < carYear)
                System.out.println(item.toString());
        }
    }

    public void showPrice(){
        System.out.println("-------------------------------------------");
        System.out.println("Enter price of the car:");
        Scanner scanner = new Scanner(System.in);
        double carPrice = scanner.nextDouble();
        for (Car item: cars){
            if (item.getPrice() < carPrice)
                System.out.println(item.toString());
        }
    }
}