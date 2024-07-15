import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        String s = bf.readLine();
        Integer n = Integer.parseInt(bf.readLine())-1;
        
        bw.write(String.valueOf(s.charAt(n)));
        bw.flush();
        bw.close();
    }
}