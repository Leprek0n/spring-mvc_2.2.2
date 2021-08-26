package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getCars(int count) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Mercedes", "0"));
        cars.add(new Car("BMW", "1"));
        cars.add(new Car("Audy", "2"));
        cars.add(new Car("Mazda", "3"));
        cars.add(new Car("Toyota", "4"));

        while (count < cars.size()) {
            cars.remove(cars.size() - 1);
        }
        return cars;
    }
}
