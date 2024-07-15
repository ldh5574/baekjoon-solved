import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int n = Integer.parseInt(st.nextToken());
        // int m = Integer.parseInt(st.nextToken());
        
        int[] myList = new int[30];
        
        for(int i=0; i<28; i++){
           int n = Integer.parseInt(bf.readLine());
           myList[n-1] = 1;
        }
        for(int i=0; i<30; i++){
            if(myList[i] != 1){
                bw.write(i+1 + "\n"); 
            }
        }


        bw.flush();
        bw.close();
    }
}