package com.example.demo.dao;

public class UserDao {
    private String name;
    private String title;
    private String empty;
    private String cdata="未被覆盖";
    private String wide;
//    public UserDao(String name,String title){
//        this.name=name;
//        this.title=title;
//    }
    public void addUser(){
        System.out.println("dao.addUsers");
    }
    public void setName(String name){
        this.name=name;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setEmpty(String empty){
        this.empty=empty;
    }
    public void setCdata(String cdata){
        this.cdata=cdata;
    }
    public void setWide(String wide){
        this.wide=wide;
    }
    public void show(){
       System.out.println(name+"::"+title+"::"+empty+"::"+cdata);
//        System.out.println(name+"::"+title+"::"+cdata);
//        System.out.println(name+"::"+title+"::"+empty);
    }
    public void update(){
        System.out.println("call successfully!");
    }
    public void wide_Bean(){
        System.out.println(wide);
    }
}
