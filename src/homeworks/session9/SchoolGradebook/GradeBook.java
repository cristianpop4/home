package homeworks.session9.SchoolGradebook;

public class GradeBook {
    public static void main(String[] args) {
        Class math = new Class("Math");

        Student s1 = new Student("Marcel", 70);
        Student s2 = new Student("Marcela", 80);

        math.addStudents(s1);
        math.addStudents(s2);
        s1.addGrades(10);
        s1.addGrades(8);
        s1.addGrades(9);
        s2.addGrades(8);
        s2.addGrades(10);
        s2.addGrades(8);

        math.displayStudents();
    }
}
