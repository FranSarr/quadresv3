package com.exercicis.quadresv3.persistence;


import com.exercicis.quadresv3.domain.Picture;
import com.exercicis.quadresv3.domain.Shop;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface HelperPictureRepository extends CrudRepository<Picture, Integer>{
   // @Query("select picture from Picture picture where picture.shop_id = :shop_id")
   List<Picture> findByShop(Shop shop);

    @Transactional // Allos wru¡ite operations
    void removeByShop(Shop shop);

}