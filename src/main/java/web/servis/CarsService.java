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
        cars.add(new Car(++counter, "Chayka", "black"));
        cars.add(new Car(++counter, "Lada", "red"));
        cars.add(new Car(++counter, "Moskvich", "blue"));
    }

    public List<Car> getCars(String count) {
        if (count != null && Integer.parseInt(count) < 5 && Integer.parseInt(count) > 0) {
            return cars.subList(0, (Integer.parseInt(count) ));
        }
        return cars;
    }
}
