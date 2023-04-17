package Car;

import java.math.BigDecimal;

public class SportsCar extends Car{
    private int topSpeed;
    private int amountOfDoors;
    public SportsCar(int id, String model, int year, BigDecimal price, String regNumber, int topSpeed, int amountOfDoors){
        super(id, model, year, price, regNumber);

        this.topSpeed = topSpeed;
        this.amountOfDoors = amountOfDoors;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }
    public void setAmountOfDoors(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }

    @Override
    public String toString() {
        return "SportsCar{" + "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", regNumber='" + regNumber + '\'' +
                "topSpeed=" + topSpeed +
                ", amountOfDoors=" + amountOfDoors +
                '}';

    }
}