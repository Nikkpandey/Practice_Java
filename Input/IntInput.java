package Input;
import java.io.*;
public class IntInput {
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the integer: ");
        int num=Integer.parseInt(br.readLine());

        System.out.println("Integer you entered is: "+num);
    }
}
