//Java Program Vowel Or Consonant

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        char a = scan.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
            System.out.println(a+" is a vowel");
        }
        else
        System.out.println(a+" is a consonent");

    }
}
