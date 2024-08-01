import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 1~1 => 1
        // 2~7 총6개 => 2 => 6*0+1 ~ 6*1+1
        // 8~19 총12개 => 3 => 6*1+1+1 ~ 6*2
        // 20~37 총18개 => 4
        // 38~61 총24개 => 5
        // 6개씩 추가

        StringTokenizer st = new StringTokenizer(bf.readLine());    
        int a = Integer.parseInt(st.nextToken());
        
        int cnt = 1;
        int rightOffset = 1;
        while(a > rightOffset){
            rightOffset = rightOffset + (6*cnt++);
        }
        
        bw.write(String.valueOf(cnt++));
        
        bw.flush();
        bw.close();
    }
}