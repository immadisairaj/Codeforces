import java.util.*;
import java.lang.*;
 
public class 469A {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    int n = scan.nextInt();
	    
	    Set <Integer> numbers = new TreeSet<Integer>();
	    
	    int p = scan.nextInt();
	    
	    int num;
	    
	    while(p-- > 0) {
	        num = scan.nextInt();
	        numbers.add(num);
	    }
	    
	    p = scan.nextInt();
	    
	    while(p -- > 0) {
	        num = scan.nextInt();
	        numbers.add(num);
	    }
	    
	    if(numbers.size() == n)
	        System.out.println("I become the guy.");
	    else
	        System.out.println("Oh, my keyboard!");
	    
		scan.close();
	}
}
