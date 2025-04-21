package task_2;
import java.util.Scanner;

public class Task2Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();
        
        compareValues(a, b);
        
        System.out.println("\nРезультаты операций:");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
            System.out.println(a + " / " + b + " (с остатком) = " + ((double)a / b));
        } else {
            System.out.println("Деление на ноль невозможно!");
        }
    	System.out.print("\nВведите первую строку: ");
        scanner.nextLine();
        String strA = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String strB = scanner.nextLine();
        if (strA.equals(strB)) {
            System.out.println("\nСтроки идентичны");
        } else {
            System.out.println("\nСтроки не идентичны");
        }
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\nЧётные числа из массива:");
        
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        scanner.close();
    }
	
	public static void compareValues(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
	}
}
