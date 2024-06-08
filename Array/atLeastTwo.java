package Array;

public class atLeastTwo {
    public static boolean Least(int[] nums){
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]==nums[j]){
                return true;
            }
            else {
                i++;
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,3,3,4,3,2,4,2};
        System.out.println(Least(arr));
    }
}
