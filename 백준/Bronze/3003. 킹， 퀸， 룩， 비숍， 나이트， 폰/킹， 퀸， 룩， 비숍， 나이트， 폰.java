import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // Integer n = Integer.parseInt(bf.readLine());
        
        String[] s = bf.readLine().split(" ");
        int[] admin = {1, 1, 2, 2, 2, 8};
        for(int i=0; i<s.length; i++){
            bw.write(String.valueOf(admin[i]-Integer.parseInt(s[i])) + " ");
        }
        // k1 q1 l2 b2 n2 p8
        
        
        // bw.write(String.valueOf(s));
        bw.flush();
        bw.close();
    }
}