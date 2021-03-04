import java.util.Scanner;

public class Calculix {
    public static void main(String[] args) {
            // Обрабатываем ввод первого Операнда
            Scanner scanner = new Scanner(System.in);
            System.out.println("Вас приветствует Calculix.");
            System.out.println("Введите первое число:");
            float operand1 = (float) scanner.nextInt();
            System.out.println("Очень хорошо!");
            // Обрабатываем ввод второго Операнда
        System.out.println("Teper vvedi vtoroe chislo:");
        var vvodOp2 = 0;
        float operand2=0;
        while (vvodOp2 == 0) {
            operand2 = (float) scanner.nextInt();
            if ((operand2 <= 100) && (operand2 > 0)) {
                vvodOp2 = 1;
            } else if (operand2 > 100) {
                System.out.println("Слишком большое число");
            } else if (operand2 < 1) {
                System.out.println("Слишком маленькое число");
            }
        }
        // Ввод операции. Готов только оператор плюса.
        System.out.println("Prekrasno. Teper vvedi operaciu. Dopustimye varianty: + , - , * ili / ...");
        char operation = scanner.next().charAt(0);
        float operand = 0;
        if (operation == '+') {
            operand = operand1 + operand2;
        }
        System.out.println("Pravilnyi otvet" + operand);
    }
}