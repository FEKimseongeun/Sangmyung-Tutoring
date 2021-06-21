import java.text.DecimalFormat;
import java.util.Scanner;

enum BUS{
    A(0,"ADULT",0,12.5),
    B(1,"YOUTH",0,9.0),
    C(2,"CHILD",0,9.0),
    D(3,"TRANSFER",1,13.0),
    E(4,"CHILD",0,14.2),
    F(5,"TRANSFER",4,55.5),
    G(6,"ADULT",0,18.0),
    H(7,"YOUTH",0,11.2),
    I(8,"TRANSFER",3,20.0),
    J(9,"TRANSFER",4,56.0),
    K(10,"TRANSFER",2,32.3);
    int seq, nTransfer; String type; double distanceTraveled;
    BUS(int seq, String type, int nTransfer, double distanceTraveled) {
        this.seq = seq;
        this.type = type;
        this.nTransfer = nTransfer;
        this.distanceTraveled = distanceTraveled;
    }

    public int getseq () {
        return seq;
    }
    public String gettype () {
        return type;
    }
    public int getnTransfer () {
        return nTransfer;
    }
    public double getdistanceTraveled () {
        return distanceTraveled;
    }

}

class FareType{
    String fType;
    FareType(String fType){
        this.fType = fType;
    }
    public String getfType () {
        return fType;
    }

}

public class Main_mid{
    private static String[] array;
    private static int[] fare = new int[11];
    private static DecimalFormat formatter;

    public static void getInput(String p) {  // p= "0 Adult 0 12.5km"
        p=p.substring(0, p.length()-2); // substring() indexOf -> 0 Adult 0 12.5
        array = p.split(" "); //split ,replace, trim
        System.out.println("...boarding " + array[0] + " " + array[1].toUpperCase() + " transfer " + array[2] + " for " + array[3] +"km");
    }
    //0 Adult 0 12.5km
    //0 Adult 0 12.5
    //array[0] = 0 array[1]= Adult array[2]= 0  array[3] =12.50



    static int computeFare(int seq, String type, int nTransfer, double distanceTraveled) {
        if (nTransfer > 0 && nTransfer < 5) { //환승을 했을 때
            if (distanceTraveled >= 15) {
                fare[seq] = (int) ((distanceTraveled-10) / 5) * 100; //0부터 시작하니까 세번째사람이면 seq =2 / 20km 1번을했다 10 <2>
            }
        }else{
            if(type=="ADULT"){
                fare[seq]=1200;
            }else if(type=="YOUTH"){
                fare[seq]=720;
            }else if(type=="CHILD"){
                fare[seq]=450;
            }
        }
        return fare[seq]; // 총 금액
    }

    static void printPassenger(){
        int fare_sum=0;
        formatter=new DecimalFormat("###,###");
        System.out.println(" seq     type    n transfer distance travelled    fare"); // 오른쪽 정렬, 띄어쓰기 맞추기
        System.out.println("----- ---------- ---------- ------------------ ---------");
        BUS[] values = BUS.values();
        for(int i = 0; i< values.length; i++) {
            System.out.println(values[i].seq + "      " + values[i].type + "          " + values[i].nTransfer + "          " + values[i].distanceTraveled + "km" + "          " + formatter.format(computeFare(values[i].seq, values[i].type, values[i].nTransfer, values[i].distanceTraveled))+"won");
        }
        System.out.println("--------------------------------------------------------");
        for(int i=0; i<fare.length; i++){
            fare_sum+=fare[i];
        }
        System.out.println("                                                 "+formatter.format(fare_sum));
    }

    static void printBy(String ft){ //ft=내가 입력한 문자열 즉, 예를들어 ADULT
        formatter=new DecimalFormat("###,###");
        System.out.println(" seq     type    n transfer distance travelled    fare");
        System.out.println("----- ---------- ---------- ------------------ ---------");
        BUS[] values = BUS.values(); //values[0] -> 첫번째 순서인 values[0].type
        int typeSum=0;
        for(int i = 0; i< values.length; i++) {
            if((values[i].type).equals(ft)){
                System.out.println(values[i].seq + "      " + values[i].type + "          " + values[i].nTransfer + "          " + values[i].distanceTraveled + "km" + "          " + fare[values[i].seq]+" won");
                typeSum+=fare[values[i].seq];
            }
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("                                                 "+formatter.format(typeSum)+" won");

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] str=new String[11];
        for(int i=0; i<=10; i++){
            str[i]=sc.nextLine();
        }
        for(int i = 0; i<=10; i++){
            getInput(str[i]);
        }
        printPassenger();

        String s=sc.nextLine();
        printBy(s);
    }
}