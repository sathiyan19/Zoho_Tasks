package bird;

public abstract class BirdAbstract {

    protected String name;

    public BirdAbstract(String name){
        this.name=name;
    }

    public void fly(){
        System.out.println("Flying");
    }

    public void speak(){
        System.out.println("Speaking");
    }
}
