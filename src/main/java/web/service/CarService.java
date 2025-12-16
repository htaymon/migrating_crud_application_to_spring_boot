package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Model S", "Tesla", 2022));
        cars.add(new Car("Civic", "Honda", 2021));
        cars.add(new Car("Corolla", "Toyota", 2020));
        cars.add(new Car("Mustang", "Ford", 2019));
        cars.add(new Car("A4", "Audi", 2018));
    }

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

    public List<Car> getAllCars() {
        return cars;
    }

}
