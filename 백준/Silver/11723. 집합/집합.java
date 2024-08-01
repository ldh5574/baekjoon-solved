import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());    
        int n = Integer.parseInt(st.nextToken());
        
        Set<Integer> s = new HashSet<Integer>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(bf.readLine()); 
            String a = st.nextToken();
            
            if("add".equals(a)){
                int b = Integer.parseInt(st.nextToken());
                s.add(b);
            }
            if("remove".equals(a)){
                int b = Integer.parseInt(st.nextToken());
                s.remove(b);
            }
            if("check".equals(a)){
                int b = Integer.parseInt(st.nextToken());
                if(s.contains(b)) bw.write(1 + "\n");
                else bw.write(0 + "\n");
            }
            if("toggle".equals(a)){
                int b = Integer.parseInt(st.nextToken());
                if(s.contains(b)) s.remove(b);
                else s.add(b);
            }
            if("all".equals(a)){
               for(int j=0; j<20; j++) s.add(j+1);
            }
            if("empty".equals(a)){
               s.clear();
            }
            
            
        }
        
        // bw.write(String.valueOf(n));
        
        bw.flush();
        bw.close();
    }
}