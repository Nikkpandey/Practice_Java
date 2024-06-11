package CodingPractice;
import java.io.*;

class Employee{
    int id;
    String name;
    Employee(int i, String n){
        id=i;
        name=n;
    }
    void displayData(){
        System.out.println(id+" \t "+name);
    }
}
public class RetrieveArray {
    public static void main(String [] args)throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Employee[] arr=new Employee[5];
       for(int i=0; i<5; i++){
           System.out.println("Enter id: ");
           int id=Integer.parseInt(br.readLine());
           System.out.println("Enter name: ");
           String name=br.readLine();
           arr[i]=new Employee(id,name);
       }
       System.out.println("\n The Employee data is: ");
       for(int i=0; i<arr.length;i++){
           arr[i].displayData();
       }
    }
}
