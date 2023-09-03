package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;



@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    
    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        if (count == null) {
            model.addAttribute("cars",carService.getCar(0));
            return "cars";
        } else {
            model.addAttribute("cars", carService.getCar(Integer.parseInt(count)));
            return "cars";
        }
    }
}