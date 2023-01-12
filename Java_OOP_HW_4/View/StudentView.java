package View;

import java.util.List;

import Data.User;

public class StudentView extends UserView {

    @Override
    User findTheBest(List<User> userlist) {
        return userlist.get(0);
    }

}