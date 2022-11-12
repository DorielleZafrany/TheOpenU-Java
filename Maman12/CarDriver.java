import java.util.Scanner;

public class CarDriver
{
    final static private int DEFAULT_ID = 9999999;
    final static private int ID_MIN = 1000000;
    final static private int INDEX_MIN = 0;
    final static private char DEFAULT_TYPE = 'A';
    
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the car's details:");
        
        int id = scanner.nextInt();
        if( id < 1000000)
        {
            id= DEFAULT_ID;
        }
        scanner.nextLine();
        
        String temp = scanner.nextLine();
        char type;
        if (temp.equals("A") || temp.equals("B") || temp.equals("C") || temp.equals("D")) {
            type = temp.charAt(0);
        }
        else {
            type = DEFAULT_TYPE;
        }
        
        String brand = scanner.nextLine();
        boolean isManual = scanner.nextBoolean();
        
        Car c1 = new Car(id, type, brand, isManual);
        
        System.out.println("Please enter the second car's details:");
        id = scanner.nextInt();
        scanner.nextLine();
        if( id < 1000000)
        {
            id= DEFAULT_ID;
        }
        scanner.nextLine();
        
        temp = scanner.nextLine();
        if (temp.equals("A") || temp.equals("B") || temp.equals("C") || temp.equals("D")) {
            type = temp.charAt(0);
        } 
        else {
            type = DEFAULT_TYPE;
        }
        
        
        Car c2 = new Car(id, type, brand, isManual);
        System.out.println("c1 is " + c1);
        System.out.println("c2 is " + c2);
        
        if ((c1.getType() == c2.getType()) && (c1.getBrand() == c2.getBrand()) && (c1.IsManual() == c2.IsManual())) {
            System.out.println("Same car");
        }
        else {
            System.out.println("Different car");
        }
        
        c1.setIsManual(c1.IsManual());
        System.out.println("c1 new isManual is " + c1.IsManual());
        
        if (c1.better(c2)) {
            System.out.println("Better car:\n" + c1);
        } else if (c2.better(c1)) {
            System.out.println("Better car:\n" + c2);
        }
        scanner.close();
    }
}
