package hy.base.typeinfo.main;

interface HasBatteries {}
interface Waterproof {}
interface ShootsThings {}

class Toy {
        Toy(){}
        Toy(int i){}
}

class FancyToy extends Toy
        implements HasBatteries,Waterproof {
    FancyToy(){super(1);}
}

public class ToyTest {

    static void printInfo(Class cc){
        print("class name"+cc.getName()+" i s interface?["+cc.isInterface()+"]");
        print("Simple name: "+cc.getSimpleName());
        print("Canonical name: "+cc.getCanonicalName());
    }
    private static void print(Object o){
        System.out.println(o);
    }

    //ctrl+j：快速代码
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("hy.base.typeinfo.main.FancyToy");
        } catch (ClassNotFoundException e) {
            print("Can't find FancyToy");
            e.printStackTrace();
            System.exit(1);
        }
        printInfo(c);
        for (Class face:c.getInterfaces()){
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;

        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            print("Can not instaniate");
            e.printStackTrace();
            System.exit(1);

        } catch (IllegalAccessException e) {
            print("Can not access");
            e.printStackTrace();
            System.exit(1);

        }
        printInfo(obj.getClass());
        print("提交测试");
    }

}
