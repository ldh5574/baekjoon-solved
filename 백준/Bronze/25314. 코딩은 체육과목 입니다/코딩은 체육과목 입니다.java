import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        Long n = Long.parseLong(br.readLine());
        
        for (int i=0; i<(n/4); i++){
            System.out.print("long ");
        }
        
        System.out.println("int");
    }
}