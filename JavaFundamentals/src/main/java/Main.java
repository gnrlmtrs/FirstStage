import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //First Task

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, please");
        String name = scanner.nextLine();

        System.out.printf("Hi %s\n", name);


        //Second task

        for(int i = args.length - 1; i >= 0; i--){
            System.out.print(args[i] + " ");
        }

        //Third task

        System.out.println("Enter the quantity of random numbers");
        Random random = new Random();

        int quantityOfNumber = scanner.nextInt();

        for(int i = 0; i < quantityOfNumber; i++){
            System.out.println(random.nextInt(70) + " ");
        }

        for(int i = 0; i < quantityOfNumber; i++){
            System.out.print(random.nextInt(70) + " ");
        }

        //Fourth task
        int values = 0;
        int sum = 0;
        int composite = 1;
        while(true){
            values = scanner.nextInt();

           if(values == 0)
                break;
          sum += values;
          composite *= values;

        }

        System.out.println(composite);
        System.out.println(sum);



        //Fifth task
        int month = 1;
        System.out.println("\nEnter the number between 1 and 12");
        month = scanner.nextInt();
        switch(month){
            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            case 4: System.out.println("April");
                break;
            case 5: System.out.println("May");
                break;
            case 6: System.out.println("June");
                break;
            case 7: System.out.println("July");
                break;
            case 8: System.out.println("August");
                break;
            case 9: System.out.println("September");
                break;
            case 10: System.out.println("October");
                break;
            case 11: System.out.println("November");
                break;
            case 12: System.out.println("December");
                break;
            default: System.out.println("Can't find a month with such number");
                break;
        }

        //optional tasks
        //First optional task

        int vals = 0;

        System.out.println("Enter your numbers, please");
        vals = scanner.nextInt();
        List<Integer> intList = new ArrayList<>();
        intList.add(vals);



    }

}
