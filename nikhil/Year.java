package nikhil;
import java.util.*;
public class Year {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year: ");
        int year= sc.nextInt();
        System.out.println("Enter month: ");
        int month= sc.nextInt();
        getDaysInMonth(month,year);

    }

    public static boolean itsLeapYear(int year){
        if((year%4==0) && (year%100!=0) ||(year%400)==0){
        return true;
        }else
            return false;
    }

    public static void getDaysInMonth(int month,int year){
        if((month<1) || (month>12)){
            System.out.println("-1");
        }
        if((year<1) || (year>9999)){
            System.out.println("-1");
        }
        switch (month){
            case 1:
                System.out.println("January "+year+" has 31 days");
                break;
            case 2:
                System.out.println("February "+year+" has "+(itsLeapYear(year)?"29 days":"28 days"));
                break;
            case 3:
                System.out.println("March "+year+" has 31 days");
                break;
            case 4:
                System.out.println("April "+year+" has 30 days");
                break;
            case 5:
                System.out.println("May "+year+" has 31 days");
                break;
            case 6:
                System.out.println("June "+year+" has 30 days");
                break;
            case 7:
                System.out.println("July "+year+" has 31 days");
                break;
            case 8:
                System.out.println("August "+year+" has 31 days");
                break;
            case 9:
                System.out.println("September "+year+" has 30 days");
                break;
            case 10:
                System.out.println("October "+year+" has 31 days");
                break;
            case 11:
                System.out.println("November "+year+" has 30 days");
                break;
            case 12:
                System.out.println("December "+year+" has 31 days");
                break;
            default:
                System.out.println("Invalid");
        }
    }

}
