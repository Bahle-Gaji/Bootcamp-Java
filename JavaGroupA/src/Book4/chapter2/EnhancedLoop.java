package Book4.chapter2;

public class EnhancedLoop {

    public static void main(String[] args) {
        for(String day : getDaysOfWeek()){
            System.out.println(day);
        }
    }

    public static String[] getDaysOfWeek() {
        String[] days = {"Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday"};

        return days;
    }
}
