package nikkpandey;
import java.util.*;
public class SumAverage {
    public static void main(String[] args){
        inputThanPrintSumAndAverage();

    }

    public static void inputThanPrintSumAndAverage(){
        int sum = 0, count = 0, avg;
        Scanner sc = new Scanner (System.in);

        while (true)
        {
            boolean isInt = sc.hasNextInt ();

            if (isInt)
            {
                int value = sc.nextInt ();
                sum += value;
                count++;
            }
            else if (count == 0)
            {
                System.out.println ("SUM = 0 AVG = 0");
                break;
            }
            else
            {
                avg = sum / count;
                System.out.println ("SUM = " + sum + " AVG = " + avg);
                break;
            }
            sc.nextLine ();
        }
        sc.close ();
    }
}
