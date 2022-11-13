public class Main {
    public static void main(String[] args) {
        //Задание 1
        int save = 15000;
        int sum = 0;
        int i = 0;
        while (sum <= 2_459_000) {
            sum = sum + sum/100;
            sum = sum + save;
            i++;
    }
        System.out.println("Месяц " + i + " , сумма накоплений равна " + sum + " рублей");
    }
}