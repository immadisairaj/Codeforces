import java.util.*;
import java.lang.*;

public class 971A {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int l = scan.nextInt();
		int b = scan.nextInt();
		
		int count = 0;
		while(l<=b) {
		    l *= 3;
		    b *= 2;
		    count++;
		}
		
		System.out.println(count);
		
		scan.close();
	}
}