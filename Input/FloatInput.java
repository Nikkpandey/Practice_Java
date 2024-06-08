package Input;
import java.io.*;
public class FloatInput {
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the float number: ");
        float num=Float.parseFloat(br.readLine());

        System.out.print("Your float number is: "+num);
    }
}
