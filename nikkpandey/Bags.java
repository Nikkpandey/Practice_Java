package nikkpandey;
import java.util.*;
public class Bags {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Big Flour bags: ");
        int bigBag= sc.nextInt();
        System.out.println("Small flour bags: ");
        int smallBag=sc.nextInt();
        System.out.println("Goal amount of assemble a package: ");
        int goalToAssemble=sc.nextInt();

        System.out.println(canPack(bigBag,smallBag,goalToAssemble));
    }

    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        if(goal>((bigCount*5)+smallCount)){
            return false;
        }
        if((goal%5)>smallCount){
            return false;
        }
        return true;
    }
}
