package java_practice;

import java.awt.Point;
public class Tetrisclass {
    public static void main(String[] args) {
        block1 b1 = new block1(10, 10);
        block2 b2 = new block2(20, 20);
        Block3 b3 = new Block3(-10, -10);
        Rectangle r = new Rectangle(new Point(10, 10));
        Rectangle r2 = new Rectangle(new Point(20, 20),
                new Point(70, 70));
        System.out.println("r");
        System.out.println(r);
        System.out.println("r2");
        System.out.println(r2);
        System.out.println("b");
        System.out.println(b1);
        b1.translate(10, -10);
        System.out.println("b");
        System.out.println(b1);
        System.out.println("b2");
        System.out.println(b2);
        System.out.println("b3");
        System.out.println(b3);

    }
}