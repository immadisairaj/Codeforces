import java.util.*;
import java.lang.*;

public class 271A {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int c, flag = 0;
		while(flag == 0) {
		    c = ++n;
		    
		    Set<Integer> k = new TreeSet<Integer>();
		    for(int i=0; i<4; i++) {
		        k.add(c%10);
		        c /= 10;
		    }
		    
		    if(k.size() == 4) {
		        flag = 1;
		    }
		}
		
		System.out.println(n);
		
		scan.close();
	}
}