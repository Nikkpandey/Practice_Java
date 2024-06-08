package CodingPractice;

public class SumZero {
    public static void main(String[] args){
        int [] arr={-21 ,-67, -37 ,-18 ,4, -65};

        int sum=closestSumZero(arr);
        System.out.println(sum);

    }

    public static int closestSumZero(int[] arr){
        int prev=arr[0]+arr[arr.length-1];
        int curr=0;
        for(int i=0; i<arr.length-1; i++){
            int next=arr[i]+arr[i+1];
            if(prev>next){
                curr=prev;
            }
            else{
                curr=next;
            }
        }
        return curr;
    }
}
