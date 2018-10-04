import java.util.*;
import java.lang.*;

public class 1008A {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    String word = scan.next();
	    
	    
	    int count = 0;
	    boolean wor = true;
		
		for(int i=0; i<word.length(); i++) {
		    char c = word.charAt(i);
		    switch(c) {
		        case 'a': 
		        case 'e':
		        case 'i':
		        case 'o':
		        case 'u':
		            if(count == 1 || count == 0) {
		                count = 0;
		            } else {
		                wor = false;
		            }
		            break;  // breaks the statement
		        case 'n':
		            if(count == 1) {
		                wor = false;
		            }
		            break;
		        default:
		            if(count == 1) {
		                wor = false;
		            }
		            count++;
		    } 
		}
		
		if(count == 1) {
	        wor = false;
	    }
		
		if(wor)
		    System.out.println("YES");
	    else
	        System.out.println("NO");
		
		scan.close();
	}
}
