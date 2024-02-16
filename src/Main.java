import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите, пожалуйста, первое число");
        int firstNum  = Integer.parseInt(scanner.next());
        System.out.println("Введите, пожалуйста, второе число");
        int secondNum  = Integer.parseInt(scanner.next());

        System.out.println("Результут сравнения: ");
        System.out.println(comparateNum(firstNum, secondNum));

        System.out.println("Результат математических операций: ");
        System.out.println(plusNum(firstNum, secondNum));
        System.out.println(minusNum(firstNum, secondNum));
        System.out.println(multiplyNum(firstNum, secondNum));
        System.out.println(divideNum(firstNum, secondNum));
        
    }

    private static String divideNum(int firstNum, int secondNum) {
        if (firstNum % secondNum == 0) {
            return firstNum + " : " + secondNum + " = " + firstNum / secondNum;
        } else {
            return firstNum + " : " + secondNum + " = " + ((double) firstNum / secondNum);
        }
    }

    private static String multiplyNum(int firstNum, int secondNum) {
        return firstNum + " * " + secondNum + " = " + (firstNum * secondNum);
    }

    private static String minusNum(int firstNum, int secondNum) {
        return firstNum + " - " + secondNum + " = " + (firstNum - secondNum);
    }

    private static String plusNum(int firstNum, int secondNum) {
        return firstNum + " + " + secondNum + " = " + (firstNum + secondNum);
    }

    private static String comparateNum(int firstNum, int secondNum) {
        String result = " ? ";
        
        if (firstNum > secondNum) {
            result = " > ";
        }
        if (firstNum < secondNum) {
            result = " < ";
        } 
        if (firstNum == secondNum){
            result = " = ";
        }

        return firstNum + result + secondNum;
    }
}