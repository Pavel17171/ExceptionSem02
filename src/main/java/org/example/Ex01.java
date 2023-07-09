package org.example;

/*
1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        и возвращает введенное значение. Ввод текста вместо числа не должно приводить
        к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println(getFloatNum());
    }

    public static float getFloatNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите десятичное число:");
        while (!sc.hasNextFloat()) {
            sc.nextLine();
            System.out.println("Некорректный ввод. Попробуйте снова");
        }
        return sc.nextFloat();
    }
}
