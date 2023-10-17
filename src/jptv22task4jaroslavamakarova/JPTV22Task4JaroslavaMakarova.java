/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22task4jaroslavamakarova;

import java.util.Arrays;
/**
 *
 * @author pupil
 */
public class JPTV22Task4JaroslavaMakarova {
public static void main(String[] args) {
        int[] array = new int[100];

        // Заполняем массив случайными нечетными числами от 0 до 100
        for (int i = 0; i < array.length; i++) {
            int randomNumber = (int) (Math.random() * 51) * 2 + 1; // Генерация нечетных чисел от 1 до 101
            array[i] = randomNumber;
        }

        // Выводим массив по 10 чисел в одной строке
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        // Сортируем массив
        Arrays.sort(array);

        // Вычисляем среднее арифметическое
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        double average = sum / array.length;

        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nСреднее арифметическое: " + average);
    }
}

