package java;

class TV{
    private int size;
    public TV(int size) { this.size = size; }
    protected int getSize() { return size; }
}

class ColorTV extends TV{
    private int color;
    ColorTV(int size, int color){
        super(size);
        this.color=color;
    }
    public void printProperty(){
        System.out.println(getSize()+"인치 " + color + "컬러");
    }
}

class IPTV extends ColorTV{
    String addr;
    IPTV(String addr, int size, int color){
        super(size, color);
        this.addr=addr;
    }
    public void printProperty(){
        System.out.print("나의 IPTV는 " + addr +" 주소의 ");
        super.printProperty();
    }
}

public class Test_ex {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32 인치, 2048 컬러
        iptv.printProperty();
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
    }
}
