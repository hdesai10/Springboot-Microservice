package main.java.com.practice.javaPracticeExample.abstrac;

public class Student extends Person{
    private int studentID;

    public Student(String name, String gender,int studentID) {
        super(name, gender);
        this.studentID=studentID;
    }

    @Override
    public void stuying() {
        if (studentID == 0) {
            System.out.println("student is not register");
        }
        else {
            System.out.println("student stuying ");
        }
    }
    public static void main(String[] args) {
        Student student = new Student("Hiren","Male",0);
        Student student1 = new Student("Dipu","FeMale",100);
        Student student3 = new Student("Di","FeMale",25);

        student.stuying();
        student1.stuying();
        student3.stuying();
        System.out.println(student.toString());
        System.out.println(student1.toString());
        System.out.println(student3.toString());
    }

}
