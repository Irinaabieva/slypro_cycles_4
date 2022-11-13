public class Main {
    public static void main(String[] args) {
        // Задание 3
        int sum = 0;
        int save = 15_000;
        for (int i = 1; i <= 108 ; i++){
            sum += save + (sum * 0.07);
            if (i % 6 == 0) {
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum);
            }
        }
    }
}