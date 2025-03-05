
public class string12 {
	static void disp(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

	public static void wordrev(char a[]) {
		int n = a.length;
		disp(a);
		int s = 0;
		for (int i = 0; i < n; i++) {
			if (i == n - 1 || a[i + 1] == ' ') {
				System.out.print((char) (a[s] - 32));
				s = i + 2;
			}
		}
		System.out.print(" ");
		s = 0;
		for (int i = 0; i < n; i++) {
			if (i == n - 1 || a[i + 1] == ' ') {
				System.out.print((char) (a[s + 1] - 32));
				s = i + 2;
			}
		}
	}

	public static void main(String[] args) {
		String S = "what is your name";
		char ch[] = S.toCharArray();
		disp(ch);
		wordrev(ch);
	}

}