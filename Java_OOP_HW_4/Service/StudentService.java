package Service;

import Data.Student;
import Data.User;
import Repository.StudentRepository;
import Util.ReaderFromTxt;
import Util.WriterFromTxt;

public class StudentService implements DataService<Student> {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public User read() {
        return ReaderFromTxt.read();
    }

    @Override
    public User create(User user) {
        return WriterFromTxt.write(user);
    }

}