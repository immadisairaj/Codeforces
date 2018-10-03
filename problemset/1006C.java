import java.util.Scanner;

public class ThreePartsoftheArray {
	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n;
        n = scan.nextInt();
        long[] a = new long[(int) n];
        for(int i=0;i<n;i++){
        	a[i]=scan.nextInt();
        }
        int i=0,j=(int) (n-1);
		long max=0,s=0,t=0;
        while(i<=j){
    		s+=a[i++];
    		if(s==t){
    			if(s>max)max=s;
    		}
    		while(s>t&&i<=j){
    			t+=a[j--];
    		}
    		if(s==t){
    			if(s>max)max=s;
    		}
    		
    	}System.out.println(max);
    }
}

	