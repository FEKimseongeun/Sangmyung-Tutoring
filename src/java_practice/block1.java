package java_practice;

import java.awt.Point;

class block1 {
    static final int WIDTH = 50;
    static final int HEIGHT = 50;

    private Rectangle[] rectangles = new Rectangle[4];


    public block1(Point p) {
        rectangles[0] = new Rectangle(p);
        p.translate(WIDTH, 0);
        rectangles[1] = new Rectangle(p);
        p.translate(0, HEIGHT);
        rectangles[2] = new Rectangle(p);
        p.translate(WIDTH, HEIGHT);
        rectangles[3] = new Rectangle(p);
    }

    block1(int x, int y) {
       // Point a = new Point(x, y);
        rectangles[0] = new Rectangle(new Point(x, y));
       // Point b = new Point(x + WIDTH, y);
        rectangles[1] = new Rectangle(new Point(x + WIDTH, y));
       // Point c = new Point(x, y + HEIGHT);
        rectangles[2] = new Rectangle(new Point(x, y + HEIGHT));
       // Point d = new Point(x + WIDTH, y + HEIGHT);
        rectangles[3] = new Rectangle( new Point(x + WIDTH, y + HEIGHT));
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

