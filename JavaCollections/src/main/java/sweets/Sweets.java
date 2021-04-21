package sweets;

public class Sweets {
    private String name;
    private int weight;
    private int quantityOfSugar;


    public Sweets(String name,int weight, int quantityOfSugar){
        this.name = name;
        this.weight = weight;
        this.quantityOfSugar = quantityOfSugar;

    }

    public int getWeight(){
        return weight;
    }

    public int setWeight(){
        return this.weight;
    }

    public int getQuantityOfSugar(){
        return quantityOfSugar;
    }

    public int setQantityOfSugar(){
        return this.quantityOfSugar;
    }

    public String getName(){
        return name;
    }




}
