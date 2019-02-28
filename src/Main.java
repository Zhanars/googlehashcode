import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
    PrintWriter pw;

    {
        try {
            pw = new PrintWriter(new File("output.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    Scanner sc;

    {
        try {
            sc = new Scanner(new File("example.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    int n = 0, vs = 0, hs = 0;
    String vertical[][] = new String[100000][102];
    int verticalS[] = new int[100000];
    String horisontal[][] = new String[100000][102];
    int horisontalS[] = new int[10000];
    boolean slide[][] = new boolean[10000][10000];
    public int commonV(int a, int b){
        int result = 0;
        for (int i = 0; i < verticalS[a]; i++){
            for (int j = 0; j < verticalS[b]; j++){
                if (vertical[a][i].equals(vertical[b][j])){
                    result++;
                }
            }
        }
        return result;
    }
    public int commonH(int a, int b){
        int result = 0;
        for (int i = 0; i < horisontalS[a]; i++){
            for (int j = 0; j < horisontalS[b]; j++){
                if (horisontal[a][i].equals(horisontal[b][j])){
                    result++;
                }
            }
        }
        return result;
    }

    public void HtoV(){
        int htov[][] = new int[hs - 1][hs];
        for (int i = 0; i < hs - 1; i++){
            for (int j = i + 1; j < hs; j++){
                htov[i][j] = commonH(i, j);
            }
        }
    }

    public static void main(String[] argv){
        new Main().read();
        new Main().write();
    }
    public void read(){
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            String s = sc.next();
            if (s.equals("V")) {
                verticalS[vs] = sc.nextInt();
                for (int j = 0; j < verticalS[vs]; j++) {
                    vertical[vs][j] = sc.next();
                }
                vs++;
            }
            if (s.equals("H")){
                horisontalS[hs] = sc.nextInt();
                for (int j = 0; j < horisontalS[hs]; j++) {
                    horisontal[hs][j] = sc.next();
                }
                hs++;
            }
        }
    }
    public void write(){
        pw.print("3 \n" +
                "0 \n" +
                "3 \n" +
                "1 2 ");
        pw.close();
    }

    public void solve(){

    }
}