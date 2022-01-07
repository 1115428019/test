package com.example.demo.model;

import lombok.Data;

@Data
public class TestModel {
    private long id;
    private int weight;
    private int height;
    private String name;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "TestModel{" +
                "id=" + id +
                ", weight=" + weight +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
