public class Method {
    public static void main(String[] args){

    }
}

class Check{
    //instanceV=iv;  //인스턴스 변수
    //classV=cv; //클래스변수
    //instanceM=im; //인스턴스 메서드
    //classM=cm; //클래스 메서드

    static int cv =5; //클래스 변수
    int iv=4; //인스턴스 변수


    static void cm(){ //클래스 메서드

    }
    void im(){ //인스턴스 메서드

    }

    static void cm_Imember(){ //클래스 메서드
        //System.out.println(iv);
        //im();
    }

    void im_Cmember(){ //클래스 멤버들을 넣어줘도
        System.out.println(cv);
        cm();
    }
}