package java_practice;

class Circle{

    class Point1{
        int x,y;

        public Point1(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    int radius;
    Point1 center;

    public Circle(int radius, int x, int y){
        this.radius=radius;
        this.center=new Point1(x,y);
    }

    double calArea(){
        Point1 r=new Point1(5,5);
        return 3.14*radius*radius;
    }
}
public class InnerTest {
    public static void main(String[] args) {
        Circle obj=new Circle(10,0,0);
        System.out.println("원의 면적 = " + obj.calArea());
    }
}
