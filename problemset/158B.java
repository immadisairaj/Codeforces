import java.util.*;
import java.lang.*;

public class 158B {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		
		int num, count = 0;
		int three = 0, two = 0, one = 0;
		
		for(int i=0; i<n; i++) {
		    num = scan.nextInt();
		    switch(num) {
		        case 4: count++;
		                break;
		        case 3: three++;
		                break;
		        case 2: two++;
		                break;
		        case 1: one++;
		    }
		}
		
		count += three;
		    if(three < one)
		        one -= three;
		    else
		        one = 0;
		    count += two/2;
		    if(two%2 != 0) {
		        two = 1;
		        count++;
		        if(one > 2) {
		            count += (one-2)/4;
		            if((one-2)%4 != 0)
		                count++;
		        }
		    } else {
		        count += (one)/4;
		            if(one%4 != 0)
		                count++;
		    }
		
		System.out.println(count);
		
		scan.close();
	}
}