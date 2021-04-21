package sweets;

public class Kinder extends Sweets{
    private  String packaging;
    public Kinder(String name, int weight, int quantityOfSugar, String packaging){
        super(name, weight, quantityOfSugar);
        this.packaging = packaging;
    }
}
