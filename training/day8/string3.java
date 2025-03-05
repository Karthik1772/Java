// what is your name ==> #ha@ #@ #ou@ #am@
public class string3 {
    static void disp(char a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);
        System.out.println();
    }

    static void update(char a[]) {
        int n = a.length;
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || a[i + 1] == ' ') {
                a[s] = '#';
                if (s != i)
                    a[i] = '@';
                s = i + 2;
            }
        }
    }

    public static void main(String[] args) {
        String s = "what is your name";
        char ch[] = s.toCharArray();
        update(ch);
        disp(ch);

    }
}