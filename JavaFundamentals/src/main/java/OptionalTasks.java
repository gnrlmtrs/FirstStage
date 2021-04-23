import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OptionalTasks {

    public void firstOptionalTask(){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

            String[] arr = new String[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scan.next();
            }
            solve(arr);

    }

    public static void solve(String[]arr){
        int min = arr[0].length();
        int max = 0;
        for(String val : arr){
            if(val.length() > max)
                max = val.length();
            else if(val.length() < min)
                min = val.length();
        }
        for(int i = 0;i < arr.length;i++){
            if(arr[i].length() == max)
                System.out.println("Max number is "+ arr[i]+ " his length "+ arr[i].length());
            else if(arr[i].length() == min)
                System.out.println("Min number is "+ arr[i]+" his length "+ arr[i].length());
        }
    }


    public void secondOptionalTask(){
        List<Integer> listOfNumbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Scanner scanQuantity = new Scanner(System.in);
        int quantityOfNumber;
        System.out.println("Enter the quantity of numbers");
        quantityOfNumber = scanQuantity.nextInt();
        System.out.println("Enter the numbers: ");
        int nums;
        for(int i = 0; i < quantityOfNumber; i++) {
            nums = scan.nextInt();
            listOfNumbers.add(nums);
        }
        System.out.println("Numbers: " + listOfNumbers);
        List<Integer> theLengthOfNumbers = new ArrayList<>();

        for(int i : listOfNumbers){
            theLengthOfNumbers.add(Integer.toString(i).length());
        }
        Collections.sort(theLengthOfNumbers);
        System.out.println("The length of Numbers:" + theLengthOfNumbers);

    }


}
