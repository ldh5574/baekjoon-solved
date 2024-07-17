import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // int n = Integer.parseInt(br.readLine());

        String s = br.readLine();
        
        
        // 1차 고민
        // char c[] = new char[s.length()+1];
        // for(int i=0; i<s.length(); i++){
        //     c[i] = s.charAt(i);
        // }
        // for(int i=0; i<s.length(); i++){
        //     t.push(s.charAt(i));
        // }

        // 2차 고민
        // s = s.replace("()", "(1)");
        // System.out.println(s);
        // s = s.replace(")(", "+");
        // System.out.println(s);

        // 3차 고민
        for(int i=0; i<s.length()-1; i++){
            bw.write(s.charAt(i));
            if(s.charAt(i)=='(' && s.charAt(i+1)==')'){  
                bw.write("1");
                
            }
            if(s.charAt(i)==')' && s.charAt(i+1)=='('){  
                bw.write("+");
            }
        }
        bw.write(s.charAt(s.length()-1));
        bw.newLine();
        
        // List<Integer> list = Arrays.asList(m2);
        // int dap = Collections.frequency(list, min);
        
        // bw.write(String.valueOf(dap));
        bw.close();
    }
}
