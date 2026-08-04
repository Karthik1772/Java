public class LetterR {
    public static void main(String[] args) {
        int rows = 7; // You can adjust the size here
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                // Print first column
                if (j == 0) {
                    System.out.print("*");
                }
                // Print last column for the top and middle parts
                else if (i == 0 || i == rows / 2) {
                    System.out.print("*");
                }
                // Print diagonal line
                else if (i - j == rows / 2) {
                    System.out.print("*");
                }
                // For the rest, print spaces
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
