import java.util.Scanner;

public class DailySpecialFinal {
    public static void main(String[] args) {
        String specials;
        Scanner input = new Scanner(System.in);

        String coffee = null;
        double price = 0;
        boolean wrongDay = true;

        while(wrongDay) {
            System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");
            specials = input.next();

            switch (specials) {
                case "Monday" -> {
                    wrongDay = false;
                    coffee = "Latte";
                    price = 4.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }
                case "Tuesday" -> {
                    wrongDay = false;
                    coffee = "Frapp";
                    price = 4.35;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }
                case "Wednesday" -> {
                    wrongDay = false;
                    coffee = "Cappucino";
                    price = 5.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }
                case "Thursday" -> {
                    wrongDay = false;
                    coffee = "Regular Joe";
                    price = 2.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }
                case "Friday" -> {
                    wrongDay = false;
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }
            }
        }


        System.out.println("How many " + coffee + " would you like to order?");
        int number = input.nextInt();
        double money = number * price;

        if(number == 0) {
            System.out.println("Looks like you don't like " + coffee + ", so sad!");
        } else if(number > 0 && number <5) {
            System.out.println(number + " " + coffee +" have been ordered totalling $" +money + " dollars!");
        } else if(number >=5 && number <10) {
            double moneyWithDiscount = money * 0.9;
            System.out.print("Looks like you qualify for a group discount! Your regular price is $");
            System.out.printf("%.2f", money);
            System.out.println(" dollars");
            System.out.print("You have ordered " + number + " coffee but will be only charged $");
            System.out.printf("%.2f", moneyWithDiscount);
            System.out.println(" dollars");
        } else if(number >= 10) {
            double moneyWithDiscount = money * 0.8;
            System.out.print("A bigger group discount! Your regular price is $");
            System.out.printf("%.2f", money);
            System.out.println(" dollars");
            System.out.print("You have ordered " + number + " coffee but will be only charged $");
            System.out.printf("%.2f", moneyWithDiscount);
            System.out.println(" dollars");
        }

    }
}
