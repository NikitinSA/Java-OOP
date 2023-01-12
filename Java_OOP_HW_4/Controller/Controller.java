package Controller;

import Data.Student;
import Data.StudentGroup;
import Repository.GroupRepository;
import Service.GroupStreamServiceImpl;
import Service.StudentGroupServiceImpl;
import Service.StudentService;

public class Controller {

    private StudentService studentService;

    public Controller(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student createStudent(Student student) {
        studentService.create(student);
        return (Student) studentService.read();
    }

    public StudentGroup createStudentGroup(int groupNumber) {
        return new StudentGroupServiceImpl(new GroupRepository()).getStudentGroup();
    }

    public void removeStudent(String fio) {
        StudentGroupServiceImpl studentGroupServiceImpl = new StudentGroupServiceImpl(new GroupRepository());
        studentGroupServiceImpl.removeStudent(fio);
    }

    public void sortGroupStream(GroupStreamServiceImpl groupStreamServiceImpl) {
        sortGroupStream(groupStreamServiceImpl);
    }
}