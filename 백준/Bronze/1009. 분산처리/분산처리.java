import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int n = Integer.parseInt(bf.readLine());
        
        
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int r = sol(a,b,1);
            
            bw.write(String.valueOf(r) + "\n");    
        }
        
        bw.flush();
        bw.close();
    }
    
    
    public static int sol(int a, int b, int r){
        r = r % 10;
        r = (r * a) % 10;
        b--;
        // System.out.println("a,b:"+a+":"+b+":"+r);
        if(b>0){
            return sol(a,b,r);
        }
        else{
            if(r==0) r=10;
            return r;
        }
    }
    

}