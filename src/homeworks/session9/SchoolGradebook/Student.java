package homeworks.session9.SchoolGradebook;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int ID;
    private List<Integer> grades;

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
        this.grades = new ArrayList<>();
    }

    public void addGrades(int grade) {
        grades.add(grade);
    }

    public double average() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = Math.round(((double) sum / grades.size()) * 100.0) / 100.0;
        return (double) average;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

}
