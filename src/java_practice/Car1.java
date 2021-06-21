package java_practice;

public class Car1 {
    protected int speed;// 속도
    Car1(){

    }
    public void setSpeed(int speed){  // 스피드를 다시 설정
        this.speed=speed;
    }
}

class SportsCar extends Car1{
    boolean turbo;
    SportsCar(){

    }
    public void setTurbo(boolean flag){
        turbo=flag;
    }
}

class SportsCarTest{
    public static void main(String[] args) {
        SportsCar obj= new SportsCar();
        obj.speed=10;
        obj.setSpeed(60);
        obj.setTurbo(true);
    }
}


