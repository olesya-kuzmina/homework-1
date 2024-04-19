public class Task07 {
    public static final int YEAR_PERCENT = 10;

    public static void main(String[] args) {
        System.out.println("Задание №7:");
        int money = 34000;
        int deposit = money + ((money * YEAR_PERCENT) * 2) / 100;
        System.out.println("Итоговая сумма вклада в банке через два года будет равна " + deposit);



    }
}
