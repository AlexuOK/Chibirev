import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите, пожалуйста, первую строку: ");
        String str1 = scanner.next();

        System.out.println("Введите, пожалуйста, вторую строку: ");
        String str2 = scanner.next();

        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}