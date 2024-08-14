
import java.util.Scanner;

public class AreaPeri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the shape : ");
        String shape = scan.next().toLowerCase();
        double area,peri;
        if(shape.equals("circle")){
            System.out.print("Enter the radius : ");
            float r = scan.nextFloat();
            area = 3.14*r;
            peri = 2*3.14*r;
            System.out.println("Area of " + shape + " = " + area );
            System.out.println("Perimenter of " + shape + " = " + peri );
        }
        else if(shape.equals("triangle")){
            System.out.print("Enter the base & height : ");
            float b = scan.nextFloat(),h = scan.nextFloat();
            System.out.print("Enter the side lenght A,B,C : ");
            float a = scan.nextFloat(),c = scan.nextFloat();
            area = 0.5*b*h;
            peri = a+b+c ;
            System.out.println("Area of " + shape + " = " + area );
            System.out.println("Perimenter of " + shape + " = " + peri );
        }
        else if(shape.equals("rectangle")){
            System.out.print("Enter the length & breadth : ");
            float l = scan.nextFloat(),w = scan.nextFloat();
            area = l*w;
            peri = 2*(l+w);
            System.out.println("Area of " + shape + " = " + area );
            System.out.println("Perimenter of " + shape + " = " + peri );
        }
        else if(shape.equals("parallelogram")){
            System.out.print("Enter the base & height : ");
            float b = scan.nextFloat(),h = scan.nextFloat();
            System.out.print("Enter the side lenght : ");
            float s = scan.nextFloat();
            area = b*h;
            peri = 2*(b*s);
            System.out.println("Area of " + shape + " = " + area );
            System.out.println("Perimenter of " + shape + " = " + peri );
        }
        else if(shape.equals("rombus")){
            System.out.print("Enter the length of 2 diagonals D1 & D2 : ");
            float d1 = scan.nextFloat(),d2 = scan.nextFloat();
            System.out.println("Enter the side length : ");
            float  s = scan.nextFloat(); 
            area = 0.5*d1*d2;
            peri = 4*s;
            System.out.println("Area of " + shape + " = " + area );
            System.out.println("Perimenter of " + shape + " = " + peri );
        }
        else if(shape.equals("square")){
            System.out.println("Enetr the side length : ");
            float s = scan.nextFloat();
            area = s*s;
            peri = 4*s;
            System.out.println("Area of " + shape + " = " + area );
            System.out.println("Perimenter of " + shape + " = " + peri );
        }
        else{
            System.out.print("Invalid OPeration");
        }
    }
}
