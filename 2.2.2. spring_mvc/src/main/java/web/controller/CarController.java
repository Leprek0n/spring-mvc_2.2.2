package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String showCarList(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if(count == null) {
            count = 5;
        }
        List<Car> cars = carService.makeFiveCar(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
