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
			String str = rd.readLine();
			String s = str.toUpperCase();
			int freq[] = new int[26];
			for(int i=0;i<26;i++){
				freq[i]=0;
			}
			for(int i=0;i<s.length();i++){
				int ascii=(int)s.charAt(i);
				freq[ascii-65]++;
			}
			int flag = 0;
			for(int i=0;i<26;i++){
				if(freq[i]==0){
					flag = 1;
					
				}
			}
			//System.out.println(s);
			if(flag==1){
				System.out.println("0");
			}
			else{
				System.out.println("1");
			}
			
		}
	}
}
