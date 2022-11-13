public class Main {
    public static void main(String[] args) {
        // Задание 1
        int sum = 0;
        int save = 15_000;
        for (int i = 1; sum <= 12_000_000; i++){
            sum += save + (sum * 0.07);
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum);
        }
    }
}