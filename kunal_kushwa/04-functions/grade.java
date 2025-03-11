
import java.util.Scanner;

//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//Marks        Grade 
// 90-100         A+ 
// 80-89          A 
// 70-79          B+ 
// 60-69          B 
// 50-59          C+ 
// 40-49          C 
// <40          Fail 
public class grade {
    static void rank(int mark) {
        if (mark >= 90 && mark <= 100) {
            System.out.println("A+");
        } else if (mark >= 80 && mark < 90) {
            System.out.println("A");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("B+");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("B");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("C+");
        } else if (mark >= 40 && mark < 50) {
            System.out.println("C");
        } else
            System.out.println("fail");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        {
            int mark = scan.nextInt();
            rank(mark);
        }
    }
}
