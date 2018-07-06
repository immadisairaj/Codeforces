import java.util.Scanner;

public class 981A {
    
    public static boolean palindrome(String s) {
        int n = s.length();
        for(int i=0; i<n/2; i++) {
            if(s.charAt(i) != s.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
    
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		int n = s.length();
		int k = 0;
		for (int i=0; i<n-1; i++) {
		    for(int j=i+1; j<=n; j++) {
		        String temp = s.substring(i,j);
		        if(k<=j-i && !palindrome(temp)) {
		            k = j-i;
		        }
		    }
		}
		
		System.out.println(k);
		
		scan.close();
	}
}