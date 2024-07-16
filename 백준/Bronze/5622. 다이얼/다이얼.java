import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // Integer n = Integer.parseInt(bf.readLine());
        
        String a = bf.readLine();
        int sum = 0;
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            if( 'A'<= c && c <= 'C' ){ sum += 3; }
            if( 'D'<= c && c <= 'F' ){ sum += 4; }
            if( 'G'<= c && c <= 'I' ){ sum += 5; }
            if( 'J'<= c && c <= 'L' ){ sum += 6; }
            if( 'M'<= c && c <= 'O' ){ sum += 7; }
            if( 'P'<= c && c <= 'S' ){ sum += 8; }
            if( 'T'<= c && c <= 'V' ){ sum += 9; }
            if( 'W'<= c && c <= 'Z' ){ sum += 10; }
            
        }
        bw.write(String.valueOf(sum));    
        
        bw.flush();
        bw.close();
    }
}