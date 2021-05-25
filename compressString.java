import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
        // Your code here
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(rd.readLine());
		while(t-->0){
			String s = rd.readLine();
			for(int i=0;i<s.length();i++){
            	int count=1;
            	while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
            	    count++;
            	    i++;
            	}
            	System.out.print(s.charAt(i));
            	System.out.print(count);
        	}
			System.out.println();
		}
	}
}
