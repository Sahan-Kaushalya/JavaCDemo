public class EnhanceSwitchDemo {
    public static void main(String[] args) {
        weekDayFinder(1);
        weekDayFinder(2);
        weekDayFinder(3);
    }

    private static void weekDayFinder(int sendday) {
        int day = sendday;
        String dayName;
        System.out.println("\n...................Enhance Switch...................\n");
        String result =switch (day) {
            case 1 -> dayName = "Monday";
            case 2 ->dayName = "Tuesday";
            case 3->dayName = "Wednesday";
            case 4->dayName = "Thursday";
            case 5->dayName = "Friday";
            case 6->dayName = "Saturday";
            case 7->dayName = "Sunday";
            default ->dayName = "Invalid Day";
        };

        System.out.println("The Day of the Week Name is: " + dayName);
        System.out.println("The Result is: " + result);

    }
}
