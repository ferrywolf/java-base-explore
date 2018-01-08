package TypeTools;

import typeinfo.pets.*;

import java.util.HashMap;

public class PetCount {

    //定义计数器集合，因为要通过宠物名称获取宠物的数量，对于这种键值对的关系通过Map集合是最好存储的
    //所以定义一个内部类，继承HashMap
    static class PetCounter extends HashMap<String,Integer>{
        //添加指定类型的数量，如果PetCounter中没有这个类型的数据记载，就将其初始值设置为1，
        // 如果有，就在其原来的数据基础上加一
        public void count(String type){
            Integer quantity = get(type);
            if(quantity == null){
                put(type,1);
            }else{
                put(type,quantity+1);
            }
        }
    }
    //计数函数
    public static void countPets(PetCreator creator){
        PetCounter counter = new PetCounter();
        Pet [] pets = creator.createArray(20);
        for (Pet pet:pets){
            System.out.print(pet.getClass().getSimpleName()+" ");
            if(pet instanceof Pet){
                counter.count("Pet");
            }
            if(pet instanceof Dog){
                counter.count("Dog");
            }
            if(pet instanceof Mutt){
                counter.count("Mutt");
            }
            if(pet instanceof Pug){
                counter.count("pug");
            }
            if(pet instanceof Cat){
                counter.count("Cat");
            }
            if(pet instanceof EgyptianMau){
                counter.count("EgyptianMau");
            }
            if(pet instanceof Manx){
                counter.count("Manx");
            }
            if(pet instanceof  Cymric){
                counter.count("Cymric");
            }
            if(pet instanceof Rodent){
                counter.count("Rodent");
            }
            if(pet instanceof Rat){
                counter.count("Rat");
            }
            if(pet instanceof Mouse){
                counter.count("Mouse");
            }
            if(pet instanceof Hamster){
                counter.count("Hamster");
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }

}
