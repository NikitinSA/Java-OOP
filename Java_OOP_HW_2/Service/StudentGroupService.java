package Java_OOP_HW_2.Service;

import Java_OOP_HW_2.Data.Student;
import Java_OOP_HW_2.Data.Teacher;

public interface StudentGroupService {
    Teacher read (Teacher teacher);
    Student read (Student student);
}
