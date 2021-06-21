package java;

import java.util.HashSet;

public class setTest {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");

        System.out.println(set);

        if(set.contains("Cheese")){
            System.out.println("치즈 있음");
        }
    }
}
