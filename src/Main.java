import java.util.*;
import java.io.*;

public class Main{
    PrintWriter pw;

    {
        try {
            pw = new PrintWriter(new File("a_ output.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    Scanner sc;

    {
        try {
            sc = new Scanner(new File("a_example.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    int n = 0, vs = 0, hs = 0;
    String vertical[][] = new String[100000][102];
    String horisontal[][] = new String[100000][102];
    boolean slide[][] = new boolean[100000][100000];
    public int common(int a, int b){
        int result = 0;
        for (int i = 1; i <= Integer.parseInt(vertical[a][0]); i++){
            for (int j = 1; j <= Integer.parseInt(vertical[b][0]); j++){
                if (vertical[a][i].equals(vertical[b][j])){
                    result++;
                }
            }
        }
        return result;
    }

    public void HtoV(){

    }

    public static void main(String[] argv){
        new Main().read();
    }
    public void read(){
        n = sc.nextInt();
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
    }
    public void write(){
        pw.print("123");
        pw.close();
    }

    public void solve(){

    }
}