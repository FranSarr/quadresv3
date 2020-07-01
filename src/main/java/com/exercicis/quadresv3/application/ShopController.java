package com.exercicis.quadresv3.application;

import com.exercicis.quadresv3.domain.Picture;
import com.exercicis.quadresv3.domain.Shop;
import com.exercicis.quadresv3.persistence.HelperPictureRepository;
import com.exercicis.quadresv3.persistence.HelperShopRepository;
import com.exercicis.quadresv3.utilities.ShopNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController // This means that this class is a Controller
@RequestMapping(path="")
public class ShopController {

    @Autowired
    private HelperShopRepository helperShopRepository;
    @Autowired
    private HelperPictureRepository helperPictureRepository;

    // Shows the list of shops
    @GetMapping(path="/shops")
    public @ResponseBody
    Iterable<Shop> getAllShops() {
        return helperShopRepository.findAll();
    }

    // Adds one shop to the database
    @PostMapping(path="/shops")
    public Shop newShop(@RequestBody Shop newShop) {
        return helperShopRepository.save(newShop);
    }

    // List all the pictures
    @GetMapping(path="/shops/pictures")
    public @ResponseBody
    Iterable<Picture> getAllPictures() {
        return helperPictureRepository.findAll();
    }

    // List all the pictures of a particular shop
    @GetMapping("/shops/{id}/pictures")
   List<Picture> getPicturesByShop(@PathVariable int id) {
        Shop myShop = helperShopRepository.findById(id);
        if(myShop == null) {
            throw new ShopNotFoundException(id);
        }
     return helperPictureRepository.findByShop(myShop);
   }

    // Create a new picture in a particular shop
    @PostMapping(path="/shops/{id}/pictures")
    public Picture createPicture(@PathVariable int id,@RequestBody Picture newPicture){
        Shop myShop = helperShopRepository.findById(id);
        if(myShop == null) {
            throw new ShopNotFoundException(id);
        }
        newPicture.setShop(myShop);
        newPicture.setDate(new Date());
        return helperPictureRepository.save(newPicture);
    }

    // Delete all pictures from a particular Shop
    @DeleteMapping("/shops/{id}/pictures")
    void deletePictures(@PathVariable int id) {
        Shop myShop = helperShopRepository.findById(id);
        helperPictureRepository.deletePictureByShop(myShop);
        //repository.delete(id);
    }

}
