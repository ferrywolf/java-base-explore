package hy.base.typeinfo.pojo;


public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("draw a Triangle");
    }

    @Override
    public String toString() {
        return "Triangle";
    }

}
