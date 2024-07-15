import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // Integer n = Integer.parseInt(bf.readLine());
        
        String s = bf.readLine();
        String[] sList = s.trim().strip().split(" ");
        
        if(sList[0].equals("")){
            System.out.print("0");
        }else{
            bw.write(String.valueOf(sList.length));    
        }
        
                    
        bw.flush();
        bw.close();
    }
}