package hy.base.typeinfo.pojo;

/**
 * 定义抽象类型:形状
 */
public abstract class Shape {

    /**
     * 方法：画
     */
    public void draw(){
        System.out.print(this+".draw()\n");
    }
    abstract public String toString();

}
