package OOPS;
import java.util.*;
public class Name {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getName(){
        return getFirstName()+" "+getLastName();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String fName= sc.nextLine();
        String lName= sc.nextLine();

        Name printFullName=new Name();
        printFullName.setFirstName(fName);
        printFullName.setLastName(lName);

        String name= printFullName.getName();
        System.out.println("Full name is: "+name);
    }
}
