package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servis.CarsService;


@Controller
@RequestMapping()
public class CarsController {

    @Autowired
    private CarsService carsService;

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam("count") int count, ModelMap model) {
        model.addAttribute("cars", carsService.getCars(count));
        return "cars";
    }
}
