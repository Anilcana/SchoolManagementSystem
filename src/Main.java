import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Ednan = new Teacher(1,"Adnan",350);
        Teacher Drow = new Teacher(2,"Sakine",500);
        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(Ednan);
        teacherList.add(Drow);

        Student Utku = new Student(2,"Arda",4);
        Student Melissa = new Student(2,"Melisa",12);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Utku);
        studentList.add(Melissa);

        School kln = new School(teacherList,studentList);



        Utku.payFees(5000);
        Utku.setGrade(2);
        System.out.println(Utku.getFeesPaid());

        System.out.println("Kln earned : " + kln.getTotalMoneyEarned());

        System.out.println("School Pays Salary Stage");
        Ednan.receiveSalary(Ednan.getSalary());
        System.out.println("Kln spent "+ kln.getTotalMoneySpent());

        System.out.println(Melissa);
    }
}