//print the reverse of a given string
public class string1 {
    static void disp(char ch[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String s = "what is your name";
        char ch[] = s.toCharArray();
        int n = ch.length;
        int i = 0, j = n - 1;
        disp(ch, n);
        while (i < j) {
            char t = ch[i];
            ch[i] = ch[j];
            ch[j] = t;
            i++;
            j--;
        }
        disp(ch, n);
    }
}
