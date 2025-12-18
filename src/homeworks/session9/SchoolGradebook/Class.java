package homeworks.session9.SchoolGradebook;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String className;
    private List<Student> students;

    public Class(String className){
        this.className = className;
        this.students = new ArrayList<>();
    }

    public void addStudents(Student student){
        students.add(student);
    }

    public void displayStudents(){
        System.out.println("Class: " + className);
        for (Student student : students){
            System.out.println("Student: " + student.getName() + " " + student.getID() + " " + student.average());
        }
    }
}
