package java_2.data_types;

class Student {
    int age;
    String name;
    int mark;
}

public class ArrayOfObjects {
    static void main() {

        Student s1 = new Student();
        s1.age = 15;
        s1.name = "mamad";
        s1.mark = 99;

        Student s2 = new Student();
        s2.age = 22;
        s2.name = "ali";
        s2.mark = 56;

        Student s3 = new Student();
        s3.age = 25;
        s3.name = "karim";
        s3.mark = 80;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student student : students) {
            System.out.println(student.name + " : " + student.mark);
        }
        
    }
}
