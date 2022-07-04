import java.util.Scanner;

public class prime20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so pt can in");
        int num = scanner.nextInt();
        int count = 0;
        int temp = 0;
        int i = 2;
        while (true) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            i++;
            if (count == 2) {
                System.out.println(i);
                temp++;
            }
            count = 0;
            if (temp == num) {
                break;
            }
        }
    }
}
