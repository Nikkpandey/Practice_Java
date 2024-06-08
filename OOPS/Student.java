package OOPS;
import java.util.*;
public class Student {
 private String firstName;
 private String lastName;
 private int marks;

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

    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks){
        if((marks<0) || (marks>100))
            this.marks=0;
        else
            this.marks=marks;
    }
    public boolean isPass(){
        if(marks>=33 && marks<=100)
            return true;
        else
            return false;
    }
    public String getFullName(){
        String first=getFirstName();
        String last=getLastName();
        if(first.isEmpty() && last.isEmpty())
            return "";
        else if(last.isEmpty())
            return first;
        else if (first.isEmpty())
            return last;
        else
            return first+" "+last;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student student=new Student();
        String f_name=sc.nextLine();
        String l_name= sc.nextLine();
        int s_marks= sc.nextInt();

        student.setFirstName(f_name);
        student.setLastName(l_name);
        student.setMarks(s_marks);

        System.out.println("Full name= "+student.getFullName());
        System.out.println("pass= "+student.isPass());

    }
}
