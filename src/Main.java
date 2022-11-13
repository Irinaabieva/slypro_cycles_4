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