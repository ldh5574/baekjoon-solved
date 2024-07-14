import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());
        Long c = Long.parseLong(st.nextToken());
        int d = 0;
        
        if (a==b && b==c){
            d += 10000;
            d += (1000*a);
        }
        else if (a==b || a==c){
            d += 1000;
            d += (100 * a);
        }
        else if (b==c){
            d += 1000;
            d += (100 * b);
        }
        else{
            d += (100*Math.max(Math.max(a,b), c));
        }
        
        System.out.println(d);
    }
}