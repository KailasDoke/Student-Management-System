
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            choice = readInt("Enter your choice: ");

            try {
                switch (choice) {

                    case 1:
                        addStudent(service);
                        break;

                    case 2:
                        displayStudents(service);
                        break;

                    case 3:
                        searchStudent(service);
                        break;

                    case 4:
                        updateStudent(service);
                        break;

                    case 5:
                        deleteStudent(service);
                        break;

                    case 6:
                        System.out.println("Thank you for using the application!");
                        break;

                    default:
                        System.out.println("Invalid menu choice!");
                }

            } catch (InvalidStudentException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 6);

        sc.close();
    }

    // Add Student
    private static void addStudent(StudentService service)
            throws InvalidStudentException {

        System.out.println("\n--- Add Student ---");

        int id = readInt("Enter Student ID: ");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int age = readInt("Enter Student Age: ");

        double marks = readDouble("Enter Student Marks: ");

        Student student = new Student(id, name, age, marks);

        service.addStudent(student);

        System.out.println("Student added successfully!");
    }

    // Display All Students
    private static void displayStudents(StudentService service) {

        System.out.println("\n--- Student Records ---");

        List<Student> students = service.getAllStudents();

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Search Student
    private static void searchStudent(StudentService service)
            throws InvalidStudentException {

        System.out.println("\n--- Search Student ---");

        int id = readInt("Enter Student ID: ");

        Student student = service.searchStudent(id);

        System.out.println("Student Found:");
        System.out.println(student);
    }

    // Update Student
    private static void updateStudent(StudentService service)
            throws InvalidStudentException {

        System.out.println("\n--- Update Student ---");

        int id = readInt("Enter Student ID to update: ");

        // Check whether student exists
        Student existingStudent = service.searchStudent(id);

        System.out.println("Current Details: " + existingStudent);

        System.out.print("Enter New Name: ");
        String name = sc.nextLine();

        int age = readInt("Enter New Age: ");

        double marks = readDouble("Enter New Marks: ");

        Student updatedStudent = new Student(id, name, age, marks);

        service.updateStudent(id, updatedStudent);

        System.out.println("Student updated successfully!");
    }

    // Delete Student
    private static void deleteStudent(StudentService service)
            throws InvalidStudentException {

        System.out.println("\n--- Delete Student ---");

        int id = readInt("Enter Student ID to delete: ");

        service.deleteStudent(id);

        System.out.println("Student deleted successfully!");
    }

    // Read Integer Safely
    private static int readInt(String message) {

        while (true) {
            System.out.print(message);

            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer!");
            }
        }
    }

    // Read Double Safely
    private static double readDouble(String message) {

        while (true) {
            System.out.print(message);

            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }
}
