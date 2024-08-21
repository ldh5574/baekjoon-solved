import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int dap = 0;
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // String s = bf.readLine();
        Integer n = Integer.parseInt(bf.readLine());
        
        Integer arr[][] = new Integer[n][20];
        for(int i=0; i<n; i++){
            
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int index = Integer.parseInt(st.nextToken());
            for(int j=0; j<20; j++){
                int val = Integer.parseInt(st.nextToken());
                arr[i][j] = val;
            }
            
            dap = 0;
            // Arrays.sort(arr[i], Collections.reverseOrder());
            // Arrays.sort(sortedArr);
            // int afterIndex = Arrays.asList(sortedArr).indexOf(arr[i][j]);
            // dap += Math.abs(afterIndex-j);
            
            for(int x=0; x<20; x++){
                for(int y=0; y<x; y++){
                    if(arr[i][x] < arr[i][y]){
                        dap++;
                    }
                }
            }
            bw.write(String.valueOf(i+1 + " " + dap) + "\n");
        }
        
        // bw.write(String.valueOf(arr[1][0]));
        bw.flush();
        bw.close();
    }
}