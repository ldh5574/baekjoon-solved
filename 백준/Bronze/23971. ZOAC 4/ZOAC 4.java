import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // String s = bf.readLine();
        // int n = Integer.parseInt(bf.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int ch = (h / (n+1));
        if( (h % (n+1)) > 0 ) ch++;
        
        int cw = w / (m+1);
        if( (w % (m+1)) > 0 ) cw++;
        
        bw.write(String.valueOf(ch*cw));
        bw.flush();
        bw.close();
    }
}