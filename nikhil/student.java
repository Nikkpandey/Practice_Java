package nikhil;

public class student {
    public static void main(String[] args){
        String name="Nikhil";
        int marks=82;
        char studGrade=calculate(marks);
        details(name,studGrade);
    }

    public static char calculate(int studmarks){
        char grade;
        if(studmarks==100) {
            grade='S';
        }
        else if (studmarks<99 && studmarks>=80) {
            grade='A';
        }
        else if(studmarks<79 && studmarks>=60){
            grade='B';
        }
        else if(studmarks<59 && studmarks>=40){
            grade='C';
        }
        else
            grade = 'D';
        return grade;
    }

    public static void details(String Name, char StudGrade){
        System.out.println("Student name is: "+Name+" and score a grade of: "+StudGrade);
    }
}
