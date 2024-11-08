package task;

import java.util.ArrayList;

import exception.CustomException;
import exception.InvalidArgumentException;
import utility.Utility;

public class StringBuilderTask {

    public StringBuilder createStringBuilder(){
        return new StringBuilder();
    }

    public StringBuilder createStringBuilder(String str){
        return new StringBuilder(str);
    }

    public StringBuilder createStringBuilder(ArrayList<String> strs, String delimiter) throws InvalidArgumentException{
        String str=Utility.concatStringsWithDelimiter(strs, delimiter);
        return new StringBuilder(str);
    }

    public StringBuilder appendString(StringBuilder strBuilder, String str) throws InvalidArgumentException{
        Utility.checkNull(strBuilder);
        strBuilder.append(str);
        return strBuilder;
    }

    public StringBuilder appendStringsWithDelimiter(StringBuilder strBuilder, ArrayList<String> strs, String delimiter) throws InvalidArgumentException{
        String str=Utility.concatStringsWithDelimiter(strs, delimiter);
        Utility.checkNull(strBuilder);
        strBuilder.append(delimiter);
        strBuilder.append(str);
        return strBuilder;
    }

    public StringBuilder insertStringBetweenStrings(StringBuilder strBuilder,String str, String delimiter, int after) throws InvalidArgumentException, CustomException{
        int[] endPoints=getSpecifiedStringEndPoints(strBuilder, delimiter, after, true);
        strBuilder=insertStringAt(strBuilder, str, endPoints[1]);
        strBuilder=insertStringAt(strBuilder, delimiter, endPoints[1]);
        return strBuilder;
    }

    public StringBuilder insertStringAt(StringBuilder strBuilder, String str, int index) throws InvalidArgumentException{
        Utility.checkNull(strBuilder);
        strBuilder.insert(index, str);
        return strBuilder;
    }

    public StringBuilder deleteSpecifiedString(StringBuilder strBuilder,String delimiter,int strNumber) throws CustomException, InvalidArgumentException{
        int[] endPoints=getSpecifiedStringEndPoints(strBuilder, delimiter, strNumber, false);
        strBuilder=deleteStringAt(strBuilder, endPoints[0], endPoints[1]);
        return strBuilder;
    }

    public StringBuilder deleteStringAt(StringBuilder strBuilder, int from, int to) throws InvalidArgumentException{
        Utility.checkNull(strBuilder);
        strBuilder=strBuilder.delete(from, to);
        return strBuilder;
    }

    public StringBuilder replaceAllSpecifiedString(StringBuilder strBuilder, String replace, String with) throws InvalidArgumentException{
        Utility.checkNull(with);
        Utility.checkNull(strBuilder);
        int replacedLength=Utility.getLength(replace);
        int from=0;
        int index=strBuilder.indexOf(replace,from);
        while(index!=-1){
            strBuilder=strBuilder.replace(index, index+replacedLength, with);
            from=index+1;
            index=strBuilder.indexOf(replace,from);
        }
        return strBuilder;
    }

    public StringBuilder reverseStringBuilder(StringBuilder strBuilder) throws InvalidArgumentException{
        Utility.checkNull(strBuilder);
        return strBuilder.reverse();
    }

    public StringBuilder deleteSpecifiedCharacters(StringBuilder strBuilder, int from, int to) throws InvalidArgumentException{
        Utility.checkNull(strBuilder);
        strBuilder=strBuilder.delete(from-1, to);
        return strBuilder;
    }

    public StringBuilder replaceSpecifiedCharacters(StringBuilder strBuilder, int from, int to, String with) throws InvalidArgumentException{
        Utility.checkNull(strBuilder);
        Utility.checkNull(with);
        strBuilder=strBuilder.replace(from-1, to,with);
        return strBuilder;
    }

    public int getFirstIndexOf(StringBuilder strBuilder, String toFind) throws InvalidArgumentException{
        Utility.checkNull(toFind);
        Utility.checkNull(strBuilder);
        return strBuilder.indexOf(toFind);
    }

    public int getlastIndexOf(StringBuilder strBuilder, String toFind) throws InvalidArgumentException{
        Utility.checkNull(toFind);
        Utility.checkNull(strBuilder);
        return strBuilder.lastIndexOf(toFind);
    }

    private int[] getSpecifiedStringEndPoints(StringBuilder strBuilder, String delimiter, int strNumber, boolean insertOrDelete) throws CustomException, InvalidArgumentException{
        Utility.checkNull(strBuilder);
        Utility.checkNull(delimiter);
        int counter=0;
        int from=0;
        int index=strBuilder.indexOf(delimiter,from);
        while(index!=-1){
            counter++;
            if(counter==strNumber){
                break;
            }
            from=index+1;
            index=strBuilder.indexOf(delimiter,from);
        }
        if(strNumber-counter>=2){
            throw new CustomException("No Enough Strings");
        }

        if(insertOrDelete){
            if(counter+1==strNumber){
                index=strBuilder.length();
            }
        }else{
            if(index==-1){
                index=strBuilder.length();
            }
        }
        return new int[]{from,index};
    }
}

