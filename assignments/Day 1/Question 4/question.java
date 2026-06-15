import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        if( sc.hasNextLine()){
            String username = sc.nextLine();
            System.out.println(ValidUsername(username));
        }
    } 
        public static String ValidUsername(String username){
            if(username.length() < 8) return "Invalid";
        
        boolean hasletter = false;
        boolean hasdigit = false;

        for(int i=0; i< username.length(); i++){
            char ch = username.charAt(i);

            if(ch == ' '){
                return "Invalid";
            }
            if(Character.isLetter(ch)){
                hasletter  = true;
            }
            if(Character.isDigit(ch)){
                hasdigit = true;
            }
        }
        if(hasletter && hasdigit){
            return "Valid";
        }
        return "Invalid";
        }
    
}