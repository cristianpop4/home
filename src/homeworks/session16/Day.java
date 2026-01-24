package homeworks.session16;

import java.util.EnumMap;
import java.util.Map;

public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class DayScheduler {
    private Map<Day, String> activities;

    public DayScheduler() {
        activities = new EnumMap<>(Day.class);
    }

    public String getActivity(Day day) {
        return activities.getOrDefault(day, "No activity planned");
    }

    public void setActivities(Day day, String activity) {
        activities.put(day, activity);
    }

    public void printSchedule() {
        System.out.println("Weekly Schedule:");
        for (Day day : Day.values()) {
            System.out.println(day + ": " + getActivity(day));
        }
    }
}