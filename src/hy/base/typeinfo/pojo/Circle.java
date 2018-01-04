package hy.base.typeinfo.pojo;

/**
 * 定义基础形状：圆圈
 */
public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("draw a Circle");
    }

    @Override
    public String toString() {
        return "Circle";
    }

}

