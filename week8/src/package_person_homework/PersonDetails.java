package package_person_homework;

public class PersonDetails {
    public static void main(String[] args) {

        Person firstPerson;
        Person secondPerson;


        firstPerson = new Person();
        secondPerson = new Person();

        firstPerson.name = "Cathy Jones";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = 2010;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall Black";
        secondPerson.gender ='M';
        secondPerson.age = 22 ;
        secondPerson.car = 2019;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        double monthlyRate = 0;
        double adjustedRate = 0;
        double carRate = 0;

        firstPerson.display();
//        System.out.println("Preliminary Rate for " + firstPerson.name + ": " + firstPerson.getRate(monthlyRate) + " dollars");
//        System.out.println("Adjustments: " + firstPerson.name + ": " + firstPerson.assumeGender(adjustedRate));
//        System.out.println("Car Rate: " + firstPerson.carAge(carRate));

        System.out.print("Here is " + firstPerson.name +  "'s total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate) + firstPerson.assumeGender(adjustedRate));

        System.out.println();

        secondPerson.display();
//        System.out.println("Preliminary Rate for " + secondPerson.name + ": " + secondPerson.getRate(monthlyRate) + " dollars");
//        System.out.println("Adjustments: " + secondPerson.name + ": " + secondPerson.assumeGender(adjustedRate));
//        System.out.println("Car Rate: " + secondPerson.carAge(carRate));

        System.out.print("Here is " + secondPerson.name +  "'s total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate) + secondPerson.carAge(carRate));

    }
}
