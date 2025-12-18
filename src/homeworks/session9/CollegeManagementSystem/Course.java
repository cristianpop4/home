package homeworks.session9.CollegeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String schedule;
    private int duration;
    private String description;
    private Professor professor;
    private List<Student> students;

    public Course(String name, String schedule, int duration, String description){
        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
        this.students = new ArrayList<>();
    }

    public void assignedProfessor(Professor professor){
        this.professor = professor;
    }

    public void addStudents(Student student){
        students.add(student);
    }

    public void courseDetails(){
        System.out.println("Course name: " + name);
        System.out.println("Schedule: " + schedule);
        System.out.println("Duration: " + duration);
        System.out.println("Description: " + description);

        if (professor != null){
            System.out.println("Professor: " + professor.getFitstName() + " " + professor.getLastName());
        }
    }

    public void enroledStudents(){
        System.out.println("Enroled students in" + name + ":");
        for (Student student : students){
            System.out.println(student.getFitstName() + " " + student.getLastName());
        }
    }
}
