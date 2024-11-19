package runner;

import java.util.Scanner;

import bird.BirdAbstract;
import bird.Duck;
import bird.ParrotMod;
import cars.Car;
import cars.SCross;
import cars.Swift;
import cars.XUV;

public class InheritanceRunner {
    public static void main(String[] args){
        try (Scanner scanner=new Scanner(System.in)) {
            InheritanceRunner runnerObject=new InheritanceRunner();
            int option;
            boolean flag=true;
            String strVal;
            int intVal;
            Car car;
            Swift swiftCar;
            SCross scrossCar;
            XUV xuvCar;

            System.out.println("Inheritance:");
			System.out.println("1.Setters and getters for Swift Instance Alone:");
			System.out.println("2.Setters and getters for SCross Instance and Super class");
			System.out.println("3.Identify underlying object type:");
			System.out.println("4.Method accepting Swift object:");
			System.out.println("5.Maintenance methods:");
			System.out.println("6.Overloaded Constructors:");
			System.out.println("7.ParrotMod class:");
			System.out.println("8.Duck class:");
			System.out.println("9.Exit");
            
            while (flag) {
                System.out.print("\nEnter Option: ");
                option=scanner.nextInt();
				scanner.nextLine();
                switch (option) {
                    case 1:
                        swiftCar=new Swift();

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
                        scrossCar=new SCross();

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

                    case 3:
                        swiftCar=new Swift();
                        scrossCar=new SCross();
                        xuvCar=new XUV();
                        System.out.println("\n--Polymorphism-- ");
                        System.out.println("Swift: ");
                        runnerObject.findType(swiftCar);
                        System.out.println("SCross: ");
                        runnerObject.findType(scrossCar);
                        System.out.println("XUV: ");
                        runnerObject.findType(xuvCar);
                        break;
                    
                    case 4:
                        swiftCar=new Swift();
                        runnerObject.acceptSwiftObject(swiftCar);
                        car=new Swift();
                        //runnerObject.acceptSwiftObject(car);
                        scrossCar=new SCross();
                        // runnerObject.acceptSwiftObject(scrossCar);
                        xuvCar=new XUV();
                        // runnerObject.acceptSwiftObject(xuvCar);
                        break;

                    case 5:
                        scrossCar=new SCross();
                        System.out.println("\nSCross Object: ");
                        scrossCar.maintenance();

                        car=new SCross();
                        System.out.println("\nSCross Object in Car Reference: ");
                        car.maintenance();

                        car=new Car();
                        System.out.println("\nCar Object: ");
                        car.maintenance();

                        swiftCar=new Swift(); 
                        System.out.println("\nSwift Object: ");
                        swiftCar.maintenance();
                        break;

                    case 6:
                        System.out.println("\nDefault Constructor:");
                        xuvCar=new XUV();
                        // System.out.println("\nOverloaded Constructor:");
                        // xuvCar=new XUV("Sath");
                        break;

                    case 7:
                        // System.out.println("\nBirdAbstract Object: ");
                        // BirdAbstract birdAbstractObj=new BirdAbstract();
                        ParrotMod parrotModObj=new ParrotMod();
                        System.out.println("\n"+parrotModObj.getName()+" Object: ");
                        parrotModObj.fly();
                        parrotModObj.speak();
                        break;

                    case 8:
                        Duck duck=new Duck();
                        duck.fly();
                        duck.speak();
                        break;

                    case 9:
                        flag=false;
                        break;
                
                    default:
                        System.out.println("Enter Valid option!");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void findType(Car car){
        if(car instanceof Swift){
            System.out.println("Hatch");
        }else if(car instanceof XUV){
            System.out.println("SUV");
        }else if(car instanceof SCross){
            System.out.println("Sedan");
        }
    }

    public void acceptSwiftObject(Swift swiftCar){
        System.out.println("Accepted Swift Object");
    }
}
