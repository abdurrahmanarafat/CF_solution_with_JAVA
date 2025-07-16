import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;

public class A_Elephant {
    static final int MAX_N = 100005;
    static final long MOD = 1000000007;
    static final long INF = 1000000000;
    static final double EPS = 1e-9;

    public static void main(String[] args) {
    FastScanner fs = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);
       // int tc = 1;
        // tc = fs.nextInt();
       // for (int t = 1; t <= tc; t++) {
            // System.out.printf("Case #%d: ", t);
            
       // }

       int n = fs.nextInt();
       if( n%5==0) out.print(n/5);
       else out.print((n/5)+1);
        out.close();
    }
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
    
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }
    
        int nextInt() {
            return Integer.parseInt(next());
        }
    
        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
    
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}