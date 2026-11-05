
import java.util.List;

public interface CrudOperations<T> {

    void add(T object) throws InvalidStudentException;

    List<T> getAll();

    T getById(int id) throws InvalidStudentException;

    void update(int id, T object) throws InvalidStudentException;

    void delete(int id) throws InvalidStudentException;
}
