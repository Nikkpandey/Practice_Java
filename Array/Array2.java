package Array;
import java.util.*;
public class Array2 {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       int[] userArray=getUserArray(6);

       for (int i=0;i<userArray.length;i++){
           System.out.print(userArray[i]+" ");
       }
    }

    public static int[] getUserArray(int number){
        System.out.println("Enter "+number+" integers: ");
        int[] userValues=new int[number];

        for (int i=0;i<userValues.length;i++){
            userValues[i]= sc.nextInt();
        }
        return userValues;
    }
}
