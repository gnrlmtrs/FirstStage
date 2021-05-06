import newYearGift.NewYearGift;
import sweets.Biscuit;
import sweets.Candy;
import sweets.Kinder;
import sweets.Sweets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


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


        OptionalTasks optionalTasks = new OptionalTasks();

        int choice = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("\n\nPress 0 to exit from program");
            System.out.println("Press 1 to get weight of new year gift");
            System.out.println("Press 2 to sort sweets by quantity of sugar");
            System.out.println("Press 3 to get sweets by quantity of sugar between some values");
            System.out.println("Press 4 First optional task");
            System.out.println("Press 5 sixth optional task");
            System.out.println("Press 6 fourth optional task");
            System.out.println("Press 7 third optional task");
            System.out.println();
            while(!scan.hasNextInt()){
                scan.next();
            }

            choice = scan.nextInt();

            switch(choice){
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    System.out.println("The weight of new year gift is: " + newYearGift.getWeigthOfNewYearGift() + "g");
                    break;
                case 2:
                    for(int i = 0; i < newYearGift.size(); i++){
                        System.out.println("Quantity of sugar: " + newYearGift.sortListByQuantityOfSugar().get(i).getQuantityOfSugar()
                                + " Name of sweet: " + newYearGift.sortListByQuantityOfSugar().get(i).getName());
                    }
                    break;
                case 3:
                    System.out.println("Sweets with sugar between some values: " +
                            newYearGift.getSweetsByQuantityOfSugar(20, 60));
                    break;
                case 4:
                    optionalTasks.firstOptionalTask();
                    break;
                case 5:
                    optionalTasks.sixthOptionalTask();
                    break;
                case 6:
                    optionalTasks.fourthOptionalTask();
                    break;
                case 7:
                    optionalTasks.thirdOptionalTask();
                    break;
            }












        }while(choice != 0);



    }
}
