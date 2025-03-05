// what is your name
// vgAu It xOUs mAne
public class string7 {

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
		for (int i = 0; i < n - 1; i++) {

			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
				a[i] = (char) (a[i] - 32);
				s = 1;
			} else if (a[i] != ' ') {
				if (s == 0)
					a[i] = (char) (a[i] - 1);
				else
					a[i] = (char) (a[i] + 1);
			} else {
				s = 0;
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
