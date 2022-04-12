package web.servis;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsService {
    private int counter;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++counter, "Volga", "yellow"));
        cars.add(new Car(++counter, "Pobeda","white"));
        cars.add(new Car(++counter, "Сhayka", "black"));
        cars.add(new Car(++counter, "Lada", "red"));
        cars.add(new Car(++counter, "Moskvich", "blue"));
    }

    public List<Car> getCars(int count) {
        if (count < 5 && count > 0) {
            return cars.subList(0, (count - 1));
        }
        return cars;
    }
}
