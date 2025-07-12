// what is your name
// hwta si oyru anem
public class string9 {

	static void disp(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

	public static void rev(char a[], int s, int j) {
		for (int i = s; i < j; i += 2) {
			if (i + 1 <= j) {
				char t = a[i];
				a[i] = a[i + 1];
				a[i + 1] = t;

			}

		}
	}

	public static void wordrev(char a[]) {
		int n = a.length;
		disp(a);
		int s = 0;
		for (int i = 0; i <= n; i++) {
			if (i == n || a[i] == ' ') {
				rev(a, s, i - 1);
				s = i + 1;
			}

		}
	}

	public static void main(String[] args) {
		String S = "what is your name";
		char ch[] = S.toCharArray();

		wordrev(ch);
		disp(ch);
	}

}
