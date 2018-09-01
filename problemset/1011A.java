import java.util.*;
import java.lang.*;
import java.io.*;

public class 1011A {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
		
        int n = scan.nextInt();
        int k = scan.nextInt();
        scan.nextLine();
        String weight = scan.next();
        
        char[] order = weight.toCharArray();
        Arrays.sort(order);
        
        int out = 0, count = 0;
        char c = ' ';
        for(int i=0; i<n; i++) {
            if(i == 0) {
                out += 1 + (int) order[i]-'a';
                count++;
                c = order[i];
            } else {
                if(order[i]-c > 1 && count < k) {
                    out += 1 + (int) order[i]-'a';
                    count++;
                    c = order[i];
                }
            }
        }
        
        if(count == k)
            System.out.println(out);
        else
            System.out.println("-1");
		
        scan.close();
    }
}