/*import java.util.Scanner;

public class Java_main { //main class
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("총 횟수: " + n);
        DiceProbability dp=new DiceProbability(n);
        dp.calcProbability();
        dp.printProbability();
    }
}

class DiceProbability {
    int n;
    int[] a;
    double[] b=new double[6];
    int[] count={0,0,0,0,0,0};
    Dice d = new Dice();

    DiceProbability(int num){
        n=num;
        a=new int[num];
    }

    void calcProbability(){
        for(int i=0; i<n; i++){
            a[i]=d.roll();
            for(int j=0; j<6; j++){
                if(a[i] == j+1)
                    count[j]++;
            }
        }

        for(int i=0;i<6;i++) {
            b[i] = (float) count[i] / n;
            b[i]=Math.round(b[i]*10000.0);
            b[i]=b[i]/10000.0;

        }
    }

    void printProbability(){
        for(int i=1; i<=6; i++){
            System.out.println("주사위 " + i +": " + count[i-1] + "번 비율: " + b[i-1]);
        }
    }
}

class Dice {
    int roll(){
        return (int)Math.floor(Math.random()*6)+1; //주사위 6번
    }
}*/
