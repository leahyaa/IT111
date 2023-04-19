public class litersGallonsConverter {

    public static void main(String[] args) {
        double liters;
        double gallons;
        int counter = 0;

        for(gallons = 1.0; gallons < 100.0; gallons = gallons + 4.0) {
            liters = gallons * 3.79;
            System.out.printf("%.2f",liters);
            if(gallons == 1.0) {
                System.out.println(" Liters = " + gallons + " Gallon");
            } else {
                System.out.println(" Liters = " + gallons + " Gallons");
            }
            counter = counter + 1;
            if(counter % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("We are all done!!!");


    }
}
