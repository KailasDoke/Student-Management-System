
public class Student extends Person implements GradeCalculator {

    private int id;
    private double marks;

    public Student(int id, String name, int age, double marks) {
        super(name, age);
        this.id = id;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String calculateGrade() {

        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "Fail";
        }
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + getName() +
                ", Age: " + getAge() +
                ", Marks: " + marks +
                ", Grade: " + calculateGrade();
    }
}
