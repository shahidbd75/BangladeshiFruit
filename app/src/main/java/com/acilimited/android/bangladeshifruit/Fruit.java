package com.acilimited.android.bangladeshifruit;

public class Fruit {
    private int id;
    private String name;
    private String desciption;
    private int imageId;

    public Fruit(int id,String name,String description,int imageId){
        this.id=id;
        this.name=name;
        this.desciption = description;
        this.imageId =imageId;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
