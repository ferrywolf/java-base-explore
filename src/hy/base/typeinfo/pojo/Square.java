package hy.base.typeinfo.pojo;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("draw a Square");
    }

    @Override
    public String toString() {
        return "Square";
    }

}
