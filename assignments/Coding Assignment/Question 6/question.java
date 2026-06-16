import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int currentData = sc.nextInt();

        int newPackData = sc.nextInt();

        int CarriedForward = Math.min(currentData, 2);

        int FinalData = CarriedForward + newPackData;

        System.out.println(FinalData);
        
    }
}