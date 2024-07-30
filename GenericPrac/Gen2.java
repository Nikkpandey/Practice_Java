package GenericPrac;


class MyClass2{

    //method receive T type array
    static <T> void display(T[] arr){
        //use for each loop and read elements of array
        for(T i:arr){
            System.out.println(i);
        }
    }
}
public class Gen2 {
    public static void main(String[] args) {
        Integer arr1[]={1,2,3,4,5};
        System.out.println("Reading Integer object: ");
        MyClass2.display(arr1);

        String arr2[]={"Nikhil","Adarsh","Shivam"};
        System.out.println("Reading String object: ");
        MyClass2.display(arr2);
    }
}
