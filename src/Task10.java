public class Task10 {
    public static final int HEIGHT = 170;
    public static final int WEIGHT = 64;

    public static void main(String[] args) {
        System.out.println("Задание 10:");
        int idealWeight = HEIGHT - 110;
        int nWeight = idealWeight - WEIGHT;
        System.out.println("Для идеального веса Вам нужно: " + nWeight + " кг");
    }
}
