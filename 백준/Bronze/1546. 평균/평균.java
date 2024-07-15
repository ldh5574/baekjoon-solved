import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(bf.readLine());
        Float m = 0F;
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(st.nextToken());
            list.add(temp);
            m = Math.max(m, temp);
        }
        
        Float sum = 0F;
        for(int i=0; i<n; i++){
            sum += (list.get(i)/m*100);
        }
        bw.write(String.valueOf(sum/n));
        bw.flush();
        bw.close();
    }
}