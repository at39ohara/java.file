package M01inout;
import java.nio.charset.Charset;
import java.util.Scanner;

class M1_9 {
    public static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in,Charset.forName("shift-JIS"));

        System.out.println("お名前を入力してください＞");
        String name = stdIn.nextLine();
        System.out.println("こんにちは" + name + "さん！");
    }
}