package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> makeFiveCar() {
        Car car1 = new Car("Blue", "Mercedes", 1);
        Car car2 = new Car("Red", "BMW", 2);
        Car car3 = new Car("Green", "Audi", 3);
        Car car4 = new Car("White", "Ferrari", 4);
        Car car5 = new Car("Black", "Mazda", 5);
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        return carList;
    }
}
