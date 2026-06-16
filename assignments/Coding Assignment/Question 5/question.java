import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        String color = sc.nextLine();
        
        if(color == "Red"){
            System.out.println("Stop");
        }else if(color == "Yellow"){
            System.out.println("Wait");
        }else if(color == "Green"){
            System.out.println("Go");

        }else{
            throw new IllegalArgumentException ("wrong input");
        }
    }
}