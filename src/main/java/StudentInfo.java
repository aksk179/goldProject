public class StudentInfo {
	public static void main(String[] args) {
		
		try {
			System.out.println(args[0]);		
			int n = Integer.parseInt(args[1]);
			System.out.println(n);
		}
		catch(NumberFormatException e) {
			String str = args[1];
			System.out.println(str);
		}
	}
}
