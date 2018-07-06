import java.util.*;
import java.lang.*;

public class 992A {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		
		int num;
		Set<Integer> numbers = new TreeSet<Integer>();
		
		for(int i=0; i<n; i++) {
		    num = scan.nextInt();
		    if(num != 0) {
		        numbers.add(num);
		    }
		}
		
		System.out.println(numbers.size());
		
		scan.close();
	}
}