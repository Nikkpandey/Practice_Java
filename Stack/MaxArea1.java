package Stack;

import java.util.Stack;

public class MaxArea1 {
    public static int maxArea(int[]arr,int n){
        int res=0;
        int[] prevSmaller=new int[n];
        int[] nextSmaller=new int[n];
        Stack<Integer>s=new Stack<>();
        s.add(0);
        for(int i=0;i<n;i++){
            while(!s.isEmpty() &&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            int prevSmallerCurr=s.empty()?-1:s.peek();
            prevSmaller[i]=prevSmallerCurr;
            s.add(i);
        }
        while(!s.isEmpty()){
            s.pop();
        }
        s.add(n-1);
        for(int i=n-1; i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            int nextSmallerCurr=s.isEmpty()?n:s.peek();
            nextSmaller[i]=nextSmallerCurr;
            s.add(i);
        }
        for(int i=0;i<n;i++){
            int temp=arr[i];
            temp+=(i-prevSmaller[i]-1)*arr[i];
            temp+=(nextSmaller[i]-i-1)*arr[i];
            res=Integer.max(res,temp);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={12,3,4,4,1,5,7};
        int n=7;
        System.out.print("Max Area: "+maxArea(arr,n));
    }
}
