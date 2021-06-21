package java;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String ,String> list=new HashMap<String,String>();
        list.put("100","홍길동");
        list.put("200","김성은");
        list.put("300","김성운");

        System.out.println(list);
        list.remove("200");
        list.put("100", "김유신");
        System.out.println(list.get("300"));

        for(String key :list.keySet()){
            String value=list.get(key);
            System.out.println("key=" + key+", value= " + value);
        }
    }
}
