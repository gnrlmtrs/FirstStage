import newYearGift.NewYearGift;
import sweets.Biscuit;
import sweets.Candy;
import sweets.Kinder;
import sweets.Sweets;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        ArrayList<Sweets> sweetsList = new ArrayList<>();


        Sweets sweets = new Sweets("Sweets", 100, 20);
        Candy candy = new Candy("Candy",130, 40, "Yellow");
        Biscuit biscuit = new Biscuit("Biscuit",200, 30, "Purple");
        Kinder kinder = new Kinder("Kinder",50, 50, "Red&White");

        NewYearGift newYearGift = new NewYearGift(sweetsList);
        newYearGift.add(sweets);
        newYearGift.add(candy);
        newYearGift.add(biscuit);
        newYearGift.add(kinder);

        System.out.println("The weight of new year gift is: " + newYearGift.getWeigthOfNewYearGift() + "g");
        for(int i = 0; i < newYearGift.size(); i++){
            System.out.println("Quantity of sugar: " + newYearGift.sortListByQuantityOfSugar().get(i).getQuantityOfSugar()
            + " Name of sweet: " + newYearGift.sortListByQuantityOfSugar().get(i).getName());
        }

        System.out.println("\n"+ newYearGift.getSweetsByQuantityOfSugar(20, 60));


        OptionalTasks optionalTasks = new OptionalTasks();
        optionalTasks.firstOptionalTask();
        optionalTasks.sixthOptionalTask();
        optionalTasks.fourthOptionalTask();

        System.out.println("\n\n");
        optionalTasks.thirdOptionalTask();

    }
}
