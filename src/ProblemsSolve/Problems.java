package ProblemsSolve;

import java.lang.reflect.Type;

public class Problems extends Person {
    private String description;
    private boolean isSolved;
    private ProblemType problemType;

    public void problemStatus(boolean isSolved) {
        this.isSolved = isSolved;
    }

    public boolean status() {
        return isSolved;
    }

    public void createProblem(String description,ProblemType problemType) {
        Problems problems = new Problems();
        problems.setDescription(description);
        problems.setProblemType(problemType);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProblemType getProblemType() {
        return problemType;
    }

    public void setProblemType(ProblemType problemType) {
        this.problemType = problemType;
    }

}
