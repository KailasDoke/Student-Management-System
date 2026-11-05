
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements CrudOperations<Student> {

    private List<Student> students = new ArrayList<>();

    @Override
    public void add(Student student) throws InvalidStudentException {

        for (Student s : students) {
            if (s.getId() == student.getId()) {
                throw new InvalidStudentException(
                        "Student ID already exists!"
                );
            }
        }

        students.add(student);
    }

    @Override
    public List<Student> getAll() {
        return new ArrayList<>(students);
    }

    @Override
    public Student getById(int id) throws InvalidStudentException {

        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }

        throw new InvalidStudentException(
                "Student not found!"
        );
    }

    @Override
    public void update(int id, Student updatedStudent)
            throws InvalidStudentException {

        Student existingStudent = getById(id);

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setAge(updatedStudent.getAge());
        existingStudent.setMarks(updatedStudent.getMarks());
    }

    @Override
    public void delete(int id) throws InvalidStudentException {

        Student student = getById(id);
        students.remove(student);
    }
}
