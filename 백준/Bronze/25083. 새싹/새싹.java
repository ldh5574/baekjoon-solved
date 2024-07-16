import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // Integer n = Integer.parseInt(bf.readLine());
        
        String s = "         ,r'\"7" + "\n"+
                    "r`-_   ,'  ,/" + "\n"+
                    " \\. \". L_r'" + "\n"+
                    "   `~\\/" + "\n"+
                    "      |" + "\n"+
                    "      |";
        // while((s = bf.readLine()) != null){
        //     bw.write(String.valueOf(s));
        //     bw.newLine();
        // }
        
        bw.write(String.valueOf(s));
        bw.flush();
        bw.close();
    }
}