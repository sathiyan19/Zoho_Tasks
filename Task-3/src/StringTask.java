package task;

import java.util.*;

public class StringTask{
	public int findLength(String str){
		return str.length();
	}

	public char[] toCharacterArray(String str){
		return str.toCharArray();
	}

	public char getPenultimateChar(String str){
		return str.charAt(str.length()-2);
	}

	public int getOccuranceCount(String str, char character){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==character){
				count++;
			}
		}
		return count;
	}

	public int getLastOccurance(String str, char character){
		return str.lastIndexOf(character);
	}

	public String getLastFiveCharacters(String str){
		return str.substring(str.length()-5);
	}

	public String getFirstThreeCharacters(String str){
		return str.substring(0, 3);
	}

	public String replaceThreeCharacters(String str){
		return str.replaceFirst("^.{3}", "XYZ");
	}

	public boolean checkStartsWith(String str){
		return str.startsWith("ent");
	}

	public boolean checkEndsWith(String str){
		return str.endsWith("le");
	}

	public String convertToUpper(String str){
		return str.toUpperCase();
	}

	public String convertToLower(String str){
		return str.toLowerCase();
	}

	public String reverseString(String str){
		String result="";
		for(int i=str.length()-1;i>=0;i--){
			result+=str.charAt(i);
		}
		return result;
	}

	public String[] acceptMultipleString(String str){
		return str.split(" ");
	}

	public String concatWithDelimiter(String str){
		String[] strings=str.split(" ");
		return String.join("", strings);
	}

	public String[] toStringArray(String str){
		return str.split(" ");
	}

	public String mergeStrings(List<String> strings){
		return String.join("-", strings);
	}

	public boolean compareStrings(String str1, String str2){
		return str1.equals(str2);
	}

	public boolean compareStringsIgnoreCase(String str1, String str2){
		return str1.equalsIgnoreCase(str2);
	}

	public String trimString(String str){
		return str.trim();
	}

}