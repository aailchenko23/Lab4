package Lab4;

public class First {
    public static void main(String[] args) {
        //Цикл for
        for (int x = 500; x <= 650; x += 10) {
            System.out.println(x);
        }
        //Цикл while
        int a;
        a = 500;
        while (a <= 650) {
            System.out.println(a);
            a += 10;
        }
        //Цикл do-while
        int b = 500;
        do {
            System.out.println(b);
            b += 10;
        } while (b <= 650);

    }
}
