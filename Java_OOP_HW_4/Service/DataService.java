package Service;

import Data.User;

public interface DataService<E extends User> {
    public User read();

    public User create(User user);
}