public class UserController {

    DatabaseInterface db;

    public void createUser(String name, String email) throws Exception {
        if(EmailValidator.isValid(email)){
            User user = new User(name, email);
            db.saveUser(user);
        }else{
            throw new Exception("Invalid email!");
        }
    }
}
