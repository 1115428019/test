package com.example.demo.test;

public class rel_Inf implements inF{
    @Override
    public int add(int a, int b) {
        System.out.println("add is executing now!");
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
