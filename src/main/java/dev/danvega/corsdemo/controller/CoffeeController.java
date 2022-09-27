package dev.danvega.corsdemo.controller;

import dev.danvega.corsdemo.model.Coffee;
import dev.danvega.corsdemo.model.Size;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/coffee")
public class CoffeeController {

    private List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeController() {
        coffeeList.add(new Coffee(1, "Caffè Americano", Size.GRANDE));
        coffeeList.add(new Coffee(2, "Caffè Latte", Size.VENTI));
        coffeeList.add(new Coffee(3, "Caffè Caramel Macchiato", Size.TALL));
    }

    @GetMapping
    public List<Coffee> findAll() {
        return coffeeList;
    }

    @DeleteMapping
    public void delete() {
        // delete a coffee
    }

}
