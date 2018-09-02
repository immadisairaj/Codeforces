import java.util.*;
import java.lang.*;
import java.io.*;

public class 732A {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
		
		int[] a = new int[3];
        a[0] = scan.nextInt();
        a[1] = scan.nextInt();
        a[2] = scan.nextInt();
        
        Arrays.sort(a);
        
        int out = abs(a[0]-a[1]) + abs(a[1]-a[2]);
        System.out.println(out);
        
        scan.close();
    }
    
    private static int abs(int n) {
        if(n<0)
            return n*-1;
        return n;
    }
    
}