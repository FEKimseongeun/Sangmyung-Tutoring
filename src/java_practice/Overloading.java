public class Overloading {
    static int sum(int a, int b){
        System.out.println("인자가 둘일 경우 호출됨");
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static double sum(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3,2));
        System.out.println(sum(3,2,8));
        System.out.println(sum(3.5,2.6));
    }
}
