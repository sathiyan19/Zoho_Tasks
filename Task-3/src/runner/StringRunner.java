package runner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.InvalidArgumentException;
import exception.SmallStringException;
import task.StringTask;
import utility.Utility;

public class StringRunner{
	StringTask taskObject=new StringTask();
	public static void main(String args[]){
		StringRunner runnerObject=new StringRunner();
		int option;
		Scanner scanner =new Scanner(System.in);
		boolean flag=true;
		String str,compareStr;
		char character;
		System.out.println("String:");
		System.out.println("1.Find Length");
		System.out.println("2.Into Character Array");
		System.out.println("3.Get Penultimate Character");
		System.out.println("4.Number of occurrences of a given Character");
		System.out.println("5.Greatest position of a given Character");
		System.out.println("6.Get last 5 characters");
		System.out.println("7.Get first 3 characters");
		System.out.println("8.Replace first 3 characters with \"XYZ\"");
		System.out.println("9.Check whether a String starts with \"ent\"");
		System.out.println("10.Check whether a String ends with \"le\"");
		System.out.println("11.To Uppercase");
		System.out.println("12.To Lowercase");
		System.out.println("13.To Reverse a String");
		System.out.println("14.To Accept a line with Multiple Strings");
		System.out.println("15.Concatenate strings without space");
		System.out.println("16.Into String Array");
		System.out.println("17.Merge with \"-\"");
		System.out.println("18.Check Strings(Case-Sensitive)");
		System.out.println("19.Check Strings(Case-Insensitive)");
		System.out.println("20.Trim Strings");
		while(flag){
			System.out.print("\nEnter Option:");
			option=scanner.nextInt();
			scanner.nextLine();
			switch (option) {
				case 1:
					if(args.length!=0){
						try {
							System.out.println("String Length: "+Utility.getLength(args[0]));
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
					runnerObject.intoCharArray(str);
					break;

				case 3:
					System.out.print("Enter String: ");
					str=scanner.next();
					runnerObject.getPenultimateChar(str);
					break;

				case 4:
					System.out.print("Enter String: ");
					str=scanner.next();
					scanner.nextLine();
					System.out.print("Enter Charater: ");
					character=scanner.nextLine().charAt(0);
					runnerObject.getCharCount(str, character);
					break;

				case 5:
					System.out.print("Enter String: ");
					str=scanner.next();
					scanner.nextLine();
					System.out.print("Enter Charater: ");
					character=scanner.nextLine().charAt(0);
					runnerObject.greatestPositionOfChar(str, character);
					break;

				case 6:
					System.out.print("Enter String: ");
					str=scanner.next();
					runnerObject.getLastFiveChars(str);
					break;

				case 7:
					System.out.print("Enter String: ");
					str=scanner.next();
					runnerObject.getFirstThreeChars(str);
					break;

				case 8:
					System.out.print("Enter String: ");
					str=scanner.next();
					runnerObject.replaceFirstThreeChars(str);
					break;

				case 9:
					System.out.print("Enter String: ");
					str=scanner.next();
					runnerObject.startsWithEnt(str);
					break;

				case 10:
					System.out.print("Enter String: ");
					str=scanner.next();
					runnerObject.endsWithEr(str);
					break;

				case 11:
					System.out.print("Enter String: ");
					str=scanner.next();
					runnerObject.toUpperCase(str);
					break;

				case 12:
					System.out.print("Enter String: ");
					str=scanner.next();
					runnerObject.toLowerCase(str);
					break;

				case 13:
					System.out.print("Enter String: ");
					str=scanner.next();
					runnerObject.reverseString(str);
					break;

				case 14:
					System.out.print("Enter a Line with Multiple String: ");
					str=scanner.nextLine();
					runnerObject.acceptStrings(str);
					break;

				case 15:
					System.out.print("Enter a Line with Multiple String: ");
					str=scanner.nextLine();
					runnerObject.mergeStrings(str);
					break;

				case 16:
					System.out.print("Enter a Line with Multiple String: ");
					str=scanner.nextLine();
					System.out.print("{");
					runnerObject.splitString(str);
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
					runnerObject.concatStrings(stringList);
					break;

				case 18:
					System.out.print("Enter String 1: ");
					str=scanner.nextLine();
					System.out.print("Enter String 2: ");
					compareStr=scanner.nextLine();
					runnerObject.compareStrings(str,compareStr);
					break;

				case 19:
					System.out.print("Enter String 1: ");
					str=scanner.nextLine();
					System.out.print("Enter String 2: ");
					compareStr=scanner.nextLine();
					runnerObject.compareStringsIgnoreCase(str, compareStr);
					break;

				case 20:
					System.out.print("Enter String: ");
					str=scanner.nextLine();
					runnerObject.trimString(str);
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
	public void intoCharArray(String str){
		try{
			char[] charArray=taskObject.toCharacterArray(str);
			if(charArray.length>0){
				for(int i=0;i<charArray.length-1;i++){
					System.out.print(charArray[i]+",");
				}
				System.out.println(charArray[charArray.length-1]);
			}
		}catch(InvalidArgumentException e){
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void getPenultimateChar(String str){
		try {
			System.out.println("Penultimate character: "+taskObject.getCharAtIndex(str,str.length()-2));
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}catch (SmallStringException e) {
			throw new RuntimeException("Can't find Penultimate character as string is less than 2 characters",e);
		}
	}

	public void getCharCount(String str, char character){
		try {
			System.out.println("Count: "+taskObject.getOccuranceCount(str,character));
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void greatestPositionOfChar(String str, char character){
		try {
			System.out.println("Index: "+taskObject.getLastOccurance(str,character));
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void getLastFiveChars(String str){
		try {
			System.out.println("Last 5 characters: "+taskObject.getLastSpecifiedCharacters(str,5));
		} catch (SmallStringException e) {
			throw new RuntimeException(e);
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void getFirstThreeChars(String str){
		try {
			System.out.println("First 3 characters: "+taskObject.getFirstSpecifiedCharacters(str,3));
		} catch (SmallStringException e) {
			throw new RuntimeException(e);
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void replaceFirstThreeChars(String str){
		try {
			System.out.println("Replaced String: "+taskObject.replaceThreeCharacters(3, str,"XYZ"));
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		} catch (SmallStringException e) {
			throw new RuntimeException(e);
		}
	}

	public void startsWithEnt(String str){
		try {
			System.out.println("Check: "+taskObject.checkStartsWith(str,"ent"));
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void endsWithEr(String str){
		try {
			System.out.println("Check: "+taskObject.checkEndsWith(str,"le"));
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void toUpperCase(String str){
		try {
			System.out.println("Uppercase String: "+taskObject.convertToUpper(str));
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void toLowerCase(String str){
		try {
			System.out.println("Lowercase String: "+taskObject.convertToLower(str));
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void reverseString(String str){
		try {
			System.out.println("Reversed String: "+taskObject.reverseString(str));
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void acceptStrings(String str){
		System.out.println("Strings: ");
		try {
			for(String string: taskObject.acceptMultipleString(str)){
				System.out.println(string);
			}
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void mergeStrings(String str){
		try {
			System.out.println("Concatenated String: "+taskObject.mergeStrings(str));
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void splitString(String str){
		try {
			String[] strings;
			strings = taskObject.splitString(str," ");
			for (int i = 0; i < strings.length; i++) {
				System.out.print("\"" + strings[i] + "\"");
				if (i < strings.length - 1) {
					System.out.print(",");
				}
			}
			System.out.println("}");
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void concatStrings(List<String> stringList){
		try {
			System.out.println("Merged String: "+taskObject.concatWithDelimiter(stringList,"-"));
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void compareStrings(String str1, String str2){
		try {
			System.out.println("Case Sensitive Comparison: "+taskObject.compareStrings(str1, str2));
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void compareStringsIgnoreCase(String str1, String str2){
		try {
			System.out.println("Case Sensitive Comparison: "+taskObject.compareStringsIgnoreCase(str1, str2));
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

	public void trimString(String str){
		try {
			System.out.println("Trimmed: "+taskObject.trimString(str));
		} catch (InvalidArgumentException e) {
			throw new RuntimeException("Null value passed",e);
		}
	}

}