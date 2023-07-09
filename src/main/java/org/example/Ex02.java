package org.example;

/*
2. Если необходимо, исправьте данный код
    (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

    Исходный код:

    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }

*/

public class Ex02 {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8}; // Создал массив нужной длины, чтобы избежать ArrayIndexOutOfBoundsException

        try {
            int d = 1; // Заменил значение 0 на 1, чтобы избежать ArithmeticException
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // Добавил исключение на тот случай, если индекс за пределами массива
            System.out.println("Catching exception: " + e);
        }
    }
}
