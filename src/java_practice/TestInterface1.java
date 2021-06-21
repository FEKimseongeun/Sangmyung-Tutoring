package java;

class shape1{
    protected int x,y;
}

interface Drawble{
    void draw();
}

class Circle2 extends shape1 implements Drawble{
    int radius;

    @Override
    public void draw() {
        System.out.println("Circle Draw");
    }
}

public class TestInterface1 {
    public static void main(String[] args) {
        Drawble obj=new Circle2();
        obj.draw();
    }
}
