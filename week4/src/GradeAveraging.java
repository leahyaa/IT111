import java.util.Scanner;

public class GradeAveraging {
    public static void main(String[] args) {
        //ask the end user to input their numberical grades
        int counter = 1;
        int grade;
        double total = 0;
        double average;

        Scanner input = new Scanner(System.in);

        while(counter <= 5) {
            System.out.println("please enter your" + counter + "numerical grade");
            grade = input.nextInt();
            total += grade;
            counter += 1;
        }

        counter -=1;
        String message;
        char letterGrade;

        average = total/counter;

        System.out.println("You have earned an average grade of " + average);

        if(average >= 90 && average <= 100) {
            letterGrade = 'A';
            message = "Excellent work!";
        } else if (average >= 80 && average < 90) {
            letterGrade = 'B';
            message = " Solid work!";
        } else if (average >= 70 && average < 80) {
            letterGrade = 'C';
            message = "More studying necessary";
        } else if (average >= 65 && average < 70) {
            letterGrade = 'D';
            message = "Squeaking by!";
        } else {
            letterGrade = 'F';
            message = "Not a passing grade";
        }
        System.out.println("You have earned the following letter grade of " + letterGrade + ", and here is the message: " + message);

    }
}
