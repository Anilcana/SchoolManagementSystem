public class Student {
    // Keeping the track of Students
    private int id;
    private String name;
    private int grade;
    private static int feesPaid;
    private static int feesTotal;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /**To create a student object
     * School fee is 30,000
     * @param id : student id
     * @param name : student name
     * @param grade : student grade
     */
    public Student(int id,String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public static void payFees(int fees){
        feesPaid =+ fees;
        School.updateTotalMoneyEarned(fees);

    }

    @Override
    public String toString() {
        return "Student{" +
                "Name of the Student='" + name + '\'' +
                " fees paid=" + feesPaid +
                '}';
    }
}
