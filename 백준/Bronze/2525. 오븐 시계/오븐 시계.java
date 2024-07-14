import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long hh = Long.parseLong(st.nextToken());
        Long mm = Long.parseLong(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        Long temp = Long.parseLong(st.nextToken());
        
        hh += (temp/60);
        mm += (temp%60);
        
        if(mm >= 60) {hh++; mm-=60;}
        if(hh >= 24) {hh-= 24;}
        
        System.out.println(hh + " " + mm);
    }
}