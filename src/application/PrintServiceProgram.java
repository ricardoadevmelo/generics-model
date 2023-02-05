package application;

import services.PrintService;

import java.util.Scanner;

public class PrintServiceProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();

        System.out.print("How many values? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();
        Integer integer = printService.first();
        System.out.println("First: " + integer);

        scanner.close();
    }
}