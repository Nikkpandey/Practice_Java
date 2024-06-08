package Array;

public class LargestNo {
    public static int largeNo(int[] arr,int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int max=largeNo(arr,index+1);
        if(max<arr[index]){
            max=arr[index];
        }
        return max;
    }

    public static void main(String[] args) {
        int[]arr={8,6,9,1,2};
        int max=largeNo(arr,0);
        System.out.println(max);
    }
}
