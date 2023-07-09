package org.example;

/*
4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст:");
        String s = sc.nextLine();
        if (s.equals("")) {
            throw new Exception("Строка пустая");
        }
        else {
            System.out.println("Текст: " + s);
        }
    }
}
