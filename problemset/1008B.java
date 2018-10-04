import java.util.*;
import java.lang.*;

public class 1008B {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    int n = scan.nextInt();
	    int temp;
	    
	    boolean ans = true;  // initialize ans to true
	    
	    int[] wi = new int[n];
	    int[] hi = new int[n];
	    for(int i=0; i<n; i++) {
	        wi[i] = scan.nextInt();
	        hi[i] = scan.nextInt();
	    }
	    
	    if(wi[0] > hi[0]) {
	        temp = wi[0];
	        wi[0] = hi[0];
	        hi[0] = temp;
	    }
	    
	    for(int i=1; i<n; i++) {
	        if( (hi[i-1] >= hi[i]) || hi[i-1] >= wi[i] ) {
	            if((wi[i] > hi[i] && wi[i] <= hi[i-1]) || (hi[i] > hi[i-1] && hi[i-1] >= wi[i])) {
	                temp = wi[i];
	                wi[i] = hi[i];
	                hi[i] = temp;
	            }
	        } else {
	            ans = false;
	        }
	    }
	    
	    if(ans) System.out.println("YES");
	    else    System.out.println("NO");
		scan.close();
	}
}
