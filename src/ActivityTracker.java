public class ActivityTracker {
    private int goalMinutes;
    private int totalMinutes = 0;
    private int highestMinutes;
    private int timesLogged;

    public ActivityTracker(int goal) {
        this.goalMinutes = goal;
    }

    public void logMinutes(int addMinutes) {
        totalMinutes += addMinutes;
        timesLogged++;
        if (addMinutes >= highestMinutes) {
            highestMinutes = addMinutes;
        }
    }

    public int getSessions() {
        return timesLogged;
    }

    public boolean goalAchieved() {
        if (totalMinutes >= goalMinutes) {
            return true;
        }	else	{
            return false;
        }
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public int getMaxMinutes() {
        return highestMinutes;
    }
}
