class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Student extends Person{
    int rollNo;
    int mark1;
    int mark2;
    int mark3;

    Student(String name, int age, int rollNo, int mark1, int mark2, int mark3){
        super(name, age);
        this.rollNo = rollNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark2;

    }

    void display(){
        System.out.println("Student Details");
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Roll No :" + rollNo);
        System.out.println("Mark 1 :" + mark1);
        System.out.println("Mark 2 :" + mark2);
        System.out.println("Mark 3 :" + mark3);
    }
}
public class StudentRecord{
    public static void main(String[] args){
        Student s = new Student("Alphin", 21, 13, 90, 98, 79);
        s.display();
    }
}