package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> makeFiveCar(int size) {
        String[] models = {"Mercedes", "BMW", "Audi", "Ferrari", "Mazda"};
        String[] color = {"Blue", "Red", "Green", "White", "Black"};
        List<Car> carList = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, models.length);
            Car car = new Car(color[randomNum], models[randomNum], randomNum);
            carList.add(new Car(color[randomNum], models[randomNum], randomNum));
        }
//        Car car1 = new Car("Blue", "Mercedes", 1);
//        Car car2 = new Car("Red", "BMW", 2);
//        Car car3 = new Car("Green", "Audi", 3);
//        Car car4 = new Car("White", "Ferrari", 4);
//        Car car5 = new Car("Black", "Mazda", 5);
//        List<Car> carList = new ArrayList<>();
//        carList.add(car1);
//        carList.add(car2);
//        carList.add(car3);
//        carList.add(car4);
//        carList.add(car5);

        return carList;
    }
}
