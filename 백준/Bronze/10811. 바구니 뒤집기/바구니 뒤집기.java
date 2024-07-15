import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] list = new int[n+1];
        for(int a=1; a<list.length; a++){
            list[a] = a;
        }
        
        for(int a=0; a<m; a++){
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());       
            int[] tobe = list.clone();
            
            for(int b=i; b<=j; b++){
                tobe[b] = list[j-(b-i)];
            }
            list = tobe.clone();
        }
        
        for(int a=1; a<list.length; a++){
            bw.write(list[a] + " ");
        }
        

        bw.flush();
        bw.close();
    }
}