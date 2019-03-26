package app;

import java.util.ArrayList;
import java.util.List;

public class DatabasePersister implements  DatabaseInterface {

    /**
     * @param user to be stored in database
     */
    @Override
    public void saveUser(User user) {
        //TODO implement database connection
        System.out.println("Saving user: "+user);
    }

    /**
     * @return list of users from DB
     */
    @Override
    public List<User> getUsers() {
        //TODO implement database connection
        return new ArrayList<>();
    }
}
