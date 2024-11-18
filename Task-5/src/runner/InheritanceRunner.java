package runner;

import java.util.Scanner;

import cars.SCross;
import cars.Swift;

public class InheritanceRunner {
    public static void main(String[] args){
        try (Scanner scanner=new Scanner(System.in)) {
            InheritanceRunner runnerObject=new InheritanceRunner();
            int option;
            boolean flag=true;
            String strVal;
            int intVal;
            
            while (flag) {
                System.out.print("\nEnter Option: ");
                option=scanner.nextInt();
				scanner.nextLine();
                switch (option) {
                    case 1:
                        Swift swiftCar=new Swift();

                        System.out.print("Enter number of Airbags: ");
                        intVal=scanner.nextInt();
                        scanner.nextLine();
                        swiftCar.setAirbags(intVal);
                        System.out.print("Enter number of Seats: ");
                        intVal=scanner.nextInt();
                        scanner.nextLine();
                        swiftCar.setSeats(intVal);

                        System.out.print("Enter model: ");
                        strVal=scanner.nextLine();
                        swiftCar.setModel(strVal);
                        System.out.print("Enter color: ");
                        strVal=scanner.nextLine();
                        swiftCar.setColor(strVal);

                        System.out.println("\nAirbags: "+swiftCar.getAirbags());
                        System.out.println("Seats: "+swiftCar.getSeats());
                        System.out.println("Model: "+swiftCar.getModel());
                        System.out.println("Color: "+swiftCar.getColor());
                        break;

                    case 2:
                        SCross scrossCar=new SCross();

                        System.out.print("Enter number of Airbags: ");
                        intVal=scanner.nextInt();
                        scanner.nextLine();
                        scrossCar.setAirbags(intVal);
                        System.out.print("Enter number of Seats: ");
                        intVal=scanner.nextInt();
                        scanner.nextLine();
                        scrossCar.setSeats(intVal);
                        System.out.print("Enter year of make: ");
                        intVal=scanner.nextInt();
                        scanner.nextLine();
                        scrossCar.setYearOfMake(intVal);

                        System.out.print("Enter model: ");
                        strVal=scanner.nextLine();
                        scrossCar.setModel(strVal);
                        System.out.print("Enter color: ");
                        strVal=scanner.nextLine();
                        scrossCar.setColor(strVal);
                        System.out.print("Enter Engine number: ");
                        strVal=scanner.nextLine();
                        scrossCar.setEngineNumber(strVal);
                        System.out.print("Enter Type: ");
                        strVal=scanner.nextLine();
                        scrossCar.setType(strVal);

                        System.out.println("\nAirbags: "+scrossCar.getAirbags());
                        System.out.println("Seats: "+scrossCar.getSeats());
                        System.out.println("Model: "+scrossCar.getModel());
                        System.out.println("Color: "+scrossCar.getColor());
                        System.out.println("Year Of: "+scrossCar.getYearOfMake());
                        System.out.println("Engine Number: "+scrossCar.getEngineNumber());
                        System.out.println("Type: "+scrossCar.getType());

                        break;
                
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
