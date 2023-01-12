package Controller;

import Data.Student;
import Service.StudentService;

public class StudentController implements InterfaceController<Student, Integer> {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student save(Student student) {
        return studentService.saveStudent(student);
    }

    @Override
    public Student find(Integer id) {
        return studentService.findStudentById(id);
    }
}