package com.workintech.s18d2.repository;



import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VegetableRepository extends JpaRepository<Vegetable,Long> {
    List<Vegetable> findAllByOrderByPriceDesc();
    List<Vegetable> findAllByOrderByPriceAsc();
    List<Vegetable> findByNameContaining(String name);
}
