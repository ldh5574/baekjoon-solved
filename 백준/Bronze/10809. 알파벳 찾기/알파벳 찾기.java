import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // Integer n = Integer.parseInt(bf.readLine());
        
        int[] arr = new int[26];
        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }
        
        String s = bf.readLine();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(arr[ch-'a'] == -1){
                arr[ch-'a'] = i;                
            }
        }
        
        for(int i=0; i<arr.length; i++){
            bw.write(arr[i] + " " );
        }
        bw.flush();
        bw.close();
    }
}