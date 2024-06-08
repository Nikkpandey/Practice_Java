package Input;
import java.io.*;
public class CharInput {
       public static void main(String args[]) throws IOException{
           BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
           System.out.print("Enter the character: ");
           char ch=(char)br.read();

           System.out.print("The char is : "+ch);
       }
}
