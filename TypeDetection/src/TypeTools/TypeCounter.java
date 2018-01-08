package TypeTools;

import java.util.LinkedHashMap;
import java.util.Map;

public class TypeCounter extends LinkedHashMap<Class<?>,Integer>{
    private Class<?> baseType;
    TypeCounter (Class<?> baseType){
        this.baseType = baseType;
    }
    public void count(Object obj){
        Class type = obj.getClass();
        // Class1.isAssignableFrom(Class2):表示class1是否是class2的类型，或者是class1是否class2的超类或超接口
        if(!baseType.isAssignableFrom(type)){
            throw new RuntimeException(obj+"incorrect type:"+type
            +",should be type or subtype of "+baseType);
        }
        countClass(type);
    }
    //对类进行计数
    private void  countClass(Class<?> type){
        put(type,get(type) == null?1:get(type)+1);
        Class<?> superClass = type.getSuperclass();
        if(superClass !=null && baseType.isAssignableFrom(superClass))
            countClass(superClass);
    }

    //覆盖toString方法
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Class<?>,Integer> pair:entrySet()){
            result.append(pair.getKey().getSimpleName());
            result.append("=");
            result.append(pair.getValue());
            result.append(",");
        }
        result.delete(result.length()-2,result.length());
        result.append("}");
        return result.toString();
    }
}
