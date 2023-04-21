package Car;

import java.util.Comparator;

public class CarComparatorByYear implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return c1.getRegNumber().compareTo(c2.getRegNumber());
    }
}

