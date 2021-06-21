package java_practice;

import java.util.ArrayList;
class Person{
    String name;
    String tel;

    public Person(String name, String tel){
        this.name=name;
        this.tel=tel;
    }
}


public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Person> list=new ArrayList<Person>();
        list.add(new Person("김성은", "010-0000-0000"));
        list.add(new Person("김성은", "010-0000-0000"));

        /*System.out.println("이름.");
        int index= (int) (Math.random()*list.size());
        System.out.println("이름은 " +list.get(index));*/

        for(Person obj : list){
            System.out.println(obj.name + "    " + obj.tel);
        }
    }

}
