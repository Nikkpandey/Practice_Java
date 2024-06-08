package Input;
import java.io.*;
public class EmployeeInput {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter ID: ");
        int id=Integer.parseInt(br.readLine());
        System.out.print("Enter sex(M/F): ");
        char sex=br.readLine().charAt(0);

        System.out.print("Enter name: ");
        String name=br.readLine();

        System.out.println("ID: "+id);
        System.out.println("Sex: "+sex);
        System.out.println("Name: "+name);

    }
}
