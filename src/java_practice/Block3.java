package java_practice;

import java.awt.Point;

class Block3 {
    private int H = Rectangle.HEIGHT;
    private int W = Rectangle.WIDTH;

    Rectangle[] rectangles = new Rectangle[4];

    private Block3(Point p) {
        rectangles[0] = new Rectangle(p);
        p.translate(0, H);
        rectangles[1] = new Rectangle(p);
        p.translate(W, 0);
        rectangles[2] = new Rectangle(p);
        p.translate(W, 0);
        rectangles[3] = new Rectangle(p);
    }

    public Block3(int x, int y) {
        Point a = new Point(x, y);
        rectangles[0] = new Rectangle(a);
        Point b = new Point(x, y + H);
        rectangles[1] = new Rectangle(b);
        Point c = new Point(x + W, y + H);
        rectangles[2] = new Rectangle(c);
        Point d = new Point(x + (2 * W), y + H);
        rectangles[3] = new Rectangle(d);
    }

    public void translate(int x, int y) {
        rectangles[0].translate(x, y);
        rectangles[1].translate(x, y);
        rectangles[2].translate(x, y);
        rectangles[3].translate(x, y);
    }

    public String toString() {
        return "UL: " + rectangles[0].getUpperLeft() + ", LR: " + rectangles[0].getLowerRight() + "\n"
                + "UL: " + rectangles[1].getUpperLeft() + ", LR: " + rectangles[1].getLowerRight() + "\n"
                + "UL: " + rectangles[2].getUpperLeft() + ", LR: " + rectangles[2].getLowerRight() + "\n"
                + "UL: " + rectangles[3].getUpperLeft() + ", LR: " + rectangles[3].getLowerRight();
    }
}
