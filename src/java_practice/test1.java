class Student{
    String name;
    int number;
    double gpa;

    public Student(String n, int n1, double n2){
        name=n;
        number=n1;
        gpa=n2;
        System.out.println(toString());
    }
    String getName(){
        return name;
    }
    int getNumber(){
        return number;
    }
    double getGPA(){
        return gpa;
    }
    public String toString(){
        return "Name: " + name +", " + "Number: " + getNumber()+ ", " + "GPA: " + getGPA();
    }
}

class StudentDB{
    Student[] students;
    int count = 0;

    public StudentDB(){
        students = new Student[3];
    }
    public void add(Student student){
        students[count] = student;
        count++;
    }
    public void add(String n, int numb, double G){
        Student s = new Student(n,numb,G);
        students[count] = s;
        count++;
    }

    public Student findBy(String name){
        for(int i=0; i<3; i++) {
            if ((students[i].name).equals(name))
                return students[i];
            else if(i==2 && (students[i].name).equals(name)!=true)
                System.out.println("NULL");
        }
        return null;
    }
    public Student findBy(int number){
        for(int i=0; i<3; i++) {
            if ((students[i].number)==number)
                return students[i];
            else if(i==2 && (students[i].number)!=number)
                System.out.println("NULL");
        }
        return null;
    }
    public Student findBy(double gpa){
        for(int i=0; i<3; i++) {
            if ((students[i].gpa)==gpa)
                return students[i];
            else if(i==2 && (students[i].gpa)!=gpa)
                System.out.println("NULL");
        }
        return null;
    }

    public Student findBy( FindGPAParam ce, double gpa){
        switch(ce){
            case LOWER_THAN:
                for(int i=0; i<3; i++) {
                    if (students[i].gpa<gpa)
                        return students[i];
                }
            case HIGHER_THAN:
                for(int i=0; i<3; i++) {
                    if (students[i].gpa>gpa)
                        return students[i];
                }
        }
        return null;
    }
}

enum FindGPAParam {LOWER_THAN, HIGHER_THAN};
public class test1{
    public static void main(String[] args){
        StudentDB DB = new StudentDB();
        DB.add(new Student("김지우",201911111,4.01));
        DB.add("이민준",201922222,3.85);
        DB.add("박서윤",201933333,3.90);

        System.out.println("김지우 찾기" + " -----> " + DB.findBy("김지우"));
        System.out.println("20192222 찾기" + " -----> " + DB.findBy(201922222));
        System.out.println("GPAParam: LOWER_THAN & Search GPA: 3.95" + " -----> " + DB.findBy(FindGPAParam.LOWER_THAN,3.95));
        System.out.println("GPAParam: HIGHER_THAN & Search GPA: 3.95" + " -----> " + DB.findBy(FindGPAParam.HIGHER_THAN,3.95));
    }
}