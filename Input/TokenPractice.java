package Input;
import java.io.*;
import java.util.*;
public class TokenPractice {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Name, Age, Sex ");
        String str=br.readLine();

        StringTokenizer stz=new StringTokenizer(str,",");

        String t1=stz.nextToken();
        String t2=stz.nextToken();
        String t3=stz.nextToken();

        System.out.println("Name:"+t1);
        System.out.println("Age:"+t2);
        System.out.println("Sex:"+t3);
    }
}
