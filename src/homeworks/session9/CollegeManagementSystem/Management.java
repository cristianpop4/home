package homeworks.session9.CollegeManagementSystem;

public class Management {
    public void studentPrivateData(Student student) {
        System.out.println("Student CNP: " + student.getCnp());
        System.out.println("Student adress: " + student.getAdress());
    }

    public void professorPrivateData(Professor professor) {
        System.out.println("Professor CNP: " + professor.getCnp());
        System.out.println("Professor adress: " + professor.getAdress());
    }

    public static void main(String[] args) {
        Professor p1 = new Professor("Popesc", "Ion", "M", 48, "1970-02-29", "1536425252", "strada gorj judet gotj");
        Student s1 = new Student("Ionesc", "Marcel", "M", 17, "2008-12-01", "532423246", "stada gorj judet gorj");
        Student s2 = new Student("Ionesc", "Marcela", "F", 17, "2008-12-01", "532423246", "stada gorj judet gorj");
        Course  course1 = new Course("Math", "Monday from 10 to 11", 60, "Algebra");

        course1.assignedProfessor(p1);
        course1.addStudents(s1);
        course1.addStudents(s2);

        course1.courseDetails();
        course1.enroledStudents();
    }
}
