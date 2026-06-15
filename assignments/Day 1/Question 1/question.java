import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int totalClasses =  sc.nextInt();
        int attendedClasses = sc.nextInt();
        double attendance = ((double)attendedClasses/ totalClasses) * 100 ; 
        if(attendance >= 75.0){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
        
    }
}