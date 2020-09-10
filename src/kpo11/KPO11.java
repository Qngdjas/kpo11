/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo11;

import java.util.Scanner;

/**
 * Консольное приложение позволяет ввести пароль из командной строки и сравнить его со строкой-образцом
 * @author Qngdjas
 */
public class KPO11 {
    public static void main(String[] args) {
        //Объявление входной строки
        String passStr;
        //Счетчик, контролирующий вывод информации о введенных данных
        int numerator = 0;
        //Пока не введен верный пароль подбор продолжается
        do {
            //Если не ввели правильный пароль с первого раза, вывод соответстующего сообщений
            if (numerator > 0) {
            System.out.println("Введенные данные неверны, повторите ввод:");
            }
            //Подбираем пароль
            passStr = inputString();
            numerator++;
            //Проверяем правильность введенных данных
        } while (!check(passStr));
        //Если все правильно выходим из цикла, выводим соответствующее сообщение
        System.out.println("Пароль принят");
    }

    /**
     * Функция ввода данных с консоли
     * @return Возвращает строку
     */
    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        //Считываем информацию с консоли
        String str = sc.nextLine();
        //Возвращаем результат
        return str;
    }

    /**
     * Функция проверки введенных данных
     * @param str На вход подается строка, которая потом анализируется
     * @return Возвращает логическую переменную
     */
    public static boolean check(String str) {
        //Анализ совпадения строк и вывод результата, строка образец "pass"
        return str.equals("pass");
    }
}
