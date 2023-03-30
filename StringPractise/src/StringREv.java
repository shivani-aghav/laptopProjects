
public class StringREv {

	static String getRev(String st) {
		char[] ch = st.toCharArray();
		String str = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			int k = i;
			while (i >= 0 && ch[i] != ' ') {
				i--;
			}
			int j = i + 1;
			while (j <= k) {
				str = str + ch[j];
				j++;
			}
			if (i >= 0) {
				str = str + ch[i];
			}
		}
		return str;
		

	}

	public static void main(String[] args) {
		String st = "God is Great";
		System.out.println(getRev(st));
	}
}
