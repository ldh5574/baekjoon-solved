import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // Long n = Long.parseLong(br.readLine());
        
        String str;
        while( (str=br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(str);
            Long a = Long.parseLong(st.nextToken());
            Long b = Long.parseLong(st.nextToken());
            if(a==0 && b==0) break;
            bw.write((a+b) + "\n");
        }
        bw.flush();
        bw.close();
    }
}