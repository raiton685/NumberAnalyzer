package program;

import java.util.Scanner;

public class Analyzer {
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();


    public void evenOrNot() {
        if (number % 2 == 0) {
            System.out.println("Число: " + number + " - чётное.");
        } else {
            System.out.println("Число: " + number + " - нечётное.");
        }
    }

    public void numSign() {
        if (number > 0) {
            System.out.println("\n" + "Число: " + number + " - положительное.");
        } else if (number < 0) {
            System.out.println("\n" + "Число: " + number + " - отрицательное.");
        } else {
            System.out.println("\n" + "Число является нулём");
        }
    }

    public void howManyNumbers() {

        int result = 0;
        for (int i = number; i > 0; i /= 10) {
            result++;
        }
        System.out.println("\n" + "Количество цифр в указанном числе: " + result);
    }

    public void sumRange() {
        int start = 1;
        int result = 0;
        for (int i = start; i <= number; i++) {
            result += i;
        }
        System.out.println("\n" + "Сумма чисел от 1 до " + number + ": " + result);
    }

    public void multiplication() {
        System.out.println("\n" + "Таблица умножения для числа: " + number + "\n");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }

    public void factorial() {
        int result = 1;
        if (number >= 0 && number <= 12) {
            for (int i = 1; i <= number; i++) {
                result *= i;

            }
        }
        System.out.println("\nФакториал числа: " + number + " = " + (result));
    }
}

class ProgramTest {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Analyzer program = new Analyzer();
        program.evenOrNot();
        program.numSign();
        program.howManyNumbers();
        program.sumRange();
        program.multiplication();
        program.factorial();
    }
}