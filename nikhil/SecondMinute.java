package nikhil;
public class SecondMinute {
    public static void main(String[] args){
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
    }

    private static String getDurationString(long minutes, long second){
        if((minutes<0) || (second<0) || (second>59)){
            return "Invalid value";
        }
        long hours=minutes/60;
        long remainingMinutes=minutes%60;
        return hours+"h "+" "+remainingMinutes+"m "+second+"s";
    }

    private static String getDurationString(long seconds){
        if(seconds<0){
            return "Invalid value";
        }
        long minute=seconds/60;
        long remainingSeconds=seconds%60;
        return getDurationString(minute,remainingSeconds);
    }
}
