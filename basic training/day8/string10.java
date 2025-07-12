//frequency
public class string10 {
	static void disp(char a[]) {
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i]);
		}
		System.out.println();
	}

	public static void frequency(char a[]) {
		int n = a.length;
		int s;
		for (int i = 0; i < n; i++) {
			s = 1;
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					a[j] = 0;
					s++;

				}
			}
			if (a[i] != 0)
				System.out.println(a[i] + " :" + s);
		}
	}

	public static void main(String[] args) {
		String S = "what is your name";
		char ch[] = S.toCharArray();
		disp(ch);
		frequency(ch);
	}

}
