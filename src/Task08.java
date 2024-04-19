import java.util.Scanner;

public class Task08 {
    public static final double V = 335.0;
    public static void main(String[] args) {
        System.out.println("Задание №8:");
        double t, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите временной промежуток между вспышкой молнии и громом (секунд): ");
        t = sc.nextDouble();
        s = t * V;
        System.out.println("Расстояние до места удара молнии: " + s + " метров");


    }
    }
