package Lab4;

public class Third {
    public static void main(String[] args) {
        int x = 10;
        System.out.print("Додатні дільники числа " + x + ": ");
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
