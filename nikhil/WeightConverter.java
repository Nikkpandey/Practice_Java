package nikhil;
import java.util.*;
public class WeightConverter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight: ");
        double weightKgs=sc.nextDouble();
        kilo_to_gram(weightKgs);
        kilo_to_mGram(weightKgs);
    }

    public static void kilo_to_gram(double weightKgs){
        double weightGram= weightKgs*1000;
        System.out.println("New weight in Gram: "+weightGram);
    }

    public static void kilo_to_mGram(double weightKgs){
        double weightMGram=weightKgs *1000000;
        System.out.println("New weight in Mili Gram: "+weightMGram);
    }
}
