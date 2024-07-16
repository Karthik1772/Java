import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        int mark;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the marks ");
        mark = s.nextInt();
        if(mark <=100 && mark >=85){
            System.out.print("Distinction");
        }
        else if(mark < 85 && mark >= 60){
            System.out.print("First Class");
        }
        else if(mark < 60 && mark >= 45){
            System.out.print("second class");
        }
        else if(mark < 45 && mark >= 35){
            System.out.print("pass");
        }
        else{
            System.out.print("fail");
        }
    }
}
