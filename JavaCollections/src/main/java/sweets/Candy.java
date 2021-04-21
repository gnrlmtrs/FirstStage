package sweets;

public class Candy extends Sweets{
    private String packaging;
    public Candy(String name, int weight, int quantityOfSugar, String packaging){
        super(name, weight, quantityOfSugar);
        this.packaging = packaging;
    }


}
