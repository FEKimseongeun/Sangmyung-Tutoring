package java_practice;

public class InstanceV {
    public static void main(String[] args) {
        Area.manual();
        //Area.triangle();
        //Area.rectangle();

        Area ar=new Area();
        ar.manual();
        System.out.println(ar.triangle(3,5));
        System.out.println(ar.rectangle(3,4));

    }
}

class Area{
    static void manual(){  //클래스 메서드
        System.out.println("현재 사용 사능한 함수 목록");
        System.out.println("triangle : 삼각형의; 넓이");
        System.out.println("rectangle: 사각형의 넓이");
        System.out.println("입니다.");
    }

    double triangle(int a, int b){ //인스턴스 메서드
        return (double)a*b/2;
    }

    int rectangle(int a, int b) {//인스턴스 메서드
        return a * b;
    }
}