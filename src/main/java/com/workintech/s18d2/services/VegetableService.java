package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Vegetable;

import java.util.List;

public interface  VegetableService {

    List<Vegetable> getAllVegetablesAsc();
    List<Vegetable> getAllVegetablesDesc();
    List<Vegetable> getVegetablesByName(String name);
    Vegetable getVegetableById(Long id);
    Vegetable saveOrUpdateVegetable(Vegetable vegetable);
    void deleteVegetable(Long id);
}
