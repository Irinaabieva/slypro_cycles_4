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
        // Задание 3
        int sum = 0;
        int save = 15_000;
        for (int i = 1; i <= 108 ; i++){
            sum += save + (sum * 0.07);
            if (i % 6 == 0) {
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum);
            }
        }
        // Задание 4
        int i = 7;
        while (i <= 31) {
            if (i % 7 == 0) {
                System.out.println("Сегодня " + i + "-е число. Необходимо подготовить отчет");
            }
            i++;
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
        //Задание 2
        int number = 1;
        while (number <=10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (number = 10; number >= 1; number--){
            System.out.print(number + " ");
        }
        //Задание 3
        int population = 12_000_000;
        int bornInYear = 17;
        int mortalityInYear = 8;
        int diff = bornInYear - mortalityInYear;
        for (int year = 1; year <= 10; year++) {
            population += population * diff/1000;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
    }
}