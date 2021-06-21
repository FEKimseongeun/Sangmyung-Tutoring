public class place {
    static String mirror(String s){ //s= Sangmyung University 14글자 길이 : 14 , 인덱스(자릿값) : 맨마지막 ->13
        String strM="";
        for(int i=s.length(); i>0; i--){  //s.length()->문자열의 길이: 몇글자인지 들어가는데
            strM += s.charAt(i-1); //charAt();  s.charAt(0) =>'S'
        }//yti..... gnu...S
        return strM;
    }
    public static void main(String[] args){
        String str="Sangmyung University";
        System.out.println(mirror(str));
    }
}


