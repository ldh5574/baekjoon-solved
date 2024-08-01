import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());    
        int n = Integer.parseInt(st.nextToken());
        
        // 5인경우
        // 1 3 1 좌승
        // 1 1 3 좌승
        // 3 1 1 좌승
        
        // 6인 경우
        // 1 3 1 1 우승
        // 1 1 3 1 우승
        // 1 1 1 3 우승
        // 3 1 1 1 우승
        // 3 3 우승
        
        // 7인 경우
        // 1 3 3 좌승
        // 1 1 무조건 좌승
        // 3 
        
        String s = (n%2==1 ? "SK" : "CY");
        
        
        bw.write(String.valueOf(s));
        
        bw.flush();
        bw.close();
    }
}