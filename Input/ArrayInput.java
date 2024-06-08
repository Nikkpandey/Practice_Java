package Input;
import java.io.*;
public class ArrayInput {
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array: ");
        int size=Integer.parseInt(br.readLine());
        int[] arr=new int[size];

        for(int i=0; i<size;i++){
            System.out.print("Enter the number: ");
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int j=0; j<size; j++) {
            System.out.println("Array is: " + arr[j]);
        }
    }
}
