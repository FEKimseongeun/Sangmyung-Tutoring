package java;

import java.util.Scanner;
class Drama{
    String title,director;

    public Drama(String title, String director){
        this.title=title;
        this.director=director;
    }
}


public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Drama[] list=new Drama[2];

        for(int i=0; i<list.length; i++){
            System.out.println("드라마 제목 : ");
            String title=sc.nextLine();
            System.out.println("드라마 감독 : ");
            String director=sc.nextLine();
            list[i]=new Drama(title, director);
        }

        for(int i=0; i<list.length; i++){
            System.out.println("드라마 제목: " + list[i].title
                    + "/ 드라마 감독: " + list[i].director);

        }

    }
}
