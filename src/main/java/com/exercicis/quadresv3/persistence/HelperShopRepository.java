package com.exercicis.quadresv3.persistence;

import com.exercicis.quadresv3.domain.Shop;
import javassist.NotFoundException;
import org.springframework.data.repository.CrudRepository;

public interface HelperShopRepository extends CrudRepository<Shop, Integer> {
    Shop findById(int id);

    //public Shop getShopById(int shopId) {
    //    return repository.findById(shopId).get();
    //}
}
