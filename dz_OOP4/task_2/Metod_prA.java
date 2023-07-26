// Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого типа
// и выводит его элементы на консоль.
// В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T.
// Затем мы используем цикл for-each, чтобы пройти по всем элементам массива и вывести их на консоль.
// В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них.
// В результате мы получаем вывод на консоль элементов каждого массива.
// Таким образом, обобщенные методы позволяют нам создавать код, который может работать
// с разными типами данных, обеспечивая повторное использование и гибкость.


package dz_OOP4.task_2;

import java.util.Scanner;

public class Metod_prA {
    static <T> void printArray(T[] array) {
        System.out.printf("Тим массива array: %s, elements:\n", array[0].getClass().getSimpleName());
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double[] dNumbers = new Double[5];
        for (int i = 0; i < dNumbers.length; i++)
        {
            System.out.println("Запишите числа с запятой: ");
            dNumbers[i] = input.nextDouble();
        }
        
        Scanner scan = new Scanner(System.in);
        Integer[] iNumbers = new Integer[5];
        for (int i = 0; i < iNumbers.length; i++)
        {
            System.out.println("Запишите целые числа: ");
            iNumbers[i] = scan.nextInt();
        }

       Float[] fNumbers = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        String[] strings = {"Cat", "Cow", "Horse", "Cat2", "Cow2"};

        printArray(iNumbers);
        System.out.println("___".repeat(20));

        printArray(dNumbers);
        System.out.println("___".repeat(20));

        printArray(fNumbers);
        System.out.println("___".repeat(20));

        printArray(strings);
        System.out.println("___".repeat(20));
    }
}
