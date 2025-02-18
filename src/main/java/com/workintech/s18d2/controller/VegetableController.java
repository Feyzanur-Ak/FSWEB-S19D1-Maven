package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.services.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/workintech/vegetables")
public class VegetableController {

    private VegetableService vegetableService;


    @Autowired
    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }


    @GetMapping
    public ResponseEntity<List<Vegetable>> getAllVegetablesAsc() {
        return ResponseEntity.ok(vegetableService.getAllVegetablesAsc());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vegetable> getVegetableById(@PathVariable Long id) {
        return ResponseEntity.ok(vegetableService.getVegetableById(id));
    }

    @GetMapping("/desc")
    public ResponseEntity<List<Vegetable>> getAllFruitsDesc() {
        return ResponseEntity.ok(vegetableService.getAllVegetablesDesc());
    }

    @PostMapping
    public ResponseEntity<Vegetable> saveOrUpdateFruit(@RequestBody Vegetable vegetable) {
        return ResponseEntity.ok(vegetableService.saveOrUpdateVegetable(vegetable));
    }

    @PostMapping("/{name}")
    public ResponseEntity<List<Vegetable>> getFruitsByName(@PathVariable String name) {
        return ResponseEntity.ok(vegetableService.getVegetablesByName(name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVegetable(@PathVariable Long id) {
        vegetableService.deleteVegetable(id);
        return ResponseEntity.ok("Vegetable deleted successfully");
    }

}
