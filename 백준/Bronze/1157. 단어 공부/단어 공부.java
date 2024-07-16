import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // Integer n = Integer.parseInt(bf.readLine());
        
        String s = bf.readLine();
        int arr[] = new int['Z'-'A'+1];
        
        for(int i=0; i<s.length(); i++){
            int n = (int)s.charAt(i);
            if( n >= 'a' ){
                n -= 32;
            }
            n -= 'A';
            arr[n]+=1;
            // bw.newLine();
        }

        char maxCh = (char)0;
        int chCnt = -1;
        int check = 0;
        for(int i=0; i<26; i++){
            if(chCnt < arr[i]){
                chCnt = arr[i];
                maxCh = (char)(i+'A');
                check = 0;
            }
            if(chCnt == arr[i]){
                check++;
            }
        }     
        if(check > 1){
            bw.write("?");    
        }else{
            bw.write(maxCh);    
        }
        
        
        // while((s = bf.readLine()) != null){
        //     bw.write(String.valueOf(s));
        //     bw.newLine();
        // }
        
        // bw.write(String.valueOf(s));
        bw.flush();
        bw.close();
    }
}