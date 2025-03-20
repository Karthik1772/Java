
import java.util.Scanner;



public class solution {
    public static char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++){
            if((int)letters[i]>(int)target){
                return letters[i];
            }
        }return letters[0];
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char let[]={'c','f','j'};
        char tar= scan.next().charAt(0);
        System.out.println(nextGreatestLetter(let,tar));;
    }
}
