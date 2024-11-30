package runner;

import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

import exception.CustomException;
import exception.InvalidArgumentException;
import task.ArrayListTask;
import utility.CustomObject;
import utility.Utility;

public class ArrayListRunner {
    ArrayListTask taskObject=new ArrayListTask();

    public static void main(String args[]){
        try(Scanner scanner = new Scanner(System.in)) {
			ArrayListRunner runnerObject=new ArrayListRunner();
			int option;
			boolean flag=true;
            List<String> stringList;
            List<String> stringList2;
            List<String> stringList3;
            List<Integer> intList;
            List<CustomObject> customObjectList;
            List<Object> objectList;
            List<Float> floatList;
            List<Long> longList;
            String[] strings;
            Integer[] integers;
            CustomObject[] customObjects;
            Object[] objects;
            Float[] floats;
            Long[] longs;
			
			System.out.println("ArrayList:");
			System.out.println("1.Create ArrayList");
			System.out.println("2.Add 5 Strings to ArrayList");
			System.out.println("3.Add 5 Integers to ArrayList");
			System.out.println("4.Add Custom Objects to ArrayList");
			System.out.println("5.Add 3 Strings, 2 Integers, 2 custom objects to ArrayList");
			System.out.println("6.Find Index");
			System.out.println("7.Print elements using Iterator");
			System.out.println("8.Element at given index");
			System.out.println("9.First and Last position of an element");
			System.out.println("10.Insert at 2nd position");
			System.out.println("11.Get 3rd-8th elements into a new List");
			System.out.println("12.Create a new list from list1 and list2- list1 first");
			System.out.println("13.Create a new list from list1 and list2- list2 first");
			System.out.println("14.Remove 4th element");
			System.out.println("15.Remove elements from list1 which are present in list2");
			System.out.println("16.Remove elements from list1 which are not present in list2");
			System.out.println("17.Clear List");
			System.out.println("18.Check presence of an element");
			while(flag){
				System.out.print("\nEnter Option:");
				option=scanner.nextInt();
				scanner.nextLine();
				switch (option) {
					case 1:
						try {
                            stringList=runnerObject.getList();
                            System.out.println("Length: "+Utility.getLength(stringList));
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
						break;

                    case 2:
                        try {
                            stringList=runnerObject.getList();
                            System.out.println("Enter Strings:");
                            strings=new String[5];
                            for(int i=0;i<5;i++){
                                strings[i]=scanner.nextLine();
                            }
                            stringList=runnerObject.addElement(stringList, strings);
                            System.out.println("List: "+stringList);
                            System.out.println("Length: "+Utility.getLength(stringList));
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 3:
                        try {
                            intList=runnerObject.getList();
                            System.out.println("Enter Integers:");
                            integers=new Integer[5];
                            for(int i=0;i<5;i++){
                                integers[i]=scanner.nextInt();
                                scanner.nextLine();
                            }
                            intList=runnerObject.addElement(intList, integers);
                            System.out.println("List: "+intList);
                            System.out.println("Length: "+Utility.getLength(intList));
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 4:
                        try {
                            customObjectList=runnerObject.getList();
                            System.out.print("Enter number of objects: ");
                            int numOfObjects=scanner.nextInt();
                            scanner.nextLine();
                            customObjects=new CustomObject[numOfObjects];
                            for(int i=0;i<numOfObjects;i++){
                                System.out.print("Enter a name for object "+(i+1)+": ");
                                customObjects[i]=new CustomObject(scanner.nextLine());
                            }
                            customObjectList=runnerObject.addElement(customObjectList, customObjects);
                            System.out.println("List: "+customObjectList);
                            System.out.println("Length: "+Utility.getLength(customObjectList));
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 5:
                        try {
                            objectList=runnerObject.getList();
                            objects=new Object[7];
                            int ind=0;
                            for(int i=0;i<2;i++){
                                System.out.print("Enter Integer "+(i+1)+": ");
                                objects[ind++]=scanner.nextInt();
                                scanner.nextLine();
                            }
                            for(int i=0;i<3;i++){
                                System.out.print("Enter String "+(i+1)+": ");
                                objects[ind++]=scanner.nextLine();
                            }
                            for(int i=0;i<2;i++){
                                System.out.print("Enter a name for object "+(i+1)+": ");
                                objects[ind++]=new CustomObject(scanner.nextLine());
                            }
                            objectList=runnerObject.addElement(objectList, objects);
                            System.out.println("List: "+objectList);
                            System.out.println("Length: "+Utility.getLength(objectList));
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 6:
                        try {
                            stringList=runnerObject.getList();
                            System.out.println("Enter Strings:");
                            strings=new String[4];
                            for(int i=0;i<4;i++){
                                strings[i]=scanner.nextLine();
                            }
                            stringList=runnerObject.addElement(stringList, strings);
                            System.out.println("Enter a String to search: ");
                            String str=scanner.nextLine();
                            runnerObject.getElementIndex(stringList, str);
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 7:
                        try {
                            stringList=runnerObject.getList();
                            System.out.println("Enter Strings:");
                            strings=new String[5];
                            for(int i=0;i<5;i++){
                                strings[i]=scanner.nextLine();
                            }
                            stringList=runnerObject.addElement(stringList, strings);
                            runnerObject.printElements(stringList);
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 8:
                        try {
                            stringList=runnerObject.getList();
                            System.out.print("Enter number of Strings: ");
                            int numOfStrings=scanner.nextInt();
                            scanner.nextLine();
                            strings=new String[numOfStrings];
                            for(int i=0;i<numOfStrings;i++){
                                System.out.print("Enter String "+(i+1)+": ");
                                strings[i]=scanner.nextLine();
                            }
                            stringList=runnerObject.addElement(stringList, strings);
                            System.out.print("Enter index to get element: ");
                            int index=scanner.nextInt();
                            scanner.nextLine();
                            runnerObject.printElementAt(stringList, index);
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 9:
                        try {
                            stringList=runnerObject.getList();
                            strings=new String[5];
                            for(int i=0;i<5;i++){
                                System.out.print("Enter String "+(i+1)+": ");
                                strings[i]=scanner.nextLine();
                            }
                            stringList=runnerObject.addElement(stringList, strings);
                            System.out.print("Enter a String to search: ");
                            String str=scanner.nextLine();
                            runnerObject.printFirstAndLastIndex(stringList,str);
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 10:
                        try {
                            stringList=runnerObject.getList();
                            strings=new String[5];
                            for(int i=0;i<5;i++){
                                System.out.print("Enter String "+(i+1)+": ");
                                strings[i]=scanner.nextLine();
                            }
                            stringList=runnerObject.addElement(stringList, strings);
                            System.out.print("Enter a String to insert at 2nd Position: ");
                            String str=scanner.nextLine();
                            stringList=runnerObject.insertAsSecondElement(stringList, str);
                            System.out.println("List: "+stringList);
                            System.out.println("Length: "+Utility.getLength(stringList));
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;
                    
                    case 11:
                        try {
                            stringList=runnerObject.getList();
                            strings=new String[10];
                            for(int i=0;i<10;i++){
                                System.out.print("Enter String "+(i+1)+": ");
                                strings[i]=scanner.nextLine();
                            }
                            stringList=runnerObject.addElement(stringList, strings);
                            stringList2=runnerObject.getThirdToEighthElements(stringList);
                            System.out.println("List: "+stringList2);
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 12:
                        try {
                            stringList=runnerObject.getList();
                            strings=new String[3];
                            System.out.println("Enter Strings for first list");
                            for(int i=0;i<3;i++){
                                System.out.print("Enter String "+(i+1)+": ");
                                strings[i]=scanner.nextLine();
                            }
                            stringList=runnerObject.addElement(stringList, strings);

                            stringList2=runnerObject.getList();
                            strings=new String[5];
                            System.out.println("Enter Strings for second list");
                            for(int i=0;i<5;i++){
                                System.out.print("Enter String "+(i+1)+": ");
                                strings[i]=scanner.nextLine();
                            }
                            stringList2=runnerObject.addElement(stringList2, strings);
                            stringList3=runnerObject.mergeLists(stringList, stringList2);
                            System.out.println("List: "+stringList3);
                            System.out.println("Length: "+Utility.getLength(stringList3));
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 13:
                        try {
                            stringList=runnerObject.getList();
                            strings=new String[5];
                            System.out.println("Enter Strings for first list");
                            for(int i=0;i<5;i++){
                                System.out.print("Enter String "+(i+1)+": ");
                                strings[i]=scanner.nextLine();
                            }
                            stringList=runnerObject.addElement(stringList, strings);

                            stringList2=runnerObject.getList();
                            strings=new String[3];
                            System.out.println("Enter Strings for second list");
                            for(int i=0;i<3;i++){
                                System.out.print("Enter String "+(i+1)+": ");
                                strings[i]=scanner.nextLine();
                            }
                            stringList2=runnerObject.addElement(stringList2, strings);
                            stringList3=runnerObject.mergeLists(stringList2, stringList);
                            System.out.println("List: "+stringList3);
                            System.out.println("Length: "+Utility.getLength(stringList3));
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 14:
                        try {
                            floatList=runnerObject.getList();
                            floats=new Float[5];
                            for(int i=0;i<5;i++){
                                System.out.print("Enter decimal value "+(i+1)+": ");
                                floats[i]=scanner.nextFloat();
                                scanner.nextLine();
                            }
                            floatList=runnerObject.addElement(floatList, floats);
                            floatList=runnerObject.removeFourthElement(floatList);
                            System.out.println("List: "+floatList);
                            System.out.println("Length: "+Utility.getLength(floatList));
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 15:
                        try {
                            stringList=runnerObject.getList();
                            strings=new String[5];
                            System.out.println("Enter Strings for first list");
                            for(int i=0;i<5;i++){
                                System.out.print("Enter String "+(i+1)+": ");
                                strings[i]=scanner.nextLine();
                            }
                            stringList=runnerObject.addElement(stringList, strings);

                            stringList2=runnerObject.getList();
                            strings=new String[3];
                            System.out.println("Enter Strings for second list that are present in first list");
                            for(int i=0;i<3;i++){
                                System.out.print("Enter String "+(i+1)+": ");
                                strings[i]=scanner.nextLine();
                            }
                            stringList2=runnerObject.addElement(stringList2, strings);

                            stringList3=runnerObject.removeIfPresentIn(stringList, stringList2);
                            System.out.println("List: "+stringList3);
                            System.out.println("Length: "+Utility.getLength(stringList3));
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 16:
                        try {
                            stringList=runnerObject.getList();
                            strings=new String[5];
                            System.out.println("Enter Strings for first list");
                            for(int i=0;i<5;i++){
                                System.out.print("Enter String "+(i+1)+": ");
                                strings[i]=scanner.nextLine();
                            }
                            stringList=runnerObject.addElement(stringList, strings);

                            stringList2=runnerObject.getList();
                            strings=new String[3];
                            System.out.println("Enter Strings for second list that are present in first list");
                            for(int i=0;i<3;i++){
                                System.out.print("Enter String "+(i+1)+": ");
                                strings[i]=scanner.nextLine();
                            }
                            stringList2=runnerObject.addElement(stringList2, strings);

                            stringList3=runnerObject.removeIfNotPresentIn(stringList, stringList2);
                            System.out.println("List: "+stringList3);
                            System.out.println("Length: "+Utility.getLength(stringList3));
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 17:
                        try {
                            longList=runnerObject.getList();
                            longs=new Long[10];
                            for(int i=0;i<10;i++){
                                System.out.print("Enter Long "+(i+1)+": ");
                                longs[i]=scanner.nextLong();
                                scanner.nextLine();
                            }
                            longList=runnerObject.addElement(longList, longs);
                            runnerObject.clearList(longList);
                            System.out.println("List: "+longList);
                            System.out.println("Length: "+Utility.getLength(longList));

                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 18:
                        try {
                            stringList=runnerObject.getList();
                            strings=new String[5];
                            for(int i=0;i<5;i++){
                                System.out.print("Enter String "+(i+1)+": ");
                                strings[i]=scanner.nextLine();
                            }
                            stringList=runnerObject.addElement(stringList, strings);
                            System.out.print("Enter String to check presence: ");
                            String str= scanner.nextLine();
                            runnerObject.checkPresence(stringList, str);
                            System.out.println("List: "+stringList);
                            System.out.println("Length: "+Utility.getLength(stringList));
                        } catch (InvalidArgumentException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

					case 19:
						flag=false;
						break;
				
					default:
						System.out.println("Enter valid option...");
						break;
				}
			}
		} 
        // catch (Exception e) {
		// 	e.printStackTrace();
		// }
    }

    public <T> List<T> getList(){
        return taskObject.createList();
    }

    public <T> List<T> addElement(List<T> list,T[] elements) throws InvalidArgumentException{
        return taskObject.appendElements(list, elements);
    }

    public <T> void getElementIndex(List<T> list, T element) throws InvalidArgumentException{
        int index=taskObject.findElement(list, element);
        if(index!=-1){
            System.out.println("Index: "+index);
        }else{
            System.out.println("Element not found");
        }
    }

    public <T> void printElements(List<T> list) throws InvalidArgumentException{
        Iterator<T> iterator=taskObject.getIterator(list);
        System.out.println("Elements: ");
        for(;iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }

    public <T> void printElementAt(List<T> list, int index) throws InvalidArgumentException{
        try {
            System.out.println("Element at: "+index+": "+taskObject.elementAt(list, index));
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public <T> void printFirstAndLastIndex(List<T> list, T element) throws InvalidArgumentException{
        System.out.println("First Index: "+taskObject.getFirstIndexOf(list, element));
        System.out.println("Last Index: "+taskObject.getLastIndexOf(list, element));
    }

    public <T> List<T> insertAsSecondElement(List<T> list, T element)throws InvalidArgumentException{
        try {
            list=taskObject.insertElementAt(list, element, 1);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return list;
    }

    public <T> List<T> getThirdToEighthElements(List<T>list ) throws InvalidArgumentException{
        try {
            list=taskObject.getSubList(list, 2, 8);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return list;
    }

    public <T> List<T> mergeLists(List<T> list1, List<T> list2) throws InvalidArgumentException{
        return taskObject.combineLists(list1, list2);
    }

    public <T> List<T> removeFourthElement(List<T> list) throws InvalidArgumentException{
        return taskObject.removeElementAt(list, 3);
    }

    public <T> List<T> removeIfPresentIn(List<T> list1, List<T> list2) throws InvalidArgumentException{
        return taskObject.removeFromCollection(list1, list2);
    }

    public <T> List<T> removeIfNotPresentIn(List<T> list1, List<T> list2) throws InvalidArgumentException{
        return taskObject.retainFromCollection(list1, list2);
    }

    public <T> List<T> clearList(List<T>list )throws InvalidArgumentException{
        return taskObject.removeAllElements(list);
    }

    public <T> void checkPresence(List<T> list, T element)throws InvalidArgumentException{
        if(taskObject.checkElementPresence(list, element)){
            System.out.println("Element present");
        }else{
            System.out.println("Element not found");
        }
    }

}
