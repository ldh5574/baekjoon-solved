import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            StringTokenizer st = new StringTokenizer(bf.readLine());    
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a+b+c == 0) break;
            
            List<Integer> d = new ArrayList<Integer>();
            d.add(a);
            d.add(b);
            d.add(c);
            Collections.sort(d, Collections.reverseOrder());
            if(d.get(0) >= d.get(1)+d.get(2)){
                bw.write("Invalid" + "\n");
                continue;
            }
            
            if(a==b && b==c){
                bw.write("Equilateral" + "\n");
            }else if (a!=b && b!=c && c!=a){
                bw.write("Scalene" + "\n");
            }else{
                bw.write("Isosceles" + "\n");
            }
            
        }
        
        
        
        bw.flush();
        bw.close();
    }
}