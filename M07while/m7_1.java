package M07while;

class M7_1 {
    public static void main (String[] args){
        int x = 1;
        int y = 1;

        while (x < 100) {
            x++;
            y += x;
        }
        System.out.print("合計：" + y);
    }    
}
