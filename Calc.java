import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа от 1 до 10:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if((a < 0) || (a > 10) || (b < 0) || (b > 10)){
            try {
                throw new ScannerException();
            } catch (ScannerException e) {
                System.out.println("Вы ввели неподходящее число");
            }
        }
        System.out.println("Выберите тип операции, который хотите произвести:");
        char operation = scanner.next().charAt(0);
        solve(a, b, operation);
    }
    public static int solve(int a, int b, char operation) {
        int answer = 0;
        if(operation == '+'){
            answer = a + b;
        }
        else if(operation == '-'){
            answer = a - b;
        }
        else if(operation == '*'){
            answer = a * b;
        }
        else if(operation == '/'){
            answer = a / b;
        }
        else if(operation == '%'){
            answer = a % b;
        }
        System.out.println("Ответ:" + answer);
        return answer;
    }
}
