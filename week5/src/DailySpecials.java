
import java.util.Scanner;

public class DailySpecials {
    public static void main(String[] args ) {
        String specials;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day of the week excluding (Monday - Friday only!)");

        specials = input.next();

        String coffee = null;
        double price = 0;
        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if(saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }

        switch (specials) {
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Tuesday" -> {
                coffee = "Frapp";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Wednesday" -> {
                coffee = "Cappucino";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 56.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            default -> {
                System.out.println("Please enter a weekday,or check your spelling!");
                specials = input.next();
            }

        }

        System.out.println("How many " + coffee + " would you like to order?");
        int number = input.nextInt();
        double money= number * price;

        switch (number) {
            case 0:{
                System.out.println("Looks like you don't like " + coffee + ", so sad!");
            }
            case 1:{
                System.out.println("Looks like you will be ordering only one " + coffee + " today!");
            }
            default:{
                System.out.print(number + " " + coffee +" have been ordered totalling $");
                System.out.printf("%.2f",money);
                System.out.print(" dollars!");
            }
        }



//        if (number == 0){
//            System.out.println("Looks like you don't like " + coffee + ", so sad!");
//        } else if (number == 1) {
//            System.out.println("Looks like you will be ordering only one " + coffee + " today!");
//        } else if (number >= 1) {
//            System.out.println(number + " " + coffee +" have been ordered totalling $" +money + " dollars!");
//        }



        }

    }

