package org.example.model;

public class SimpleModel {

    private String material;
    private int width;
    private int height;

    public SimpleModel(){

    }

    public SimpleModel(String material, int width, int height){
        this.material = material;
        this.width = width;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "SimpleModel{" +
                "material='" + material + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
