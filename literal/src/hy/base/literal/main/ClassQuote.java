package hy.base.literal.main;

/**
 * 泛化的class引用
 */
public class ClassQuote {

    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> IntClass = int.class;
        IntClass = Integer.class;
        intClass = double.class;//普通类型的引用可以重新赋值指向任何的其他的Class对象
        //IntClass = double.class; 这句话存在问题，因为IntClass使用了泛型语法，在编译时期会强制执行额外的类型检测
        //换一种思路
        //Class<Number> numclass = int.class;这句话也存在问题，因为这里Integer Class对象不是Number Class对象的子类

        //再换一种思路 Class<?>,通过"?"来实现
        Class<?> numClass = int.class;
        numClass = double.class;//Class<?>优于平凡的Class,好处在于你并不是疏忽，而是使用了一个非具体的类引用

        //为了创建一个Class引用,它被限定了某种类型，或该类型的任何子类型，这是需要将通配符与extends结合，创建一个范围
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
//        bounded = boolean.class;这里是行不通的

    }

}
