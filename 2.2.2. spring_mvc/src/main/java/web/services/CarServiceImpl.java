package web.services;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    CarDao carDao = new CarDaoImpl();
    @Override
    public List<Car> makeFiveCar() {
        return carDao.makeFiveCar();
    }
}
