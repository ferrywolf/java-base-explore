package hy.base.generic.main;

import hy.base.generic.pojo.FancyToy;
import hy.base.generic.pojo.Toy;

public class GenericToyTest {

    public static void main(String[] args) throws Exception {
        Class<FancyToy> flClass = FancyToy.class;
        FancyToy fancyToy = flClass.newInstance();
        Class<? super FancyToy> up = flClass.getSuperclass();
        //这里不行flclass.getSuperClass()返回的是基类,并且编译器在编译期就知道它是什么类型——Toy.class
        //而不仅仅只是"某个类，它是FancyToy超类"
        //Class<Toy> up2 = flClass.getSuperclass();
        Object obj = up.newInstance();//正因为这种含糊，up.newInstance()返回的不是精确类型，而是Object
    }

}
