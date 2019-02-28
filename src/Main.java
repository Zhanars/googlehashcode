import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argv) throws IOException{
        new Main().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("a_example.txt"));
        pw = new PrintWriter(new File("a_ output.txt"));
        int n = sc.nextInt(), vs = 0, hs = 0;
        String vertical[][] = new String[n][102];
        String horisontal[][] = new String[n][102];
        for (int i = 0; i <= n; i++){
            String str = sc.nextLine();
            String abc[] = str.split(" ");
            if (abc[0].equals("V")) {
                for (int j = 1; j < abc.length; j++) {
                    vertical[vs][j - 1] = abc[j];
                }
                vs++;
            }
            if (abc[0].equals("H")){
                for (int j = 1; j < abc.length; j++) {
                    horisontal[hs][j - 1] = abc[j];
                }
                hs++;
            }
        }

        pw.close();
    }

}