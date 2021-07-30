package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarService;
import web.services.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    CarService carService = new CarServiceImpl();

    public List<Car> makeFiveCar(int size) {
        return carService.makeFiveCar(size);
    }

    @GetMapping("/cars")
    public String showCarList(@RequestParam(value = "count", required = false) Integer count, Model model) {

        if (count == null) {
            model.addAttribute("message", makeFiveCar(5));
        } else {
            model.addAttribute("message", makeFiveCar(count));
        }
        return "car/cars";
    }
}
