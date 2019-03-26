package app


import spock.lang.Specification
import spock.lang.Subject

class UserControllerTest extends Specification {

    DatabaseInterface db

    @Subject
    UserController controller


    //TODO write a test case to check if a proper method in DatabasePersister is called
    def "should try to save user to database"() {
        given:
        db = Mock()
        controller = new UserController(db)
        when:
        // TODO implement when
        then:
        // TODO implement then
    }

    //TODO write a test case to check what getGmailUsers() returns, but mock database persister
    def "should retrieve gmail users correctly"() {
        given:
        db = Stub()
        controller = new UserController(db)
        when:
        // TODO implement when
        then:
        // TODO implement then
    }
}
