package com.exercicis.quadresv3.persistence;

import com.exercicis.quadresv3.domain.Shop;
import org.springframework.data.repository.CrudRepository;

public interface HelperShopRepository extends CrudRepository<Shop, Integer> {
    public Shop findByName(String name);
}
