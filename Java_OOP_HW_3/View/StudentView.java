package Java_OOP_HW_3.View;

import java.util.List;

import Java_OOP_HW_2.Data.User;

public class StudentView extends UserView{

    @Override
    protected User findTheBest(List<User> userList) {
        User user = userList.get(0);
        return user;
    }
}