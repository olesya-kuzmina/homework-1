public class Task09 {
    public static void main(String[] args) {
        System.out.println("Задание №9:");
        double number = 5.6;
        String securityAnswer = ((number - (int) number) == 0) ? "integer number!" : "a fractional number!";
        System.out.println(securityAnswer);
    }
}
