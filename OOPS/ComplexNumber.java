package OOPS;
import java.util.*;
class ComplexNumber {
    private int real,imaginary;

    ComplexNumber(){

    }
    ComplexNumber(int tempReal,int tempImag){
        this.real=tempReal;
        this.imaginary=tempImag;
    }
    ComplexNumber addComplex(ComplexNumber C1,ComplexNumber C2){
        ComplexNumber temp=new ComplexNumber();
        temp.real=C1.real+C2.real;
        temp.imaginary=C1.imaginary+ C2.imaginary;

        return temp;
    }
    ComplexNumber subComplex(ComplexNumber C1,ComplexNumber C2){
        ComplexNumber temp=new ComplexNumber();
        temp.real= C1.real- C2.real;

        temp.imaginary= C1.imaginary- C2.imaginary;

        return temp;
    }
    void printComplexNumber(){
        System.out.println("Complex Number: "+real+"+"+imaginary+"i");
    }
}

class Complex{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int realNum1= sc.nextInt();
        int imagNum1= sc.nextInt();
        int realNum2= sc.nextInt();
        int imagNum2= sc.nextInt();


        ComplexNumber C1=new ComplexNumber(realNum1,imagNum1);
        C1.printComplexNumber();

        ComplexNumber C2=new ComplexNumber(realNum2,imagNum2);
        C2.printComplexNumber();

        ComplexNumber C3=new ComplexNumber();
        C3=C3.addComplex(C1,C2);

        System.out.print("Sum of ");
        C3.printComplexNumber();

        C3=C3.subComplex(C1,C2);
        System.out.print("Difference: ");
        C3.printComplexNumber();
    }
}
