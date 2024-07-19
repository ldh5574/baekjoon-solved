import java.io.*;
import java.util.*;

public class Main {

    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, 1, 0, -1};
    public static int n = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(i+1);
                if(j!=n-1) System.out.print(" ");
            }
            if(i!=n-1) System.out.println();
        }
    }

}