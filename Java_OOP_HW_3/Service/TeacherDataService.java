package Java_OOP_HW_3.Service;

import Java_OOP_HW_2.Data.User;
import Java_OOP_HW_2.Util.ReaderFromTxt;
import Java_OOP_HW_2.Util.WriterToTxt;

public class TeacherDataService implements DataService {
    @Override
    public void write(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }
}