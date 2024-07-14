import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long n = Long.parseLong(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        Long findNum = Long.parseLong(st2.nextToken());
        
        int cnt = 0;
        for(int i=0; i<n; i++){
            Long nn = Long.parseLong(st.nextToken());
            if(nn==findNum) cnt++;
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}