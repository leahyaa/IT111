public class PersonRegular {
    public static void main(String[] args) {
        // to create our variables
        String firstPersonName = "Cathy";
        String secondPersonName = "Kendall";
        char firstPersonGender = 'F';
        char secondPersonGender = 'M';
        int firstPersonAge = 33;
        int secondPersonAge = 22;
        String firstPersonCar = "Volkswagon Bug";
        String secondPersonCar = "Mustang";
        boolean firstPersonViolations = false;
        boolean secondPersonViolations = true;
        int firstPersonCreditScore = 690;
        int secondPersonCreditScore = 670;

        double monthlyRate1 = 0;
        double monthlyRate2 = 0;

        double adjustedRate1 = 0;
        double adjustedRate2 = 0;




        if(firstPersonViolations == true && firstPersonCreditScore <= 700) {
            monthlyRate1 = 500;
        } else {
            monthlyRate1 = 100;
        }

        if(secondPersonViolations == true && secondPersonCreditScore <= 700) {
            monthlyRate2 = 500;
        } else {
            monthlyRate2 = 100;
        }

        if(firstPersonAge <= 25 && firstPersonGender == 'F') {
            adjustedRate1 = 100;
        } else {
            adjustedRate1 = 0;
        }

        if(secondPersonAge <= 25 && secondPersonGender == 'M') {
            adjustedRate2 = 100;
        } else {
            adjustedRate2 = 0;
        }

        double total1 = monthlyRate1 + adjustedRate1;
        double total2 = monthlyRate2 + adjustedRate2;

        System.out.println("First Person Final Monthly rate( including gender and age): " + total1);
        System.out.println("Second Person Final Monthly rate( including gender and age): " + total2);

    }
}
