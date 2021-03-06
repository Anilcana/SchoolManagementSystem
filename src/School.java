import java.util.List;

/* Many teachers, many students*/
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public List<Teacher> getTeacher() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudent() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneySpent += MoneySpent;
    }

    /**
     *
     * @param teacher list of teachers in the school
     * @param student list of students in the school
     */
    public School(List<Teacher> teacher, List<Student> student) {
        this.teachers = teacher;
        this.students = student;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }
}

