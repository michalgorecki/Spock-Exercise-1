package calculator

import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll


class CalculatorTest extends Specification {

    @Subject
    Calculator calculator


    //TODO write a parameterized test case in order to check if the results are ok
    @Unroll
    def "should add two numbers correctly"() {
        expect:

        where:
        // TODO implement where
    }

}
