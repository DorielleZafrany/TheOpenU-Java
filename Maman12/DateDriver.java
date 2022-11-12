import java.util.Scanner;

public class DateDriver {
    /**
     * This program will use the Date class. It will receive a date (day, month,year)
     * from the user. It will compare and change the dates through the program.
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program demonstrates the usage of Date class.");
        System.out.println("Please enter the day, month, year of the first date");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        Date d1 = new Date(day, month, year); 
        Date d2 = new Date(d1.getDay(), d1.getMonth(), d1.getYear());
        
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);
        
        if (d1.equals(d2)) { 
            System.out.println("Same Date");
        } else {
            System.out.println("Different Dates");
        }
        
        d1.setMonth(3);
        System.out.println("New month for d1: " + d1.getMonth());
        
        d2.setYear(d2.getYear() + 1);
        System.out.println("New year for d2: " + d2.getYear());
        System.out.println("New d2 Date = " + d2.getDay() + "." + d2.getMonth() + "." + d2.getYear());
        
        if (d1.equals(d2)) {
            System.out.println("Same Date");
        }
        
        else if (d1.before(d2)) {
            System.out.println(d1);
            System.out.println(d2);
        }
        
        else {
            System.out.println(d2);
            System.out.println(d1);
        }
        scanner.close();
    } // end of method main
} // end of class DateDriver
