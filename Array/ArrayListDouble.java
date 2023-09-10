package Array;

import java.util.ArrayList;
public class ArrayListDouble {
    public static void main(String[] args) {
        ArrayList<Double> myDoubleList=new ArrayList<>();

        for(double d=0.0; d<=10.0; d+=0.5){
            myDoubleList.add(Double.valueOf(d));
        }

        for(int i=0; i<myDoubleList.size(); i++){
            System.out.println(i+" is "+myDoubleList.get(i).doubleValue());
        }
    }
}
