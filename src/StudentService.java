
import java.util.List;

public class StudentService {

    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public void addStudent(Student student)
            throws InvalidStudentException {

        validateStudent(student);
        repository.add(student);
    }

    public List<Student> getAllStudents() {
        return repository.getAll();
    }

    public Student searchStudent(int id)
            throws InvalidStudentException {

        return repository.getById(id);
    }

    public void updateStudent(int id, Student student)
            throws InvalidStudentException {

        validateStudent(student);
        repository.update(id, student);
    }

    public void deleteStudent(int id)
            throws InvalidStudentException {

        repository.delete(id);
    }

    private void validateStudent(Student student) {

        if (student.getId() <= 0) {
            throw new IllegalArgumentException(
                    "Student ID must be positive!"
            );
        }

        if (student.getName() == null ||
                student.getName().trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Name cannot be empty!"
            );
        }

        if (student.getAge() < 1 || student.getAge() > 120) {
            throw new IllegalArgumentException(
                    "Invalid student age!"
            );
        }

        if (student.getMarks() < 0 || student.getMarks() > 100) {
            throw new IllegalArgumentException(
                    "Marks must be between 0 and 100!"
            );
        }
    }
}
