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
    }
}