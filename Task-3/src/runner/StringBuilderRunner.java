package runner;

import java.util.*;

import exception.CustomException;
import exception.InvalidArgumentException;
import task.StringBuilderTask;
import utility.Utility;

public class StringBuilderRunner {
    StringBuilderTask taskObject=new StringBuilderTask();

    public static void main(String args[]){
        StringBuilderRunner runnerObject=new StringBuilderRunner();
        int option;
        Scanner scanner=new Scanner(System.in);
        boolean flag =true;
        StringBuilder strBuilder;
        String str;
        ArrayList<String> strs=new ArrayList<String>();

        System.out.println("StringBuilder Tasks:");
		System.out.println("1.Add a String");
		System.out.println("2.Add 4 Strings Separated by #");
		System.out.println("3.Insert a String Between 2 Strings");
		System.out.println("4.Delete the first String");
		System.out.println("5.Replace spaces with hyphens");
		System.out.println("6.Reverse");
		System.out.println("7.Delete characters at 6-8");
		System.out.println("8.Replace characters at 6-8");
		System.out.println("9.First index of #");
		System.out.println("10.Last index of #");

        while(flag){
            System.out.print("\nEnter Option:");
			option=scanner.nextInt();
			scanner.nextLine();

            switch (option) {
                case 1:
                    try {
                        strBuilder=runnerObject.getStringBuilder();
                        System.out.println("Initial length: "+Utility.getLength(strBuilder));
                        System.out.print("Enter a String: ");
                        str=scanner.nextLine();
                        strBuilder=runnerObject.addString(strBuilder, str);
                        System.out.println("Length after addition: "+Utility.getLength(strBuilder));
                        System.out.println("Final String: "+strBuilder.toString());
                    } catch (InvalidArgumentException e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }
                    break;
                
                case 2:
                    try {
                        System.out.print("Enter a String: ");
                        str=scanner.nextLine();
                        strBuilder=runnerObject.getStringBuilder(str);
                        System.out.println("Initial length: "+Utility.getLength(strBuilder));
                        strs.clear();
                        for(int i=0;i<4;i++){
                            System.out.print("Enter String "+(i+1)+": ");
                            strs.add(scanner.nextLine());
                        }
                        strBuilder=runnerObject.appendStringsWithHash(strBuilder, strs);
                        System.out.println("Length after addition: "+Utility.getLength(strBuilder));
                        System.out.println("Final String: "+strBuilder.toString());
                    } catch (InvalidArgumentException e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    try {
                        strs.clear();
                        System.out.print("Enter String 1: ");
                        strs.add(scanner.nextLine());
                        System.out.print("Enter String 2: ");
                        strs.add(scanner.nextLine());
                        strBuilder=runnerObject.getStringBuilder(strs, " ");
                        System.out.println("Initial length: "+Utility.getLength(strBuilder));
                        System.out.print("Enter a String: ");
                        str=scanner.nextLine();
                        strBuilder=runnerObject.insertAsSecondString(strBuilder, str);
                        System.out.println("Length after insertion: "+Utility.getLength(strBuilder));
                        System.out.println("Final String: "+strBuilder.toString());
                    } catch (InvalidArgumentException e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    try {
                        strs.clear();
                        System.out.print("Enter String 1: ");
                        strs.add(scanner.nextLine());
                        System.out.print("Enter String 2: ");
                        strs.add(scanner.nextLine());
                        strBuilder=runnerObject.getStringBuilder(strs, " ");
                        System.out.println("Initial length: "+Utility.getLength(strBuilder));
                        strBuilder=runnerObject.deleteFirstString(strBuilder);
                        System.out.println("Length after deletion: "+Utility.getLength(strBuilder));
                        System.out.println("Final String: "+strBuilder.toString());
                    } catch (InvalidArgumentException e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    try {
                        strs.clear();
                        System.out.print("Enter String 1: ");
                        strs.add(scanner.nextLine());
                        System.out.print("Enter String 2: ");
                        strs.add(scanner.nextLine());
                        System.out.print("Enter String 3: ");
                        strs.add(scanner.nextLine());
                        strBuilder=runnerObject.getStringBuilder(strs, " ");
                        System.out.println("Initial length: "+Utility.getLength(strBuilder));
                        strBuilder=runnerObject.replaceSpaceWithHyphen(strBuilder);
                        System.out.println("Length after replacement: "+Utility.getLength(strBuilder));
                        System.out.println("Final String: "+strBuilder.toString());
                    } catch (InvalidArgumentException e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                case 6:
                    try {
                        strs.clear();
                        System.out.print("Enter String 1: ");
                        strs.add(scanner.nextLine());
                        System.out.print("Enter String 2: ");
                        strs.add(scanner.nextLine());
                        System.out.print("Enter String 3: ");
                        strs.add(scanner.nextLine());
                        strBuilder=runnerObject.getStringBuilder(strs, " ");
                        System.out.println("Initial length: "+Utility.getLength(strBuilder));
                        strBuilder=runnerObject.reversBuilder(strBuilder);
                        System.out.println("Length after replacement: "+Utility.getLength(strBuilder));
                        System.out.println("Final String: "+strBuilder.toString());
                    } catch (InvalidArgumentException e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                case 7:
                try {
                    System.out.print("Enter String of min length 10: ");
                    str=scanner.nextLine();
                    while(Utility.getLength(str)<10){
                        System.out.print("Enter String of min length 10: ");
                        str=scanner.nextLine();
                    }
                    strBuilder=runnerObject.getStringBuilder(str);
                    System.out.println("Initial length: "+Utility.getLength(strBuilder));
                    strBuilder=runnerObject.deleteThreeCharacters(strBuilder);
                    System.out.println("Length after deletion: "+Utility.getLength(strBuilder));
                    System.out.println("Final String: "+strBuilder.toString());
                } catch (InvalidArgumentException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
                break;

                case 8:
                try {
                    System.out.print("Enter String of min length 10: ");
                    str=scanner.nextLine();
                    while(Utility.getLength(str)<10){
                        System.out.print("Enter String of min length 10: ");
                        str=scanner.nextLine();
                    }
                    strBuilder=runnerObject.getStringBuilder(str);
                    System.out.println("Initial length: "+Utility.getLength(strBuilder));
                    strBuilder=runnerObject.replaceThreeCharacters(strBuilder);
                    System.out.println("Length after deletion: "+Utility.getLength(strBuilder));
                    System.out.println("Final String: "+strBuilder.toString());
                } catch (InvalidArgumentException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
                break;

                case 9:
                    try {
                        strs.clear();
                        System.out.print("Enter String 1: ");
                        strs.add(scanner.nextLine());
                        System.out.print("Enter String 2: ");
                        strs.add(scanner.nextLine());
                        System.out.print("Enter String 3: ");
                        strs.add(scanner.nextLine());
                        strBuilder=runnerObject.getStringBuilder(strs, "#");
                        System.out.println("Initial length: "+Utility.getLength(strBuilder));
                        System.out.println("First index of #: "+runnerObject.firstIndexOfHash(strBuilder));
                    } catch (InvalidArgumentException e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                case 10:
                    try {
                        strs.clear();
                        System.out.print("Enter String 1: ");
                        strs.add(scanner.nextLine());
                        System.out.print("Enter String 2: ");
                        strs.add(scanner.nextLine());
                        System.out.print("Enter String 3: ");
                        strs.add(scanner.nextLine());
                        strBuilder=runnerObject.getStringBuilder(strs, "#");
                        System.out.println("Initial length: "+Utility.getLength(strBuilder));
                        System.out.println("Last index of #: "+runnerObject.lastIndexOfHash(strBuilder));
                    } catch (InvalidArgumentException e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }
                    break;
                
                case 11:
                    flag=false;
                    break;

                default:
                    System.out.println("Enter valid option...");
                    break;
            }
        }
        scanner.close();
    }

    public StringBuilder getStringBuilder(){
        return taskObject.createStringBuilder();
    }

    public StringBuilder getStringBuilder(String str){
        try {
            return taskObject.createStringBuilder(str);
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
            return new StringBuilder();
        }
    }

    public StringBuilder getStringBuilder(ArrayList<String> strs,String delimiter){
        try {
            return taskObject.createStringBuilder(strs,delimiter);
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
            return new StringBuilder();
        }
    }

    public StringBuilder addString(StringBuilder strBuilder, String str){
        try {
            strBuilder=taskObject.appendString(strBuilder, str);
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
        return strBuilder;
    }

    public StringBuilder appendStringsWithHash(StringBuilder strBuilder,ArrayList<String> strs){
        try {
            strBuilder=taskObject.appendStringsWithDelimiter(strBuilder, strs, "#");
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
        return strBuilder;
    }

    public StringBuilder insertAsSecondString(StringBuilder strBuilder,String str) throws InvalidArgumentException{
        try {
            strBuilder=taskObject.insertStringBetweenStrings(strBuilder, str," ", 1);
        } catch (CustomException e) {
            e.printStackTrace();
        }
        return strBuilder;
    }

    public StringBuilder deleteFirstString(StringBuilder strBuilder) throws InvalidArgumentException{
        try {
            strBuilder=taskObject.deleteSpecifiedString(strBuilder, " ", 1);
        } catch (CustomException e) {
            e.printStackTrace();
        }
        return strBuilder;
    }

    public StringBuilder replaceSpaceWithHyphen(StringBuilder strBuilder) throws InvalidArgumentException{
        strBuilder=taskObject.replaceAllSpecifiedString(strBuilder, " ", "-");
        return strBuilder;
    }

    public StringBuilder reversBuilder(StringBuilder strBuilder) throws InvalidArgumentException{
        strBuilder=taskObject.reverseStringBuilder(strBuilder);
        return strBuilder;
    }

    public int firstIndexOfHash(StringBuilder strbuilder) throws InvalidArgumentException{
        return taskObject.getFirstIndexOf(strbuilder, "#");
    }

    public int lastIndexOfHash(StringBuilder strBuilder) throws InvalidArgumentException{
        return taskObject.getlastIndexOf(strBuilder, "#");
    }

    public StringBuilder deleteThreeCharacters(StringBuilder strBuilder) throws InvalidArgumentException{
        return taskObject.deleteSpecifiedCharacters(strBuilder, 6, 8);
    }

    public StringBuilder replaceThreeCharacters(StringBuilder strBuilder) throws InvalidArgumentException{
        return taskObject.replaceSpecifiedCharacters(strBuilder, 6, 8,"XYZ");
    }
    
}