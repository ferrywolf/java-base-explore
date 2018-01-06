package hy.base.literal.main;

import java.util.Random;

/**
 * 类字面量的练习  .class文件
 * Java中如何加载.class文件
 *
 * 分为三步：1.加载，2.链接，3.解析
 * 1.加载：JVM中的类加载器读取硬盘中编译的.class文件，并从这些字节码中创建一个Class对象
 * 2.链接:
 *      1) 验证：严重类中的字节码
 *      2) 分配：为静态域分配内存空间
 *      3) 解析：将类中对其他类的符号引用变为真实引用
 *
 */

class Initable {
    //静态成员变量
    static final int staticFinal = 47;//static final 修饰的值是一个编译期常量，不需要初始化类就能调用
    //但是只是将一个域设置为static final形式的不足以保证它为编译期常量，访问这个变量将强行进行初始化。这里的staticFinal2不是编译期常量
    static final int staticFinal2 = LteralDemo.rand.nextInt(1000);
    //静态代码块
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    //静态成员变量
    static int staticNonFinal = 147;
    //静态代码块
    static {
        System.out.println("Initializing Initable2");
    }

}

class Initable3 {
    //静态成员变量
    static int staticNonFinal = 74;
    //静态代码块
    static {
        System.out.println("Initializing Initable3");
    }

}

public class LteralDemo {
    public static Random rand = new Random (47);
    public static void main(String[] args) {
        Class initable = Initable.class;//这个语句并不会引发类的初始化
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        try {
            Class initable3 = Class.forName("Initable3");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Initable3 is not found!!!");
        }
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
        System.out.println("my git test");
    }

}
