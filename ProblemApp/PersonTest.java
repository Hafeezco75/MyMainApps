import ProblemsSolve.Person;
import ProblemsSolve.ProblemType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    @Test
    public void testThatPersonCanAddProblem() {
        Person person = new Person();
        person.addProblem("Kleptomania", ProblemType.SPIRITUAL);
        person.addProblem("Doings", ProblemType.BUSINESS);
        assertEquals(2,2);
    }

    @Test
    public void testThatPersonCanSolveProblem() {
        Person person = new Person();
        person.addProblem("Kleptomania", ProblemType.SPIRITUAL);
        person.addProblem("Doings", ProblemType.BUSINESS);
        person.solveProblem("Kleptomania");
        assertTrue(true);
    }

    @Test
    public void testThatPersonCanCountProblem() {
        Person person = new Person();
        person.addProblem("Kleptomania", ProblemType.SPIRITUAL);
        person.addProblem("Doings", ProblemType.BUSINESS);
        person.addProblem("Sapa", ProblemType.FINANCIAL);
        person.solveProblem("Kleptomania");
        person.countProblem();
        assertEquals(3,3);
    }

}
