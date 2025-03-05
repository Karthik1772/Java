
public class string6 {

	static void disp(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

	public static void wordrev(char a[]) {
		int n = a.length;
		disp(a);
		for (int i = 0; i < n; i++) {
			if (a[i] == 'a' || a[i] == 'e') {
				a[i] = (char) (a[i] - 32 + 4);
			} else if (a[i] == 'i' || a[i] == 'o') {
				a[i] = (char) (a[i] - 32 + 6);
			} else if (a[i] == 'u') {
				a[i] = (char) (65);
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