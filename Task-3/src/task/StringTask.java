package task;

import exception.*;
import utility.*;

public class StringTask{

	public char[] toCharacterArray(String str) throws InvalidArgumentException{
		Utility.checkNull(str);
		return str.toCharArray();
	}

	public char getCharAtIndex(String str,int index) throws InvalidArgumentException,SmallStringException{
		Utility.boundaryCheck(str, index);
		return str.charAt(index);
	}

	public int getOccuranceCount(String str, char character) throws InvalidArgumentException{
		int count=0;
		int length=Utility.getLength(str);
		for(int i=0;i<length;i++){
			if(str.charAt(i)==character){
				count++;
			}
		}
		return count;
	}

	public int getLastOccurance(String str, char character) throws InvalidArgumentException{
		Utility.checkNull(str);
		return str.lastIndexOf(character);
	}

	public String getLastSpecifiedCharacters(String str, int numOfCharacters) throws SmallStringException, InvalidArgumentException{
		Utility.boundaryCheck(str, numOfCharacters);
		return str.substring(Utility.getLength(str)-numOfCharacters);
	}

	public String getFirstSpecifiedCharacters(String str,int numOfCharacters) throws SmallStringException, InvalidArgumentException{
		Utility.boundaryCheck(str, numOfCharacters);
		return str.substring(0, numOfCharacters);
	}

	public String replaceThreeCharacters(int num,String str, String replaceWith)throws InvalidArgumentException, SmallStringException{
		// Utility.checkNull(str);
		Utility.checkNull(replaceWith);
		Utility.boundaryCheck(str, num);
		String regex = "^.{" + num + "}";
		return str.replaceFirst(regex, replaceWith);
	}

	public boolean checkStartsWith(String str, String prefix) throws InvalidArgumentException{
		Utility.checkNull(str);
		Utility.checkNull(prefix);
		return str.startsWith(prefix);
	}

	public boolean checkEndsWith(String str, String suffix) throws InvalidArgumentException{
		Utility.checkNull(str);
		Utility.checkNull(suffix);
		return str.endsWith(suffix);
	}

	public String convertToUpper(String str) throws InvalidArgumentException{
		Utility.checkNull(str);
		return str.toUpperCase();
	}

	public String convertToLower(String str) throws InvalidArgumentException{
		Utility.checkNull(str);
		return str.toLowerCase();
	}

	public String reverseString(String str) throws InvalidArgumentException{
		int left=0,right=Utility.getLength(str)-1;
		char[] characters=toCharacterArray(str);
		while(left<right){
			char tempCharacter=characters[left];
			characters[left]=characters[right];
			characters[right]=tempCharacter;
			left++;
			right--;
		}
		return new String(characters);
	}

	public String[] acceptMultipleString(String str) throws InvalidArgumentException{
		return splitString(str, " ");
	}

	public String mergeStrings(String str) throws InvalidArgumentException{
		String[] strings=splitString(str," ");
		return concatWithDelimiter(strings,"");
	}

	public String[] splitString(String str,String delimiter) throws InvalidArgumentException{
		Utility.checkNull(delimiter);
		Utility.checkNull(str);
		return str.split(delimiter);
	}

	public String concatWithDelimiter(String[] strings, String delimiter) throws InvalidArgumentException{
		return Utility.concatStringsWithDelimiter(strings, delimiter);
	}
	public String concatWithDelimiter(Iterable<String> strings, String delimiter) throws InvalidArgumentException{
		return Utility.concatStringsWithDelimiter(strings, delimiter);
	}

	public boolean compareStrings(String str1, String str2) throws InvalidArgumentException{
		Utility.checkNull(str1);
		Utility.checkNull(str2);
		return str1.equals(str2);
	}

	public boolean compareStringsIgnoreCase(String str1, String str2) throws InvalidArgumentException{
		Utility.checkNull(str1);
		Utility.checkNull(str2);
		return str1.equalsIgnoreCase(str2);
	}

	public String trimString(String str) throws InvalidArgumentException{
		Utility.checkNull(str);
		return str.trim();
	}

}