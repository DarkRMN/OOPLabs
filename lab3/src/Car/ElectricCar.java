package Car;

public class ElectricCar extends Car{
    private int batteryCapacity;
    private int mileage;
    public ElectricCar (int id, String model, int year, double price, String regNumber, int batteryCapacity, int mileage){
        super(id, model, year, price, regNumber);

        this.batteryCapacity = batteryCapacity;
        this.mileage = mileage;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "ElectricCar{" + "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", regNumber='" + regNumber + '\'' +
                "batteryCapacity=" + batteryCapacity +
                ", mileage=" + mileage +
                '}';
    }
}
