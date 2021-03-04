import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Calc {
    public static void main(String[] args){
        float arg1, arg2 = 0;
        char typeOperation = ' ';
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите аргумент:");
        arg1 = scanner.nextInt();
        while (true) {
            System.out.print("Введите вид операции [+,-,/,*, s - exit]:");
            if ((typeOperation = scanner.next().charAt(0)) == 's') {
                break;
            }
            System.out.print("Введите аргумент:");
            arg2 = scanner.nextInt();
            arg1 = Calculation(arg1, arg2, typeOperation); //Результат становится первым аргументом
            System.out.println("Результат:" + arg1);

        }
    }

    public static float Calculation(float aArg1, float aArg2, char aTypeOperation) {
        float result = 0;
        switch (aTypeOperation) {
            case '+':
                result = aArg1 + aArg2;
                break;
            case '-':
                result = aArg1 - aArg2;
                break;
            case '*':
                result = aArg1 * aArg2;
                break;
            case '/':
                result = aArg1 / aArg2;
                break;
            default:
                System.out.println("Ошибка выбора операции");
        }
        return result;
    }

    public static void Parsing(String aString) {
        Pattern pattern = Pattern.compile("^(\\d+)(\\D)(\\d+)(\\D+)");
        Matcher matcher = pattern.matcher(aString);
        if (matcher.find()) {
            System.out.println("Good!"+matcher.group(1)+matcher.group(2)+matcher.group(3));
        }
        else {
            System.out.println("Wrong string!");
        };
}
