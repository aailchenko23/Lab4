package Lab4;

public class Second {
    public static void main(String[] args){
        int a = 2;
        int b = 2*a - 1;
        while(b < 5000) {
            System.out.println(b);
            a++;
            b = 2*a - 1;
        }
    }
}
