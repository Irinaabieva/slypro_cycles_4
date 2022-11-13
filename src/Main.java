public class Main {
    public static void main(String[] args) {
        int start = 1822;
        int end = 2100;
        while (start <= end) {
            start++;
            if (start % 79 == 0) {
            System.out.println(start);
            }
        }
        // Задание 2
        int j = 2;
        for (int i = 1; i <= 10; i++) {
            int result = i * j;
            System.out.println("2 * " + i + " = " + result);
        }
    }
}