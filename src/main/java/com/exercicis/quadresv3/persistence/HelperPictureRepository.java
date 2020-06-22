package com.exercicis.quadresv3.persistence;


import com.exercicis.quadresv3.domain.Picture;
import com.exercicis.quadresv3.domain.Shop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface HelperPictureRepository extends CrudRepository<Picture, Integer> {
    List<Picture> findAllByShop(Shop shop);

    @Transactional
    void removeByShop(Shop shop);

}