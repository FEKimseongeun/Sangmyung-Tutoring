package java;

class Dice {
    int roll() {
        return (int)Math.floor(Math.random()*6)+1;
    }
}

class DiceProbability {
    int n; //던질 총 횟수
    int[] a;
    double[] b=new double[6];
    int count[]= {0,0,0,0,0,0};
    Dice d=new Dice();

    DiceProbability(int num){ //생성자
        n=num;
        a=new int[num];
    }

    void calcProbability(){
        //1~6 값이 나올 수 있는 확률을 구해서
        for(int i=0; i<n; i++){ // n 내가 입력한 던질 횟수만큼 주사위를 던진다.(반복한다.)
            a[i]=d.roll();
            for(int j=0; j<6; j++){
                if(a[i] == j+1){
                    count[j]++;
                }
            }
        }
        for(int i=0; i<6; i++){
            b[i]=(double) count[i]/n; //b 배열
        }
    }

    void printProbability(){
        //화면에 출력하는
        for(int i=0; i<6; i++) {
            System.out.println("주사위 " + (i+1) + ": " + count[i] + "번 비율: " + b[i]);
        }
    }

    void init(){
        this.n=n;
        this.a=a;
        this.b=b;
        this.count=count;
        this.d=d;
    }
}
