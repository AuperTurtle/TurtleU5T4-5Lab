import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your goal in minutes: ");
        int goal = scan.nextInt();
        int activityMin = 0;

        ActivityTracker activity = new ActivityTracker(goal);

        while (activityMin != -1) {
            System.out.print("Enter the number of minutes for your activity session, -1 to end: ");
            activityMin = scan.nextInt();
            scan.nextLine();
            if (activityMin != -1) {
                activity.logMinutes(activityMin);
            }
        }

        System.out.println("");
        System.out.println("Good job being active! Let's look at your stats: ");
        System.out.println("Number of sessions: " + activity.getSessions());
        System.out.println("Total number of minutes: " + activity.getTotalMinutes());
        System.out.println("Longest session logged (max minutes): " + activity.getMaxMinutes());
        System.out.println("You reached your goal: " + activity.goalAchieved());

    }
}
