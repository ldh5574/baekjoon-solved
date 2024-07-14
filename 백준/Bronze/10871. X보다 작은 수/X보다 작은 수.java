import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long nn = Long.parseLong(st.nextToken());
        Long xx = Long.parseLong(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<nn; i++){
            Long num = Long.parseLong(st.nextToken());
            if (xx > num) {
                bw.write(num + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}