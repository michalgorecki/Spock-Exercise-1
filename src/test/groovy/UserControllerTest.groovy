import spock.lang.Specification
import spock.lang.Subject


class UserControllerTest extends Specification {

    DatabaseInterface db

    @Subject
    UserController controller


    //TODO check if a proper method in DatabasePersister is called
    def "should try to save user to database"() {
        given:
        db = Mock()
        controller = new UserController(db)
        when:
        // TODO implement when
        then:
        // TODO implement then
    }

    //TODO figure out how to test getGmailUsers() without connecting to database
    def "should get gmail users correctly"() {
        given:
        db = Stub()
        controller = new UserController(db)
        when:
        // TODO implement when
        then:
        // TODO implement then
    }
}
