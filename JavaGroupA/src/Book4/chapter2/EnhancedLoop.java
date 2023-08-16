package Book4.chapter2;

public class EnhancedLoop {

    public static void main(String[] args) {
//        for(String day : getDaysOfWeek()){
//            System.out.println(day);
//        }
        printStringArray(getDaysOfWeek());
    }


    public static String[] getDaysOfWeek() {
        String[] days = {"Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday"};

        return days;
    }

    public static void printStringArray(String[] strings){
        for(String s : strings){
            System.out.println(s);
        }
    }
}
