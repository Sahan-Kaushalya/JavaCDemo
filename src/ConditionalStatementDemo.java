public class ConditionalStatementDemo {

    public static void main(String[] args) {

        int age = 18;

        if (age == 0) {
            System.out.println("Age is Zero");
            System.out.println("Please Enter a Valid Age  \n");
        } else if (age > 0 && age < 18) {
            System.out.println("You are a Minor");
            System.out.println("User Can't Vote  \n");
        } else {
            System.out.println("You are an Adult");
            System.out.println("User Can Vote \n");
        }

        String testing = (age == 0) ? "Age is Zero || Please Enter a Valid Age  \n"
                : (age > 0 && age < 18) ? "You are a Minor || User Can't Vote  \n" : "You are an Adult || User Can Vote  \n";

        System.out.println(testing);

        // Ternary Operator
        // Question

        int i = 8;
        int j = 10;

        if (i > j) {
            j = 1;
        } else {
            j = 2;
        }

        System.out.println("Value of J :" + j + " \n");

        // Ternary Operator
        // My Answer

        int im = 8;
        int jm = 10;
        int myAnswer = (im > jm) ? 1 : 2;
        System.out.println("My Answer Value of J :" + myAnswer + " \n");

        if (true) {
            System.out.println("This will always Execute");
            System.out.println("Because the condition is always true \n");
        }

        if (false) {
            System.out.println("This will never Execute");
            System.out.println("Because the condition is always false");
        }
        weekDayFinder(10);
        weekDayFinder(1);
        weekDayFinder(7);
        weekDayFinder(5);
        weekDayFinder(3);
        
        // Testing the findExamMarks method
        findExamMarks("Kamal", "Maths", 95);

        weekDayFinderWithOutBreak(7);
        weekDayFinderWithOutBreak(1);
        weekDayFinderWithOutBreak(3);
        weekDayFinderWithOutBreak(5);
    }

    private static void weekDayFinder(int sendday) {
        int day = sendday;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid Day";
        }
        System.out.println("Day Name: " + dayName + "\n");
    }

    private static void weekDayFinderWithOutBreak(int sendday) {
        int day = sendday;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                System.out.println("Day Name: " + dayName );
            case 2:
                dayName = "Tuesday";
                System.out.println("Day Name: " + dayName );
            case 3:
                dayName = "Wednesday";
                System.out.println("Day Name: " + dayName );
            case 4:
                dayName = "Thursday";
                System.out.println("Day Name: " + dayName );
            case 5:
                dayName = "Friday";
                System.out.println("Day Name: " + dayName );
            case 6:
                dayName = "Saturday";
                System.out.println("Day Name: " + dayName );
            case 7:
                dayName = "Sunday";
                System.out.println("Day Name: " + dayName );
            default:
                dayName = "Invalid Day";
        }
        System.out.println("Day Name: " + dayName + "\n");
    }

    private static void findExamMarks(String name, String subject, int marks) {
        String examMarks;
        if (marks == 100) {
            examMarks = "A++";
        } else if (marks < 100 && marks > 90) {
            examMarks = "A+";
        } else if (marks <= 90 && marks > 80) {
            examMarks = "A";
        } else if (marks <= 80 && marks > 70) {
            examMarks = "B";
        } else {
            examMarks = "C or Lower";
        }
        System.out.println("Student: " + name + " | Subject: " + subject + " | Grade: " + examMarks + "\n");

        // Why switch case not suitable here - 
        // 1. Switch cases in Java only evaluate exact values (e.g., case 100:, case 90:).
        // 2. They cannot evaluate relational or logical conditions (like marks < 100 && marks > 90).
        // 3. To use a switch case here, we would have to write 100 separate cases (case 1:, case 2:, ... case 100:),
        //    which is highly inefficient and not practical for range-based logic. 
        // 4. Therefore, if-else if statements are the best practice for evaluating ranges.
    }

}
