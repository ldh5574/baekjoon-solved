import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long totalCost = Long.parseLong(br.readLine());
        Long totalNum = Long.parseLong(br.readLine());
        int sum = 0;
        
        for (int i=0; i<totalNum; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Long cost = Long.parseLong(st.nextToken());
            Long num = Long.parseLong(st.nextToken());
            
            sum += (cost*num);
        }

        System.out.println(sum == totalCost ? "Yes" : "No");
    }
}