//to reverse the words of the string 
public class string2 {
    static void disp(char a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);
        System.out.println();
    }

    static void rev(char ch[], int i, int j) {
        while (i < j) {
            char t = ch[i];
            ch[i] = ch[j];
            ch[j] = t;
            i++;
            j--;
        }
    }

    static void wordrev(char a[]) {
        int n = a.length;
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || a[i + 1] == ' ') {
                rev(a, s, i);
                s = i + 2;
            }

        }
    }

    public static void main(String[] args) {
        String s = "what is your name";
        char ch[] = s.toCharArray();
        disp(ch);
        wordrev(ch);
        disp(ch);

    }
}