package Array;
import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int arr_no= sc.nextInt();
        int[] arr=new int[arr_no];

        for (int i=0; i<arr.length; i++){
            arr[i]=i*5;
        }
        for (int i=0; i<arr.length; i++){
            System.out.println("The array is:"+arr[i]+" ");
        }
    }
}
