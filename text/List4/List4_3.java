package text.List4;
import java.util.Random;
import java.util.Scanner;

public class List4_3 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int no = rand.nextInt(100);

        System.out.println("数当てゲーム開始！！");
        System.out.println("0~99の数を当ててください。");

        int x;
        do {
            System.out.print("いくつかな：");
            x = stdIn.nextInt(); /**intがたの数値を変数xに代入する */

            if (x > no)
                System.out.println("もっと小さな数だよ。");
            else if (x < no)
                System.out.println("もっと大きな数だよ。");
        } while (x != no);

        System.out.println("正解です。");
    }
}