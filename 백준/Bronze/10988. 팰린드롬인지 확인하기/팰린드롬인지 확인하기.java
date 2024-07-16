import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // Integer n = Integer.parseInt(bf.readLine());
        
        String s = bf.readLine();
        int r = 1;
        for(int i=0; i<s.length()/2; i++){
            if ( s.charAt(i) == s.charAt(s.length()-1-i) ){
                continue;
            }else{
                r = 0;
            }
            // bw.newLine();
            // bw.write("*");
        }
        bw.write(String.valueOf(r));
        // 0 1 2 3 4
        
        // while((s = bf.readLine()) != null){
        //     bw.write(String.valueOf(s));
        //     bw.newLine();
        // }
        
        // bw.write(String.valueOf(s));
        bw.flush();
        bw.close();
    }
}