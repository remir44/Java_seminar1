/* Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5 */
 
import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", triangle(i));
        System.out.printf("Факториал числа: %d\n", factorial(i));
        iScanner.close();
    }
    public static int triangle(int a) {
        return (a * (a + 1)) / 2;
    }
    public static long factorial(int number) {
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }
}