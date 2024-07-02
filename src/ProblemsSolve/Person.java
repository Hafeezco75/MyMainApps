package ProblemsSolve;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Person {
    private String listOfProblems;
    private Problems problems;
    private ArrayList<Problems> problemList = new ArrayList<>();

    public String getListOfProblems() {
        return listOfProblems;
    }

    public void addProblem(String description, ProblemType problemType){
        Problems problem = new Problems();
        problem.createProblem(description,problemType);
        problemList.add(problem);
    }

    public Problems getProblems() {
        return problems;
    }

    public void setProblems(Problems problems) {
        this.problems = problems;
    }

    public boolean solveProblem(String listOfProblems){
        if (problemList.equals(listOfProblems)) {
            return true;
        }
        return false;
    }

    public ArrayList<Problems> countProblem(){
        if (problemList.contains(listOfProblems)) {
            return problemList;
        }
        return null;
    }

}
