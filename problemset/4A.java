import java.util.Scanner;

public class 4A {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if((n == 2) || (n % 2 != 0)) {
		    System.out.println("NO");
		} 
		else {
		    System.out.println("YES");
		}
		
		scan.close();
	}
}
