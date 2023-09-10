package Practice;

public class NaturalSum {
    public static int sumOfNatural(int num){
      if(num!=0){
          return num + sumOfNatural(num-1);
      }
      else
          return num;
    }

    public static void main(String[] args) {
        int num=5;
       int sum=sumOfNatural(num);
        System.out.println("Sum= "+sum);
    }
}
