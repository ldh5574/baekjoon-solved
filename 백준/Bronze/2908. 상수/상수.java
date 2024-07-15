import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // Integer n = Integer.parseInt(bf.readLine());
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String a = String.valueOf(st.nextToken());
        String b = String.valueOf(st.nextToken());
        
        StringBuffer aa = new StringBuffer(a);
        StringBuffer bb = new StringBuffer(b);
        
        a = aa.reverse().toString();
        b = bb.reverse().toString();
        
        
        
        bw.write(String.valueOf(Math.max(Integer.parseInt(a), Integer.parseInt(b))));    
        
        bw.flush();
        bw.close();
    }
}