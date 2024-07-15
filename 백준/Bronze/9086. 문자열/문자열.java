import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(bf.readLine());
        for(int i=0; i<n; i++){
            String s = bf.readLine();
            
            bw.write( String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(s.length()-1)) + "\n" );
        }
        
        bw.flush();
        bw.close();
    }
}