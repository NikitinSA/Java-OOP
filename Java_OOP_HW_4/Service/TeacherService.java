package Service;

import Data.Teacher;
import Data.User;
import Repository.TeacherRepository;
import Util.ReaderFromTxt;
import Util.WriterFromTxt;

public class TeacherService implements DataService<Teacher> {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher findTeacherById(int id) {
        return teacherRepository.findById(id);
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