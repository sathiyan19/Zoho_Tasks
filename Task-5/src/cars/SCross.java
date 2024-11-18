package cars;

public class SCross extends Car{
    private int airbags;
    private int seats;
    private String model;
    private String color;

    public void setAirbags(int airbags){
        this.airbags=airbags;
    }

    public int getAirbags(){
        return airbags;
    }

    public void setSeats(int seats){
        this.seats=seats;
    }

    public int getSeats(){
        return seats;
    }

    public void setModel(String model){
	    this.model=model;
    }

    public String getModel(){
        return model;
    }

    public void setColor(String color){
	    this.color=color;
    }

    public String getColor(){
        return color;
    }
}
