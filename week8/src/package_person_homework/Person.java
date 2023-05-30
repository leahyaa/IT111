package package_person_homework;

public class Person {
    String name;
    int age;
    char gender;
    int car;
    boolean violations;
    double creditScore;


    public void display() {
        System.out.println("Your name: " + name);
//        System.out.println("Your gender: " + gender);
        System.out.println("Your age: " + age);
        System.out.println("Your car: " + car);
        System.out.println("Your violations: " + violations);
        System.out.println("Your Credit score: " + creditScore);
    }

    public double getRate(double monthlyRate) {
        if(violations == true && creditScore <= 700){
            monthlyRate = 500.00;
        } else {
            monthlyRate = 100.00;
        }
        return monthlyRate;
    }

    public double assumeGender(double adjustedRate) {
        if(gender == 'M' && age <= 25) {
            adjustedRate = 100;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }

    public double carAge(double carRate){
        if(car >= 2015) {
            carRate = 100;
        } else {
            carRate = 0;
        }
        return carRate;
    }

}
