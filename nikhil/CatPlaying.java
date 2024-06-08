package nikhil;
import java.util.*;
public class CatPlaying {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value(T/F): ");
        boolean catIsPlaying=sc.nextBoolean();
        System.out.println("Enter the temperature: ");
        int temp= sc.nextInt();

        System.out.println(isCatPlaying(catIsPlaying,temp));
    }

    public static boolean isCatPlaying(boolean summer,int temperature){
        if(summer==true){
            if(temperature>=25 && temperature<=45){
                return true;
            }
            else 
                return false;
        } else{
            if(temperature>=25 && temperature<=35){
                return true;
            }
            else
                return false;
        }
    }
}
