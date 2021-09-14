/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        System.out.printf("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Hello, %s, nice to meet you!", name);

    }
}
