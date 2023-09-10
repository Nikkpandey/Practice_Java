package Practice;

public class RangeSum {
    public static int rangeNatural(int num1,int num2){
        int sum;
        sum=num2*(num2+1)/2-num1*(num1+1)/2+num1;
        return sum;
    }

    public static void main(String[] args) {
        int num1=3;
        int num2=5;
        int sum=rangeNatural(num1,num2);
        System.out.println("Sum= "+sum);
    }
}
