package sweets;

public class Biscuit extends Sweets{
    private String packaging;

    public Biscuit(String name, int weight, int quantityOfSugar,  String packaging){
        super(name, weight, quantityOfSugar);
        this.packaging = packaging;
    }
}
