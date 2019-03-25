public class DatabasePersister implements  DatabaseInterface {
    @Override
    public void saveUser(User u) {
        System.out.println("Saving user: "+u);
    }
}
