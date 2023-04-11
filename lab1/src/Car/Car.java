package Car;

import java.util.Scanner;

public class Car {

    private int id;
    private String model;
    private int year;
    private double price;
    private String regNumber;

    public Car(int id, String model, int year, double price, String regNumber){
        this.id = id;
        this.model = model;
        this.year = year;
        this.price = price;
        this.regNumber = regNumber;
    }

    public Car(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car id:");
        id = scanner.nextInt();

        System.out.println("Enter car model:");
        model = scanner.next();

        System.out.println("Enter car year:");
        year = scanner.nextInt();

        System.out.println("Enter car price:");
        price = scanner.nextDouble();

        System.out.println("Enter car register number:");
        regNumber = scanner.next();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }
}


