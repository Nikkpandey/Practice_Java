package Array;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={70,90,10,30,50,20,60};
        int n= arr.length;
        quicksort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int partition(int[]arr,int low,int high){
        int swapIndex=low-1;
        int pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                swapIndex++;
                int temp=arr[j];
                arr[j]=arr[swapIndex];
                arr[swapIndex]=temp;
            }
        }
        int temp2=arr[swapIndex+1];
        arr[swapIndex+1]=arr[high];
        arr[high]=temp2;
        return swapIndex+1;
    }
    public static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int indexPI=partition(arr,low,high);
        quicksort(arr,low,indexPI-1);
        quicksort(arr,indexPI+1,high);
        }
    }
}
