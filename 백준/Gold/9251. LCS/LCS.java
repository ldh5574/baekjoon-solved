import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int dap = 0;
        
        String a = bf.readLine();
        String b = bf.readLine();
        
        int dp[][] = new int[a.length()+1][b.length()+1];
        for(int i=1; i<=a.length(); i++){
            for(int j=1; j<=b.length(); j++){
                if(a.charAt(i-1) == b.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        dap = dp[a.length()][b.length()];
                    
        bw.write(String.valueOf( dap ));
        bw.flush();
        bw.close();
    }
}