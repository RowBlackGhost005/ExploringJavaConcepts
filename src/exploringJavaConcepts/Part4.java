package exploringJavaConcepts;

public class Part4 {

    public static void main(String[] args) {
        //Part 4: Using Conditionals, Logical Operators and Switch Statements
        System.out.println("Part 4: Using Conditionals, Logic Operators and Switch Statements ----");

        int scoreTestOne = 50;
        int scoreTestTwo = 86;
        int scoreTestThree = 98;

        int averageScore = (scoreTestOne + scoreTestTwo + scoreTestThree) / 3;

        if(averageScore > 90){
            System.out.println("Excellent");
        }else if (averageScore > 70){
            System.out.println("Good");
        }else if (averageScore > 50){
            System.out.println("Average");
        }else {
            System.out.println("Poor");
        }

        int day = 3;
        String dayString = "";

        switch(day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
        }

        System.out.println(dayString);
    }
}
