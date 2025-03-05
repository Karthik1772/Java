// whatisyourname
// aaehimnorstuwy
public class string8 {
	static void disp(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != ' ')
				System.out.print(a[i]);
		}
		System.out.println();
	}

	public static void sort(char a[]) {
		int n = a.length;
		disp(a);
		for (int i = n - 1; i > 0; i--) {
			for (int j = i - 1; j > -1; j--) {
				if (a[i] < a[j]) {
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		String S = "what is your name";
		char ch[] = S.toCharArray();
		sort(ch);
		disp(ch);
	}

}
