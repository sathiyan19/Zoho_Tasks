package task;

import java.util.*;

import exception.*;

public class StringTask{
	public void checknull(Object o)throws InvalidArgumentException{
		if(o==null){
			throw new InvalidArgumentException("Argument is null");
		}
	}
	public int findLength(String str) throws InvalidArgumentException{
		checknull(str);
		return str.length();
	}

	public char[] toCharacterArray(String str) throws InvalidArgumentException{
		checknull(str);
		return str.toCharArray();
	}

	public char getPenultimateChar(String str) throws InvalidArgumentException,SmallStringException{
		checknull(str);
		if(findLength(str)<2){
			throw new SmallStringException();
		}
		return str.charAt(findLength(str)-2);
	}

	public int getOccuranceCount(String str, char character) throws InvalidArgumentException{
		checknull(str);
		int count=0;
		int length=findLength(str);
		for(int i=0;i<length;i++){
			if(str.charAt(i)==character){
				count++;
			}
		}
		return count;
	}

	public int getLastOccurance(String str, char character) throws InvalidArgumentException{
		checknull(str);
		return str.lastIndexOf(character);
	}

	public String getLastSpecifiedCharacters(String str, int numOfCharacters) throws SmallStringException, InvalidArgumentException{
		if(numOfCharacters>str.length()){
			throw new SmallStringException();
		}
		return str.substring(findLength(str)-numOfCharacters);
	}

	public String getFirstSpecifiedCharacters(String str,int numOfCharacters) throws SmallStringException{
		if(numOfCharacters>str.length()){
			throw new SmallStringException();
		}
		return str.substring(0, numOfCharacters);
	}

	public String replaceThreeCharacters(int num,String str, String replaceWith)throws InvalidArgumentException, SmallStringException{
		// checknull(str);
		checknull(replaceWith);
		if(num>findLength(str)){
			throw new SmallStringException();
		}
		String regex = "^.{" + num + "}";
		return str.replaceFirst(regex, replaceWith);
	}

	public boolean checkStartsWith(String str, String prefix) throws InvalidArgumentException{
		checknull(str);
		checknull(prefix);
		return str.startsWith(prefix);
	}

	public boolean checkEndsWith(String str, String suffix) throws InvalidArgumentException{
		checknull(str);
		checknull(suffix);
		return str.endsWith(suffix);
	}

	public String convertToUpper(String str) throws InvalidArgumentException{
		checknull(str);
		return str.toUpperCase();
	}

	public String convertToLower(String str) throws InvalidArgumentException{
		checknull(str);
		return str.toLowerCase();
	}

	public String reverseString(String str) throws InvalidArgumentException{
		int left=0,right=findLength(str)-1;
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

	public String concatWithDelimiter(String str) throws InvalidArgumentException{
		String[] strings=str.split(" ");
		return mergeStrings(Arrays.asList(strings),"");
	}

	public String[] splitString(String str,String delimiter) throws InvalidArgumentException{
		checknull(delimiter);
		checknull(str);
		return str.split(delimiter);
	}

	public String mergeStrings(Iterable<String> strings, String delimiter) throws InvalidArgumentException{
		checknull(delimiter);
		checknull(strings);
		return String.join(delimiter, strings);
	}

	public boolean compareStrings(String str1, String str2) throws InvalidArgumentException{
		checknull(str1);
		checknull(str2);
		return str1.equals(str2);
	}

	public boolean compareStringsIgnoreCase(String str1, String str2) throws InvalidArgumentException{
		checknull(str1);
		checknull(str2);
		return str1.equalsIgnoreCase(str2);
	}

	public String trimString(String str) throws InvalidArgumentException{
		checknull(str);
		return str.trim();
	}

}