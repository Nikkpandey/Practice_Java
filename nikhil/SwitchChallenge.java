package nikhil;
import java.util.*;
public class SwitchChallenge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char variable=sc.next().charAt(0);

        char variable1=Character.toLowerCase(variable);
        switch (variable1){
            case 'a': case 'e': case 'i': case 'o': case'u':
                System.out.println("Its a vowel");
                break;
            default:
                System.out.println("Its not a vowel");
        }
    }
}
