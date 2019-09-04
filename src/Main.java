import java.io.*;
import java.util.*;

public class Main {
    static int binarySearch(int[] a, int x, int left, int right) {
         int midpoint = 0;
        //write your code here
            while (left <= right){
                midpoint = left + (right - left) / 2;
                if (a[midpoint] == x){
                    return midpoint;
                }
                else if (a[midpoint] > x) {
                    return binarySearch(a, x, left, midpoint - 1);
                }
                else if (a[midpoint] < x) {
                    return binarySearch(a, x,midpoint + 1, right);
                }
            }
            return -1;
    }


    static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return i;
        }
        return -1;
    }
    public static void main (String [] args){
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        int left = 0;
        int right = a.length - 1;
//        for (int i = 0; i < m; i++) {
//            //replace with the call to binarySearch when implemented
//            System.out.print(linearSearch(a, b[i]) + " ");
//        }
//        System.out.println("");
        for (int j = 0; j < m; j++) {
            System.out.print(binarySearch(a, b[j], left, right) + " ");
        }

        }

     static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
   }
}
