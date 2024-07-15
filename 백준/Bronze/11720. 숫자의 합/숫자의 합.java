import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        Integer n = Integer.parseInt(bf.readLine());
        
        String s = bf.readLine();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += s.charAt(i)-'0';
        }
        bw.write(String.valueOf( sum ));
        bw.flush();
        bw.close();
    }
}