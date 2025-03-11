//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class vote {
    static void valid(int age) {
        if (age >= 18) {
            System.out.println("elegible to vote");
        } else
            System.out.println("not eligible for vote");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        valid(age);
    }
}
