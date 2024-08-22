import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int dap = 0;
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // String s = bf.readLine();
        // Integer n = Integer.parseInt(bf.readLine());
        Integer n = Integer.parseInt(st.nextToken());
        Integer k = Integer.parseInt(st.nextToken());
        
        Integer arr[][] = new Integer[n][4];
        Integer find[] = new Integer[4];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(bf.readLine());
            
            int th = Integer.parseInt(st.nextToken());
            arr[i][0] = th;
            
            for(int j=1; j<4; j++){
                int val = Integer.parseInt(st.nextToken());
                arr[i][j] = val;
            }
            
            if(th==k){
                find = arr[i].clone();
            }
            
            // Arrays.sort(arr[i], Collections.reverseOrder());
            // Arrays.sort(sortedArr);
            // int afterIndex = Arrays.asList(sortedArr).indexOf(arr[i][j]);
            // dap += Math.abs(afterIndex-j);
        }
        
        Arrays.sort(arr, (a,b) -> a[1] == b[1] ? (a[2]==b[2] ? a[3]-b[3] : a[2]-b[2]) : a[1]-b[1]);
        for(int i=n-1; i>=0; i--){
            if(find[1] == arr[i][1] && find[2] == arr[i][2] && find[3] == arr[i][3]){
                bw.write( String.valueOf(n-i) );
                break;
            }
        }
        
        // bw.write(String.valueOf(arr[1][0]));
        bw.flush();
        bw.close();
    }
}