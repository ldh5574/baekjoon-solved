import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int n = Integer.parseInt(st.nextToken());
        // int m = Integer.parseInt(st.nextToken());
        
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<10; i++){
           int n = Integer.parseInt(bf.readLine());
           hs.add(n%42);
        }
        
        bw.write(String.valueOf(hs.size()));

        bw.flush();
        bw.close();
    }
}