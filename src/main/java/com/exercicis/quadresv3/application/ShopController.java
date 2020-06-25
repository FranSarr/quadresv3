package com.exercicis.quadresv3.application;

import com.exercicis.quadresv3.domain.Picture;
import com.exercicis.quadresv3.domain.Shop;
import com.exercicis.quadresv3.persistence.HelperPictureRepository;
import com.exercicis.quadresv3.persistence.HelperShopRepository;
import com.exercicis.quadresv3.utilities.PictureNotFoundException;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // This means that this class is a Controller
@RequestMapping(path="/shops") //This means URL's start with /shops (after Application path)
public class ShopController {

    @Autowired
    private HelperShopRepository helperShopRepository;
    @Autowired
    private HelperPictureRepository helperPictureRepository;

    // Shows the list of shops
    @GetMapping(path="")
    public @ResponseBody
    Iterable<Shop> getAllShops() {
        return helperShopRepository.findAll();
    }

    // Adds one shop to the database
    @PostMapping(path="")
    public Shop newShop(@RequestBody Shop newShop) {
        return helperShopRepository.save(newShop);
    }

    // List all the pictures
    @GetMapping(path="/pictures")
    public @ResponseBody
    Iterable<Picture> getAllPictures() {
        return helperPictureRepository.findAll();
    }

    // List all the pictures of a particular shop
    @GetMapping("{id}/pictures")
   List<Picture> getPicturesByShop(@PathVariable int id) {
        Shop myShop = helperShopRepository.findById(id);
    //    System.out.println(id +"   "+myShop.toString());
     return helperPictureRepository.findByShop(myShop);
   }
   //     return helperPictureRepository.findAllByShopId(id);
            //    .orElseThrow(() -> new PictureNotFoundException(id));
    //}

}
