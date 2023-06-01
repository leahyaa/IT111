package package_person;

public class Person {
    // no main method
    // declaring our fields
    String name;
    char gender;
    int age;
    double getBaselineRate;
    String zipCode;
    int cityCode;

    // we have several booleans for our specific violations
    boolean violations;
    boolean violationDUI;
    boolean violationRedLight;
    boolean violationSpeeding;
    double creditScores;

    double baselineRate = 300;

    // now we are going to create a method to display our inputs

    public void display() {
        System.out.println("This is the information that you had provide.");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(zipCode);
        System.out.println("Baseline rate: " + baselineRate + "dollars");
        System.out.println("Your baseline rate is calculated without taking into consideration the following: Age, Credit Score, Violations and residence");
        System.out.println("Violations: " + violations);
        System.out.println("DUI Violations: " + violationDUI);
        System.out.println("Red Light Violations: " + violationRedLight);
        System.out.println("Speeding Violations: " + violationSpeeding);
        System.out.println("Credit Score: " + creditScores);

    }

    //create a method - violations and credit score
    // violations or credit score

    public double getRate(double monthlyRate) {
        if(violations == true || creditScores <= 700) {
            monthlyRate = 300.00;
        } else {
            monthlyRate = 0;
        }
        return monthlyRate;
    }

    // new method for age
    // if you are young or older, you will be paying more money
    public double ageCategory(double adjusteRate) {
        if(age <= 25 || age >= 65) {
            adjusteRate = 300.00;
        } else {
            adjusteRate = 0;
        }
        return adjusteRate;
    }

    //our method for states/zipcodes/strings/changing your string to an integer
    public int identifyRegion(int states) {
        // 90-96 ca; 97-or; 98,99 - sea
        String zip2;
        zip2 = zipCode.substring(0,2);
        cityCode = Integer.parseInt(zip2);
        if(cityCode >= 90 && cityCode < 97) {
            System.out.println("You entered" + cityCode + " and you're from California");
        } else if (cityCode >= 97 && cityCode < 98){
            System.out.println("You entered" + cityCode + " and you're from Oregon");
        }
        else if (cityCode >= 98 && cityCode < 99) {
            System.out.println("You entered" + cityCode + " and you're from Washington");
        }else {
            System.out.println("You're not from the PNW, please contact our National Office");
        }
        return states;
    }
    // method to charge a surcharge to people who live in california
    public double californiaRegion(double surcharge) {
        if(cityCode >= 90 && cityCode < 97) {
            surcharge = 200;
        } else {
            surcharge = 0;
        }
        return surcharge;
    }

}
