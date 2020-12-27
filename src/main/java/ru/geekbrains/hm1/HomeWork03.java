package ru.geekbrains.hm1;

import java.util.Scanner;

public class HomeWork03 {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int numComputer =  (int) ( Math.random() * 10 );
        System.out.println(numComputer);

        do {

            System.out.println("Угадай число от 0 до 9 с 3-х попыток");
            for (int i = 3; i > 0; i--) {
                System.out.println("Твой ответ:");
                int numGamer = scanner.nextInt();
                if (numGamer == numComputer) {
                    System.out.println("Ура!");
                    break;
                }
                System.out.println(numGamer < numComputer ? "оно больше! " : "оно меньше! ");
                System.out.println((i - 1) > 0 ? " осталось " + (i - 1) + " попытки." : "Попыток не осталось - game over!");
            }
            System.out.println("Еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");

        }
        while (scanner.nextInt() == 1);
    }
}







