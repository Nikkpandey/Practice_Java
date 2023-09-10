package Array;
import java.util.*;
public class DateItem {
    String date;
    DateItem(String date){
        this.date=date;
    }
}

class sortItems implements Comparator<DateItem>{

    @Override
    public int compare(DateItem a, DateItem b) {

        return a.date.compareTo(b.date);
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<DateItem> dateList=new ArrayList<>();
        dateList.add(new DateItem("2020-03-25"));
        dateList.add(new DateItem("2019-01-27"));
        dateList.add(new DateItem("1998-01-27"));
        dateList.add(new DateItem("1998-02-26"));
        Collections.sort(dateList,new sortItems());

        System.out.println("Sorted in ascending order: ");

        for(DateItem d: dateList){
            System.out.println(d.date);
        }
    }
}
