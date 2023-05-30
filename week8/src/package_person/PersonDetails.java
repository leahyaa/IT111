package package_person;


public class PersonDetails {
    // this file will have a main method
    public static void main(String[] args) {

        Person firstPerson;
        Person secondPerson;

        //in the process of creating on object from my person class

        firstPerson = new Person();
        secondPerson = new Person();
        // we will be entering the info, assigning values to our fields

        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = "Volkswagon Bug";
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall";
        secondPerson.gender ='M';
        secondPerson.age = 22 ;
        secondPerson.car = "Mustang";
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        double monthlyRate = 0;
        double adjustedRate = 0;

        firstPerson.display();
        System.out.println("Preliminary Rate for " + firstPerson.name + ": " + firstPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " + firstPerson.name + ": " + firstPerson.assumeGender(adjustedRate));
        System.out.print("Here is " + firstPerson.name +  "'s total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate));

        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " + secondPerson.name + ": " + secondPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " + secondPerson.name + ": " + secondPerson.assumeGender(adjustedRate));
        System.out.print("Here is " + secondPerson.name +  "'s total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate));

    }
}
