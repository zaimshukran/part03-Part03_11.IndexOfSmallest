
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        while(true){
            int input = Integer.parseInt(scanner.nextLine());

            if(input == 9999){
                break;
            }else if(input < min){
                min = input;
            }

            list.add(input);
        }

        System.out.println("Smallest number: " + min);

        for(int i = 0; i<list.size(); i++){
            if(list.get(i) == min){
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
