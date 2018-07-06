import java.util.Scanner;

public class 999B {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		
		String name = scan.nextLine();
		String temp = "";
		
		for(int i=2; i<=n; i++) {
		    if(n%i == 0) {
		        for(int j=i-1; j>=0; j--) {
		            temp += name.charAt(j);
		        }
		        for(int j=i; j<n; j++) {
		            temp += name.charAt(j);
		        }
		        name = temp;
		        temp = "";
		    }
		}
		
		System.out.println(name);
		
		scan.close();
	}
}