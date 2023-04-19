package Lab4;

public class Fifth {
    public static void main(String[] args) {
        int count = 0;
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (hour / 10 == minute % 10 && hour % 10 == minute / 10) {
                    count++;
                }
            }
        }
        System.out.println("Кількість симетричних комбінацій: " + count);
    }
}
