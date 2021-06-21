package java;

class A1{
    public A1(){
        System.out.println("클래스 java.A 생성자");
    }
}
class B1 extends A1{
    public B1(){
        System.out.println("클래스 B 생성자");
    }
}
class C1 extends B1{
    public C1(){
        System.out.println("클래스 C 생성자");
    }
}
public class T0522_test {
    public static void main(String[] args) {
        C1 c=new C1();
    }
}
