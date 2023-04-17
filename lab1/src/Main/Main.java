package Main;

import Car.Car;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    private final Car[] cars;

    public static void main(String[] args) {
        Main main = new Main();

        main.filterByModel();
        main.filterByYear();
        main.filterByPrice();
    }

    public Main() {
        cars = new Car[2];

        cars[0] = new Car(1, "Nissan", 1999, BigDecimal.valueOf(11), "BO6969AA");
        cars[1] = new Car();
    }

    public void filterByModel() {
        System.out.println("-------------------------------------------");
        System.out.println("Enter car model:");
        Scanner scanner = new Scanner(System.in);
        String carModel = scanner.nextLine();
        filterByModel(carModel);
    }

    public void filterByModel(String carModel) {
        for (Car item : cars) {
            if (item.getModel().equals(carModel))
                System.out.printf(item.toString());
        }
    }

    public void filterByYear() {
        System.out.println("-------------------------------------------");
        System.out.println("Enter car production year:");
        Scanner scanner = new Scanner(System.in);
        int carYear = scanner.nextInt();
        scanner.nextLine();
        filterByYear(carYear);
    }

    private void filterByYear(int carYear) {
        for (Car item : cars) {
            if (item.getYear() > carYear)
                System.out.println(item);
        }
    }

    public void filterByPrice() {
        System.out.println("-------------------------------------------");
        System.out.println("Enter price of the car:");
        Scanner scanner = new Scanner(System.in);
        double carPrice = scanner.nextDouble();
        filterByPrice(BigDecimal.valueOf(carPrice));
    }

    private void filterByPrice(BigDecimal carPrice) {
        for (Car item : cars) {
            if (item.getPrice().compareTo(carPrice) < 0)
                System.out.println(item);
        }
    }
}