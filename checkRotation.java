import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner scn = new Scanner(System.in);
		
		String str1 = scn.next();
		String str2 = scn.next();

		String str3 = str1.substring(2) + str1.substring(0, 2);
		if(str3.equals(str2)){
			System.out.println(1);
		}
		else{
			System.out.println(0);
		}
		// int str1length = str1.length();
	}
}
