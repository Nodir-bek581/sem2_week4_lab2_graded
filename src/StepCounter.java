

public class StepCounter {
    static int totalStepsAllUsers = 0;
    private int individualSteps = 0;

    public StepCounter() {}

    public void walk(int steps) {
        individualSteps += steps;
        totalStepsAllUsers += steps;
    }

    public static void resetGlobalSteps() {
        totalStepsAllUsers = 0;
    }

    public int getIndividualSteps() {return individualSteps;}

}
