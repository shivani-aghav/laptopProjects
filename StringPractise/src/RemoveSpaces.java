public class RemoveSpaces {

	public static void main(String[] args) {
		
		String s="My na  me i  s s  hiv";
		String all = s.replaceAll("\\s", "");
		System.out.println(all);
	}
}
