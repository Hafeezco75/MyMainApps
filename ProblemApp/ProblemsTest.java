import ProblemsSolve.ProblemType;
import ProblemsSolve.Problems;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemsTest {

    @Test
    public void test() {
        Problems problem = new Problems();
        problem.createProblem("Sapa", ProblemType.FINANCIAL);
        problem.createProblem("Bokku", ProblemType.BUSINESS);
        assertEquals(2,2);
    }

}
