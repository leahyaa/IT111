import java.util.Scanner;

public class Specials2 {
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

        switch (number) {
            case 0: {
                System.out.println("Looks like you don't like " + coffee + ", so sad!");
            }
            case 1: {
                System.out.println("Looks like you will be ordering only one " + coffee + " today!");
            }
            default: {
                System.out.print(number + " " + coffee + " have been ordered totalling $");
                System.out.printf("%.2f", money);
                System.out.print(" dollars!");
            }
        }
    }
}
