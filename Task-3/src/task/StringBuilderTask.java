package task;

import java.util.ArrayList;

import exception.CustomException;
import exception.InvalidArgumentException;
import utility.Utility;

public class StringBuilderTask {
    StringTask stringTaskObj=new StringTask();

    public StringBuilder createStringBuilder(){
        return new StringBuilder();
    }

    public StringBuilder createStringBuilder(String str) throws InvalidArgumentException{
        Utility.checkNull(str);
        return new StringBuilder(str);
    }

    public StringBuilder createStringBuilder(ArrayList<String> strs, String delimiter) throws InvalidArgumentException{
        String str=stringTaskObj.concatWithDelimiter(strs, delimiter);
        return new StringBuilder(str);
    }

    public StringBuilder appendString(StringBuilder strBuilder, String str) throws InvalidArgumentException{
        Utility.checkNull(str);
        Utility.checkNull(strBuilder);
        strBuilder.append(str);
        return strBuilder;
    }

    public StringBuilder appendStringsWithDelimiter(StringBuilder strBuilder, ArrayList<String> strs, String delimiter) throws InvalidArgumentException{
        String str=stringTaskObj.concatWithDelimiter(strs, delimiter);
        Utility.checkNull(strBuilder);
        strBuilder.append(delimiter);
        strBuilder.append(str);
        return strBuilder;
    }

    public StringBuilder insertStringBetweenStrings(StringBuilder strBuilder,String str, String delimiter, int after) throws InvalidArgumentException, CustomException{
        Utility.checkNull(delimiter);
        Utility.checkNull(strBuilder);
        int counter=0;
        int from=0;
        int index=strBuilder.indexOf(delimiter,from);
        while(index!=-1){
            counter++;
            if(counter==after){
                break;
            }
            from=index+1;
            index=strBuilder.indexOf(delimiter,from);
        }
        if(counter+1==after){
            index=strBuilder.length();
        }
        if(after-counter>=2){
            throw new CustomException("No Enough Strings");
        }
        strBuilder=insertStringAt(strBuilder, str, index);
        strBuilder=insertStringAt(strBuilder, delimiter, index);
        return strBuilder;
    }

    public StringBuilder insertStringAt(StringBuilder strBuilder, String str, int index) throws InvalidArgumentException{
        Utility.checkNull(str);
        Utility.checkNull(strBuilder);
        strBuilder.insert(index, str);
        return strBuilder;
    }

    public StringBuilder deleteSpecifiedString(StringBuilder strBuilder,String delimiter,int strNumber) throws CustomException, InvalidArgumentException{
        Utility.checkNull(delimiter);
        Utility.checkNull(strBuilder);
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
        if(index==-1){
            index=strBuilder.length();
        }
        if(counter+1<strNumber){
            throw new CustomException("No Enough Strings");
        }
        strBuilder=deleteStringAt(strBuilder, from, index);
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
}

