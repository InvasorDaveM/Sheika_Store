package com.project.sheikah_store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reference;

    @Column(name = "name_game", nullable = false)
    private String name;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "description_game", nullable = false)
    private String description;

    @Column(name = "image_path", nullable = false)
    private String imagePath;

    @Column(name = "producer", nullable = false)
    private String producer;

    public Game() {
    }

    public Game(String name, String category, double price, String description, String imagePath, String producer) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.imagePath = imagePath;
        this.producer = producer;
    }

    public Integer getReference() {
        return reference;
    }

    public void setReference(Integer reference) {
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Game [name=" + name + ", category=" + category + ", price=" + price + ", description=" + description
                + ", imagePath=" + imagePath + ", producer=" + producer + "]";
    }

}
