package hy.base.typeinfo.main;

import hy.base.typeinfo.pojo.Circle;
import hy.base.typeinfo.pojo.Shape;
import hy.base.typeinfo.pojo.Square;
import hy.base.typeinfo.pojo.Triangle;

import java.util.Arrays;
import java.util.List;
//alt+enter：快速导入包，光标放前面
public class Demo {

    public static void main(String[] args) {

        List<Shape> shapeList = Arrays.asList(
                    new Circle(),new Square(),new Triangle()
                );
        for (Shape shape:shapeList){
            shape.draw();
        }
    }

}
