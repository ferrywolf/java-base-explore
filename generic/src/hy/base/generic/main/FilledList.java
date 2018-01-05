package hy.base.generic.main;

import java.util.ArrayList;
import java.util.List;

class CountInteger {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}

public class FilledList<T> {

    private Class<T> type;
    public FilledList(Class<T> type){
        this.type = type;
    }
    public List<T> create(int nElement){
        List<T> result = new ArrayList<T>();

        try {
            for(int i=0; i<nElement; i++){
                result.add(type.newInstance());//但是用newInstance创建Class对象的实例时，这个类必须有默认构造函数
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        FilledList<CountInteger> countList = new FilledList<CountInteger>(CountInteger.class);
        System.out.println(countList.create(15));
    }
}
