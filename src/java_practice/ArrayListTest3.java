package java;

import java.util.ArrayList;

public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Pear");
        list.add("Mango");
        list.add("Banana");
        list.add("Grape");

        int index = list.indexOf("Mango");
        System.out.println("Mango의 위치 : " + index);
    }
}
