import java.util.Scanner;

public class 996B {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
		    arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
		    if(arr[i]-i < 0) {
		        arr[i] = 0;
		    } else {
		        arr[i] -= i;
		    }
		}
		
		for(int i=0; i<n; i++) {
		    arr[i] = fr(arr[i],n);
		}
		
		int min = 2147483647, f=0;
		
		for(int i=0; i<n; i++) {
		    if(arr[i] < min) {
		        min = arr[i];
		        f = i+1;
		    }
		}
		
		System.out.println(f);
		
		scan.close();
	}
	
	public static int fr(int n, int d) {
	    int k = n/d;
        if(n%d != 0) {
            k += 1;
        }
        return k;
	}
}