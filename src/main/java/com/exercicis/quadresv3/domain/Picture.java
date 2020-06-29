package com.exercicis.quadresv3.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity(name="Picture")
public class Picture {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name="id_pic")
    private Integer id;
    private String name;
    private String author;
    private Float price;

    @JoinColumn(name ="shop_id", nullable = false)
    @ManyToOne(targetEntity = Shop.class)
    private Shop shop;

    private Date date;

    public Picture() {
    }

    public Picture(String name, String author, Float price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.date = new Date();
    }

    public Picture(String name, String author, Float price, Shop shop) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.shop = shop;
        this.date = new Date();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public Float getPrice() { return price; }
    public void setPrice(Float price) {
        this.price = price;
    }


    public Shop getShop() {
        return shop;
    }
    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

}
