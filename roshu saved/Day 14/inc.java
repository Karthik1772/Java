public class inc {
	public static void dis(char ch[]) {
		int n = ch.length;
		for (int i = 0; i < n; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}

	public static int word(char a[]) {
		int n = a.length;
		int p = Integer.MAX_VALUE;
		int s = 0;
		//char ar[] = new char[n];
		for (int i = 0; i < n; i++) {
			s = s + 1;

			if (i == n - 1 || a[i + 1] == ' ') {
				if (s < p) {
					p = s;
				}
				s = -1;
			}
		}
		return p;
	}

	public static void wordrev(char ch[]) {
		int n = ch.length;
		dis(ch);
		int s = 0;
		int l = word(ch);
		for (int j = 0; j < l; j++) {

			for (int i = 0; i < n; i++) {
				if (i == n - 1 || ch[i + 1] == ' ') {
					System.out.print((char) (ch[s + j] - 32));
					s = i + 2;
				}
			}
			s = 0;
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		String s = "what isa your name roshan";
		char ch[] = s.toCharArray();
		wordrev(ch);

	}

}
