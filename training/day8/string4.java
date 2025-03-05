//what is your name
//wha4 i2 you4 nam4
public class string4 {

	static void disp(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

	public static void wordrev(char a[]) {
		int n = a.length;
		int s = 0;
		disp(a);
		for (int i = 0; i < n; i++) {
			s = s + 1;
			if (i == n - 1 || a[i + 1] == ' ') {
				a[i] = (char) (48 + s);
				s = -1;

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