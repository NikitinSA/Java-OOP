package Java_OOP_HW_2.Controller;

import Java_OOP_HW_2.Data.StudentGroup;
import Java_OOP_HW_2.Data.Student;
import Java_OOP_HW_2.Data.Teacher;
import Java_OOP_HW_2.Service.DataService;
import Java_OOP_HW_2.Service.StudentDataService;
import Java_OOP_HW_2.Service.TeacherDataService;

public class Controller {
    private DataService studentService;
    private DataService teacherService;

    public Controller(StudentDataService studentService, TeacherDataService teacherService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
    }

    public Student writeStudent (Student student) {
        studentService.write(student);
        return (Student) studentService.read(student);
    }

    public Teacher writeTeacher (Teacher teacher) {
        teacherService.write(teacher);
        return (Teacher) teacherService.read(teacher);
    }

    public StudentGroup createGroup (int groupNumber) {
        StudentGroup group = new StudentGroup(null, null, groupNumber);
        return group;
    }
}
