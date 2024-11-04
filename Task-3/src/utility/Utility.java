package utility;

import exception.*;

public class Utility {
    public static void checkNull(Object obj) throws InvalidArgumentException{
        if(obj==null){
			throw new InvalidArgumentException("Argument is null");
		}
    }

    public static void boundaryCheck(String str, int index) throws SmallStringException, InvalidArgumentException{
		if(getLength(str)<index || index<0){
			throw new SmallStringException();
		}
	}

    public static int getLength(String str) throws InvalidArgumentException{
		checkNull(str);
		return str.length();
	}

    public static int getLength(StringBuilder strBuilder) throws InvalidArgumentException{
		checkNull(strBuilder);
		return strBuilder.length();
	}
}
