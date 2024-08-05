package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/*
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println((n1 + n2 + n3) / 3);
    }
}
