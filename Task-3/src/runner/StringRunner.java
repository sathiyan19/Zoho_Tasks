package runner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.InvalidArgumentException;
import exception.SmallStringException;
import task.StringTask;

public class StringRunner{
	public static void main(String args[]){
		StringTask taskObject=new StringTask();
		int option;
		Scanner scanner =new Scanner(System.in);
		boolean flag=true;
		String str,compareStr;
		char character;
		while(flag){
			System.out.print("\nEnter Option:");
			option=scanner.nextInt();
			scanner.nextLine();
			switch (option) {
				case 1:
					if(args.length!=0){
						try {
							System.out.println("String Length: "+taskObject.findLength(args[0]));
						} catch (InvalidArgumentException e) {
							System.out.println(e.getMessage());
						}
					}else{
						System.out.println("Give String as Command Line argument");
					}
					break;

				case 2:
					System.out.print("Enter String: ");
					str=scanner.next();
					try{
						char[] charArray=taskObject.toCharacterArray(str);
						if(charArray.length>0){
							for(int i=0;i<charArray.length-1;i++){
								System.out.print(charArray[i]+",");
							}
							System.out.println(charArray[charArray.length-1]);
						}
					}catch(InvalidArgumentException e){
						System.out.println(e.getMessage());
					}
					break;

				case 3:
					try {
						System.out.print("Enter String: ");
						str=scanner.next();
						System.out.println("Penultimate character: "+taskObject.getPenultimateChar(str));
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}catch (SmallStringException e) {
						System.out.println(e.getMessage());
						System.out.println("Can't find Penultimate character as string is less than 2 characters.");
					}
					break;

				case 4:
					System.out.print("Enter String: ");
					str=scanner.next();
					scanner.nextLine();
					System.out.print("Enter Charater: ");
					character=scanner.nextLine().charAt(0);
					try {
						System.out.println("Count: "+taskObject.getOccuranceCount(str,character));
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 5:
					System.out.print("Enter String: ");
					str=scanner.next();
					scanner.nextLine();
					System.out.print("Enter Charater: ");
					character=scanner.nextLine().charAt(0);
					try {
						System.out.println("Index: "+taskObject.getLastOccurance(str,character));
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 6:
					System.out.print("Enter String: ");
					str=scanner.next();
					try {
						System.out.println("Last 5 characters: "+taskObject.getLastSpecifiedCharacters(str,5));
					} catch (SmallStringException e) {
						System.out.println(e.getMessage());
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 7:
					System.out.print("Enter String: ");
					str=scanner.next();
					try {
						System.out.println("First 3 characters: "+taskObject.getFirstSpecifiedCharacters(str,3));
					} catch (SmallStringException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 8:
					System.out.print("Enter String: ");
					str=scanner.next();
					try {
						System.out.println("Replaced String: "+taskObject.replaceThreeCharacters(3, str,"XYZ"));
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					} catch (SmallStringException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 9:
					System.out.print("Enter String: ");
					str=scanner.next();
					try {
						System.out.println("Check: "+taskObject.checkStartsWith(str,"ent"));
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 10:
					System.out.print("Enter String: ");
					str=scanner.next();
					try {
						System.out.println("Check: "+taskObject.checkEndsWith(str,"le"));
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 11:
					System.out.print("Enter String: ");
					str=scanner.next();
					try {
						System.out.println("Uppercase String: "+taskObject.convertToUpper(str));
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 12:
					System.out.print("Enter String: ");
					str=scanner.next();
					try {
						System.out.println("Lowercase String: "+taskObject.convertToLower(str));
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 13:
					System.out.print("Enter String: ");
					str=scanner.next();
					try {
						System.out.println("Reversed String: "+taskObject.reverseString(str));
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 14:
					System.out.print("Enter a Line with Multiple String: ");
					str=scanner.nextLine();
					System.out.println("Strings: ");
					try {
						for(String string: taskObject.acceptMultipleString(str)){
							System.out.println(string);
						}
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 15:
					System.out.print("Enter a Line with Multiple String: ");
					str=scanner.nextLine();
					try {
						System.out.println("Concatenated String: "+taskObject.concatWithDelimiter(str));
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 16:
					System.out.print("Enter a Line with Multiple String: ");
					str=scanner.nextLine();
					System.out.print("{");
					String[] strings;
					try {
						strings = taskObject.splitString(str," ");
						for (int i = 0; i < strings.length; i++) {
							System.out.print("\"" + strings[i] + "\"");
							if (i < strings.length - 1) {
								System.out.print(",");
							}
						}
						System.out.println("}");
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					
					break;

				case 17:
					System.out.print("Enter Number of String: ");
					int numOfStrings=scanner.nextInt();
					scanner.nextLine();
					List<String> stringList=new ArrayList<>();
					for(int i=0;i<numOfStrings;i++){
						System.out.print("String "+(i+1)+": ");
						stringList.add(scanner.nextLine());
					}
					try {
						System.out.println("Merged String: "+taskObject.mergeStrings(stringList,"-"));
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 18:
					System.out.print("Enter String 1: ");
					str=scanner.nextLine();
					System.out.print("Enter String 2: ");
					compareStr=scanner.nextLine();
					try {
						System.out.println("Case Sensitive Comparison: "+taskObject.compareStrings(str, compareStr));
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 19:
					System.out.print("Enter String 1: ");
					str=scanner.nextLine();
					System.out.print("Enter String 2: ");
					compareStr=scanner.nextLine();
					try {
						System.out.println("Case Sensitive Comparison: "+taskObject.compareStringsIgnoreCase(str, compareStr));
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 20:
					System.out.print("Enter String: ");
					str=scanner.nextLine();
					try {
						System.out.println("Trimmed: "+taskObject.trimString(str));
					} catch (InvalidArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 21:
					flag=false;
					break;
			
				default:
					System.out.println("Enter valid option...");
					break;
			}
		}
		scanner.close();
	}
}