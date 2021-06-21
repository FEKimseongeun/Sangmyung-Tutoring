/*class Student {
    String name;
    int number;
    double gpa;
    Student(String name, int number, double gpa){
        this.name = name;
        this.number = number;
        this.gpa = gpa;
        System.out.println(toString());
    }
    String getName(){
        return name;
    }

    int getNumber(){
        return number;
    }

    double getGpa(){
        return gpa;
    }

    public String toString(){
        return "Name: "+ name + " Number: " + getNumber() + " GPA: " + getGpa();
    }
}


enum FindGPAParam {LOWER_THAN, HIGHER_THAN}
class StudentDB {
    Student[] students;
    StudentDB(){
        students = new Student[3];
    }

    void add(Student student){
        student = new Student(student.getName(), student.getNumber(), student.getGpa());
        students[0]=student;
    }

    void add(String name, int num, double gpa){
        for(int i=1; i<students.length; i++){
            students[i]= new Student(name, num, gpa);
        }
    }

    Student findBy(String name) {
        for (int i = 0; i < students.length; i++) {
            if ((students[i].name).equals(name)) {
                return students[i];
            }
        }
        return null;
    }

    Student findBy(int number){
        Student find_number = null;
        for(int i=0; i<students.length; i++){
            if(number == students[i].getNumber())
                find_number = students[i];
            break;
        }
        return find_number;
    }


    Student findBy(FindGPAParam param, double gpa){
        Student find_lower_higher_gpa = null;
        if(param == FindGPAParam.LOWER_THAN){
            for(int i=0; i<students.length; i++){
                if(gpa > students[i].getGpa()){
                    find_lower_higher_gpa = students[i];
                    break;
                }
            }
        }
        else{
            for(int i=0; i<students.length; i++){
                if(gpa < students[i].getGpa()){
                    find_lower_higher_gpa = students[i];
                    break;
                }
            }
        }
        return find_lower_higher_gpa;
    }

    Student findBy(double gpa){
        Student find_gpa = null;
        for(int i=0; i<students.length; i++){
            if(gpa == students[i].gpa)
                find_gpa = students[i];
            break;
        }
        return find_gpa;
    }
}

public class test {
    public static void main(String[] args){
        StudentDB Studentdb = new StudentDB();
        Studentdb.add(new Student("김지우", 201911111, 4.01));
        Studentdb.add("이민준", 201922222, 3.85);
        Studentdb.add("박서윤", 201933333, 3.90);
        Studentdb.findBy("김지우");
        Studentdb.findBy(201922222);
        Studentdb.findBy(3.90);
        Studentdb.findBy(FindGPAParam.LOWER_THAN,3.95);
        Studentdb.findBy(FindGPAParam.HIGHER_THAN,3.95);
    }
}
*/