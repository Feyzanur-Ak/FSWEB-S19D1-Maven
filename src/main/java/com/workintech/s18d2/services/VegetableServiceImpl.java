package com.workintech.s18d2.services;


import com.workintech.s18d2.repository.VegetableRepository;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableServiceImpl implements  VegetableService {


    private VegetableRepository vegetableRepository;


    @Autowired
    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @Override
    public List<Vegetable> getAllVegetablesAsc() {
        return vegetableRepository.findAllByOrderByPriceAsc();
    }

    @Override
    public List<Vegetable> getAllVegetablesDesc() {
        return vegetableRepository.findAllByOrderByPriceDesc();
    }

    @Override
    public List<Vegetable> getVegetablesByName(String name) {
        return vegetableRepository.findByNameContaining(name);
    }

    @Override
    public Vegetable getVegetableById(Long id) {
        return vegetableRepository.findById(id).orElseThrow(() -> new RuntimeException("Fruit not found"));
    }

    @Override
    public Vegetable saveOrUpdateVegetable(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public void deleteVegetable(Long id) {
           vegetableRepository.deleteById(id);
    }
}
