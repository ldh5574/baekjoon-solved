import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] myList = new int[n];
        for(int i=0; i<n; i++){
            myList[i] = i+1;
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int temp = myList[a-1];
            myList[a-1] = myList[b-1];
            myList[b-1] = temp;
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (int re : myList){
            bw.write(re + " ");    
        }
        bw.flush();
        bw.close();
    }
}