import java.util.Scanner;

public class Problem3Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter steps of userA: ");
        int userASteps = input.nextInt();

        System.out.print("Enter steps of userB: ");
        int userBSteps = input.nextInt();

        StepCounter userA = new StepCounter();
        StepCounter userB = new StepCounter();

        userA.walk(userASteps);
        userB.walk(userBSteps);

        System.out.println(userA.getIndividualSteps());
        System.out.println(userB.getIndividualSteps());
        System.out.println(StepCounter.totalStepsAllUsers);

        StepCounter.resetGlobalSteps();


    }
}
