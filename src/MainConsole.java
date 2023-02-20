/**
 * File: MainConsole.java
 * Author: ChatGpt
 * Copyright: 2023 ?
 * Group: Szoft_I_1_N
 * Date: 2023.02.20
 * Github: https://github.com/MrBrown16/telteg
 * Licence: GNU GPL
 */

import java.util.Scanner;

public class MainConsole {
    public MainConsole() {
        System.out.println("Made by ChatGPT");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adja meg az A oldalt: ");
        double sideA = scanner.nextDouble();
        System.out.print("Adja meg a B oldalt: ");
        double sideB = scanner.nextDouble();

        double area = Teltek.calcArea(sideA, sideB);

        System.out.println("A telek területe: " + area);
    }
}
