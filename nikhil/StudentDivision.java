package nikhil;

public class StudentDivision {
    public static void main(String[] args){
        String student_name="Nikhil Pandey";
        int student_score=84;
        char student_grade=division(student_score);
        display_details(student_name,student_grade);
    }

    public static char division(int student_score){
        char div;
        if(student_score>=80){
            div='A';
            return div;
        }
        else if(student_score>=60 && student_score<80){
            div='B';
            return div;
        }
        else if(student_score>=40 && student_score<60){
            div='C';
            return div;
        }
        else
            div='F';
        return div;
    }

    public static void display_details(String Name, char student_div){
        System.out.println("Student name: "+Name+" and got division: "+student_div);
    }
}
