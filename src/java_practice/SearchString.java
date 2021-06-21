package java;

public class SearchString {
    public static void main(String[] args) {
        String s="The cat is in the box";
        int index=s.indexOf("box", 19); //**0부터  시작 -> 띄어쓰기 포함해서 문자 하나하나의 순서값을 알아냄
        System.out.println(index);
    }
}
