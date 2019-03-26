package app;

import java.util.List;
import java.util.stream.Collectors;

public class UserController {

    DatabaseInterface db;

    public UserController(DatabaseInterface db) {
        this.db = db;
    }

    /**
     * @param name
     * @param email , must have correct email format
     * @throws Exception thrown when email is in wrong format
     */
    public void createUser(String name, String email) throws Exception {
        if(EmailValidator.isValid(email)){
            User user = new User(name, email);
            db.saveUser(user);
        }else{
            throw new Exception("Invalid email!");
        }
    }

    /**
     *
     * @return users whose emails contain "gmail.com"
     */
    public List<User> getGmailUsers(){
        List<User> users = db.getUsers();
        return users.stream().filter(user -> user.getEmail().contains("gmail.com")).collect(Collectors.toList());
    }

}
