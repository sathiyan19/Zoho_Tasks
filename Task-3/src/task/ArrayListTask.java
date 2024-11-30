package task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import exception.*;
import utility.*;

public class ArrayListTask {

    public <T> List<T> createList(){
        return new ArrayList<>();
    }

    public <T> List<T> appendElement(List<T> list,T element) throws InvalidArgumentException{
        Utility.checkNull(list);
        list.add(element);
        return list;
    }

    public <T> List<T> appendElements(List<T> list,T[] elements) throws InvalidArgumentException{
        Utility.checkNull(list);
        Utility.checkNull(elements);
        for(int i=0;i<elements.length;i++){
            list.add(elements[i]);
        }
        return list;
    }

    public <T> int findElement(List<T> list, T element) throws InvalidArgumentException{
        Utility.checkNull(list);

        return list.indexOf(element);
    }

    public <T> Iterator<T> getIterator(List<T> list) throws InvalidArgumentException{
        Utility.checkNull(list);
        return list.iterator();
    }

    public <T> T elementAt(List<T> list, int index) throws InvalidArgumentException, CustomException{
        Utility.checkNull(list);
        if(index>=Utility.getLength(list) || index<0){
            throw new CustomException("Index not in Range");
        }
        return list.get(index);
    }

    public <T> int getFirstIndexOf(List<T> list, T element)throws InvalidArgumentException{
        Utility.checkNull(list);
        return list.indexOf(element);
    }

    public <T> int getLastIndexOf(List<T> list, T element)throws InvalidArgumentException{
        Utility.checkNull(list);
        return list.lastIndexOf(element);
    }

    public <T> List<T> insertElementAt(List<T> list, T element,int index)throws InvalidArgumentException, CustomException{
        Utility.checkNull(list);
        if(index>=Utility.getLength(list) || index<0){
            throw new CustomException("Index not in Range");
        }
        list.add(index, element);
        return list;
    }

    public <T> List<T> getSubList(List<T> list, int from,int to) throws InvalidArgumentException, CustomException{
        Utility.checkNull(list);
        if(from>=Utility.getLength(list) || from<0 || to>=Utility.getLength(list) || to<0){
            throw new CustomException("Index not in Range");
        }

        return list.subList(from, to);
    }

    public <T> List<T> combineLists(List<T> list1, List<T> list2)throws InvalidArgumentException{
        Utility.checkNull(list1);
        Utility.checkNull(list2);
        list1.addAll(list2);
        return list1;
    }

    public <T> List<T> removeElementAt(List<T> list, int index)throws InvalidArgumentException{
        Utility.checkNull(list);
        list.remove(index);
        return list;
    }

    public <T> List<T> removeFromCollection(List<T> list1, List<T> list2) throws InvalidArgumentException{
        Utility.checkNull(list1);
        Utility.checkNull(list2);

        list1.removeAll(list2);
        return list1;
    }

    public <T> List<T> retainFromCollection(List<T> list1, List<T> list2) throws InvalidArgumentException{
        Utility.checkNull(list1);
        Utility.checkNull(list2);

        list1.retainAll(list2);
        return list1;
    }

    public <T> List<T> removeAllElements(List<T> list)throws InvalidArgumentException{
        Utility.checkNull(list);
        list.clear();
        return list;
    }

    public <T> boolean checkElementPresence(List<T> list, T element)throws InvalidArgumentException{
        Utility.checkNull(element);
        Utility.checkNull(list);

        return list.contains(element);
    }


}
