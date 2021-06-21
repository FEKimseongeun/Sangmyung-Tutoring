package java_practice;

import java.awt.Point;

class Rectangle {
    static final int WIDTH =50;
    static final int HEIGHT =50;
    private Point upperLeft = new Point(0,0);
    private Point lowerRight = new Point(0,0);

    public Rectangle(Point uL){ // uL=java.awt.Point[x=10,y=10]

        this.upperLeft = uL; // upperLeft =java.awt.Point[x=10,y=10]
        this.lowerRight = new Point(upperLeft.x+WIDTH,upperLeft.y+HEIGHT);
    }
    public Rectangle(Point uL,Point lR){
        this.upperLeft = uL;
        this.lowerRight = lR;

        //Point라는 라이브러리를 출력하게되면 java.awt.Point[x=upperLeft,y=lowerRight]
        //Point p=new Point(upperLeft,lowerRight);
    }
    public void translate(int x,int y){ //p.translate(10, 10); // 상대적으로 위치 이동
        upperLeft.translate(x, y);
        lowerRight.translate(x, y);
    }
    public String toString(){
        return ("UL: " + upperLeft + ", LR: " + lowerRight);
    }

    Point getUpperLeft(){
        return upperLeft;
    }

    Point getLowerRight(){
        return lowerRight;
    }
}
