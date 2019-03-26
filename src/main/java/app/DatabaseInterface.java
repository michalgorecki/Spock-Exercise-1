package app;

import java.util.List;

public interface DatabaseInterface {
    void saveUser(User u);

    List<User> getUsers();
}
