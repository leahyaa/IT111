package package_person;

import java.util.Scanner;

public class PersonDetails {
    public static void main(String[] args) {
        //we need to create an object
        Person customer;
        customer = new Person();
        int states = 0;
        // we will be initializing additional variables

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name!");
        customer.name = input.next();

        System.out.println("Please enter your age!");
        customer.age = input.nextInt();

        System.out.println("Please enter your gender by entering F or M or N!");
        customer.gender = input.next().charAt(0);

        System.out.println("Please enter your Zipcode(only 5 numbers please!)");
        customer.zipCode = input.next();

        System.out.println("Any traffic violations? Please enter ture for Yes, and false for no");
        customer.violations = input.nextBoolean();
        // add an if else statement
        if(customer.violations == true) {
            System.out.println("Please type true if you had a DUI, or false if not");
            customer.violationDUI = input.nextBoolean();
            System.out.println("Please type true if you had a red light violation or false if not");
            customer.violationRedLight = input.nextBoolean();
            System.out.println("Have your received any speeding tickets? Please type true for yes, or false for no tickets");
            customer.violationSpeeding = input.nextBoolean();

        }
        System.out.println("Please type in your credit score");
        customer.creditScores = input.nextDouble();
        customer.display();
        System.out.println(customer.identifyRegion(states));

        double surcharge = 0;
        System.out.println("Your california surcharge is " + customer.californiaRegion(surcharge));
        double adjustedRate = 0;
        System.out.println("Violations or credit score adjustment " + customer.ageCategory(adjustedRate));
    }
}
