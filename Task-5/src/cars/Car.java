package cars;

public class Car {
    private int yearOfMake;
    private String engineNumber;
    private String type;

    public Car(){}

    public Car(String str){
        System.out.println("Constructor: "+str);
    }

    public void setYearOfMake(int year){
        yearOfMake=year;
    }

    public int getYearOfMake(){
        return yearOfMake;
    }

    public void setEngineNumber(String engineNumber){
        this.engineNumber=engineNumber;
    }

    public String getEngineNumber(){
        return engineNumber;
    }

    public void setType(String type){
        this.type=type;
    }

    public String getType(){
        return type;
    }

    public void maintenance(){
        System.out.println("Car under maintenance");
    }
}
