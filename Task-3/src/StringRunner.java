package runner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
					System.out.println("String Length: "+taskObject.findLength(args[0]));
					break;

				case 2:
					System.out.print("Enter String: ");
					str=scanner.next();
					char[] charArray=taskObject.toCharacterArray(str);
					for(int i=0;i<charArray.length-1;i++){
						System.out.print(charArray[i]+",");
					}
					System.out.println(charArray[charArray.length-1]);
					break;

				case 3:
					System.out.print("Enter String: ");
					str=scanner.next();
					System.out.println("Penultimate character: "+taskObject.getPenultimateChar(str));
					break;

				case 4:
					System.out.print("Enter String: ");
					str=scanner.next();
					scanner.nextLine();
					System.out.print("Enter Charater: ");
					character=scanner.nextLine().charAt(0);
					System.out.println("Count: "+taskObject.getOccuranceCount(str,character));
					break;

				case 5:
					System.out.print("Enter String: ");
					str=scanner.next();
					scanner.nextLine();
					System.out.print("Enter Charater: ");
					character=scanner.nextLine().charAt(0);
					System.out.println("Index: "+taskObject.getLastOccurance(str,character));
					break;

				case 6:
					System.out.print("Enter String: ");
					str=scanner.next();
					System.out.println("Last 5 characters: "+taskObject.getLastFiveCharacters(str));
					break;

				case 7:
					System.out.print("Enter String: ");
					str=scanner.next();
					System.out.println("First 3 characters: "+taskObject.getFirstThreeCharacters(str));
					break;

				case 8:
					System.out.print("Enter String: ");
					str=scanner.next();
					System.out.println("Replaced String: "+taskObject.replaceThreeCharacters(str));
					break;

				case 9:
					System.out.print("Enter String: ");
					str=scanner.next();
					System.out.println("Check: "+taskObject.checkStartsWith(str));
					break;

				case 10:
					System.out.print("Enter String: ");
					str=scanner.next();
					System.out.println("Check: "+taskObject.checkEndsWith(str));
					break;

				case 11:
					System.out.print("Enter String: ");
					str=scanner.next();
					System.out.println("Uppercase String: "+taskObject.convertToUpper(str));
					break;

				case 12:
					System.out.print("Enter String: ");
					str=scanner.next();
					System.out.println("Lowercase String: "+taskObject.convertToLower(str));
					break;

				case 13:
					System.out.print("Enter String: ");
					str=scanner.next();
					System.out.println("Reversed String: "+taskObject.reverseString(str));
					break;

				case 14:
					System.out.print("Enter a Line with Multiple String: ");
					str=scanner.nextLine();
					System.out.println("Strings: ");
					for(String string: taskObject.acceptMultipleString(str)){
						System.out.println(string);
					}
					break;

				case 15:
					System.out.print("Enter a Line with Multiple String: ");
					str=scanner.nextLine();
					System.out.println("Concatenated String: "+taskObject.concatWithDelimiter(str));
					break;

				case 16:
					System.out.print("Enter a Line with Multiple String: ");
					str=scanner.nextLine();
					System.out.print("{");
					String[] strings=taskObject.toStringArray(str);
					for (int i = 0; i < strings.length; i++) {
						System.out.print("\"" + strings[i] + "\"");
						if (i < strings.length - 1) {
							System.out.print(",");
						}
					}
        			System.out.println("}");
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
					System.out.println("Merged String: "+taskObject.mergeStrings(stringList));
					break;

				case 18:
					System.out.print("Enter String 1: ");
					str=scanner.nextLine();
					System.out.print("Enter String 2: ");
					compareStr=scanner.nextLine();
					System.out.println("Case Sensitive Comparison: "+taskObject.compareStrings(str, compareStr));
					break;

				case 19:
					System.out.print("Enter String 1: ");
					str=scanner.nextLine();
					System.out.print("Enter String 2: ");
					compareStr=scanner.nextLine();
					System.out.println("Case Sensitive Comparison: "+taskObject.compareStringsIgnoreCase(str, compareStr));
					break;

				case 20:
					System.out.print("Enter String 1: ");
					str=scanner.nextLine();
					System.out.println("Case Sensitive Comparison: "+taskObject.trimString(str));
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