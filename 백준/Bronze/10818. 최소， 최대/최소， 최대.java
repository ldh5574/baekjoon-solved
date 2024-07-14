import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long nn = Long.parseLong(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        Long max = 0L;
        Long min = 0L;
        for(int i=0; i<nn; i++){
            Long num = Long.parseLong(st.nextToken());
            if(i==0){ max=num; min=num;}
            max = Math.max(max, num);
            min = Math.min(min, num);

        }
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}