package Input;
import java.io.*;
public class StringInput {
   public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the text: ");
       String str=br.readLine();

       System.out.println("Your string is: "+str);

   }
}
