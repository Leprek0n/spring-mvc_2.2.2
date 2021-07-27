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

    public List<Car> makeFiveCar() {
        return carService.makeFiveCar();
    }

    @GetMapping("/cars")
    public String showCarList(@RequestParam(value = "count", required = false) Integer count, Model model) {

        if (count == null) {
            model.addAttribute("message", makeFiveCar());
        } else {
            switch (count) {
                case 2:
                    model.addAttribute("message", makeFiveCar().get(0) +
                            "\n" +
                            makeFiveCar().get(1));
                    break;
                case 3:
                    model.addAttribute("message",
                            makeFiveCar().get(0) +
                                    "\n" +
                                    makeFiveCar().get(1) +
                                    "\n" +
                                    makeFiveCar().get(2));
                    break;
                case 4:
                    model.addAttribute("message",
                            makeFiveCar().get(0) +
                                    "\n" +
                                    makeFiveCar().get(1) +
                                    "\n" +
                                    makeFiveCar().get(2) +
                                    "\n" +
                                    makeFiveCar().get(3));
                    break;
                default:
                    model.addAttribute("message", makeFiveCar());
            }
        }
        return "car/cars";
    }
}
