package Array;
import java.util.*;
public class ArraySort {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the total number: ");
        int num= sc.nextInt();
        System.out.println("Enter the array: ");
        int[] array=new int[num];
        for(int i=0;i< array.length;i++){
            array[i]= sc.nextInt();
        }
        int[] arraySort=getArray(array);
        sortArray(arraySort);
        }

        public static int[] getArray(int[] num){
        for(int i=0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
            System.out.println();
        return num;
        }

        public static void sortArray(int[] array){
        int temp=0;
        for(int i=0; i< array.length;i++){
            for(int j=i+1; j< array.length; j++){
                if(array[i] > array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        }
    }
