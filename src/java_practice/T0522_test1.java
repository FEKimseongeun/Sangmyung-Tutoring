package java;

class Student_t{
    public void eat(){
        System.out.println("밥먹기");
    }
    public void say(){
        System.out.println("선생님 안녕하세요.");
    }
}

class Leader extends Student_t {
    public void say(){
        System.out.println("선생님께 인사");
    }
}

public class T0522_test1 {
    public static void main(String[] args) {
        Leader leader1=new Leader();
        leader1.eat();
        leader1.say();
    }
}
// 밥먹기
//선생님께인사