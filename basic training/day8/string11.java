//what is your name
// ahtw is oruy aemn
public class string11 {

	static void disp(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

	public static void wordrev(char a[]) {
		int n = a.length;
		int s = 0;
		for (int i = 0; i < n; i++) {
			if (i == n - 1 || a[i + 1] == ' ') {
				for (int j = s; j < i; j++) {
					for (int k = j + 1; k < i + 1; k++) {
						if (a[j] > a[k]) {
							char temp = a[j];
							a[j] = a[k];
							a[k] = temp;
						}
					}
				}
				s = i + 2;
			}
		}

	}

	public static void main(String[] args) {
		String S = "what is your name";
		char ch[] = S.toCharArray();
		disp(ch);
		wordrev(ch);
		disp(ch);
	}
}
