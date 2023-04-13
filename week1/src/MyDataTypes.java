public class MyDataTypes {

    public static void main(String[] args){
        short number1 = 32_000;
        int number2 = 3_000_000;
        long number3 = 3_000_000_000L;
        float number4 = 30.99F;
        double number5 = 50.88888888888;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);

        boolean dry = true;
        if(dry){
            System.out.println("Time to hang up those curtains!");
        } else {
            System.out.println("We will have to wait to a spell!");
        }

        char best = 'A';
        System.out.println(++best);

    }
}
